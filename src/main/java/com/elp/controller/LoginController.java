package com.elp.controller;

import javax.servlet.ServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.ExpiredCredentialsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.elp.consts.AppConst;
import com.elp.consts.Session;
import com.elp.entity.CustomMessage;
import com.elp.model.User;
import com.elp.service.UserService;
import com.elp.util.MessageManager;
import com.elp.util.SessionManager;

@Controller
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {

		// 获取当前用户
		logger.debug("获取当前用户...");
		Subject currentUser = SecurityUtils.getSubject();
		
		// 用户登入状态判断
		if (currentUser.isRemembered()) { 
			// 已记住用户
			logger.debug("已记住用户（RememberMe）");

			// 创建session
			logger.debug("创建session");
			User user = userService.findAccountByEmail((String)currentUser.getPrincipal());
			SessionManager.setAttribute(Session.UID, user.getId());
			SessionManager.setAttribute(Session.EMAIL, user.getEmail());
			
			// 跳转home页面
			logger.debug("跳转home页面");
			return "redirect:/home";
			
		} else if(currentUser.isAuthenticated()) {
			// 用户已登入，home页面跳转
			logger.debug("用户已登入，home页面跳转");
			return "redirect:/home";
		}

		// 登入页面跳转
		logger.debug("登入页面跳转");
		return "unmanager/login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout() {
		// 登出处理
		logger.debug("登出处理...");
		Subject currentUser = SecurityUtils.getSubject();
		currentUser.logout();

		// 登入页面跳转
		logger.debug("登入页面跳转");
		return "redirect:/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("email") String email, @RequestParam("password") String password,
			ServletRequest request, Model model) {
		CustomMessage cMsg = null;

		// 邮箱，密码非空check TODO
		if ("".equals(email) || "".equals(password)) {
			cMsg = MessageManager.getWarnMsg("WLO001");
			model.addAttribute("cMsg", cMsg);
			return "unmanager/login";
		}

		// 获取当前用户
		logger.debug("获取当前用户...");
		Subject currentUser = SecurityUtils.getSubject();

		// 创建用户登录凭证
		logger.debug("创建用户登入凭证...");
		boolean rememberMe = WebUtils.isTrue(request, AppConst.REMEMBER_ME_PARAMETER);
		UsernamePasswordToken token = new UsernamePasswordToken(email, password, rememberMe);
		
		// 登入
		try {
			logger.debug("登入...");
			currentUser.login(token);
		} catch (UnknownAccountException e) {
			// 用户名错误
			logger.debug("用户名错误");
			cMsg = MessageManager.getWarnMsg("WLO002");
		} catch (IncorrectCredentialsException e) {
			// 密码错误
			logger.debug("密码错误");
			cMsg = MessageManager.getWarnMsg("WLO003");
		} catch (LockedAccountException e) {
			// 帐号被锁
			logger.debug("帐号被锁");
			cMsg = MessageManager.getWarnMsg("WLO004");
		} catch (ExpiredCredentialsException e) {
			// 帐号未激活
			logger.debug("帐号未激活");
			cMsg = MessageManager.getWarnMsg("WLO005");
		} catch (DisabledAccountException e) {
			// 帐号被删除
			logger.debug("帐号被删除");
			cMsg = MessageManager.getWarnMsg("WLO006");
		} catch (ExcessiveAttemptsException e) {
			// 重复登入次数超过规定次数
			logger.debug("重复登入次数超过规定次数");
			cMsg = MessageManager.getWarnMsg("WLO007");
		} catch (AuthenticationException e) {
			// 认证异常 TODO
			logger.debug("认证异常");
			cMsg = MessageManager.getErrorMsg("ELO001");
		}
		
		// 认证
		if (currentUser.isAuthenticated()) {
			logger.debug("认证通过...");
		} else {
			logger.debug("认证未通过...");

			// 添加提示信息，跳转登入页
			logger.debug("跳转登入页");
			model.addAttribute("cMsg", cMsg);
			return "unmanager/login";
		}

		// 跳转首页
		logger.debug("跳转首页");
		return "redirect:/home";
	}
}
