/**
 * Register Controller
 * ming 2016/07/22
 */
package com.elp.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.web.servlet.ShiroHttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.elp.consts.AppConst;
import com.elp.model.User;
import com.elp.service.UserService;
import com.elp.util.CookieManager;

@Controller
public class RegisterController {
	
	private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(HttpServletResponse response) {
		// 清空Cookie
		logger.debug("清空Cookie");
		CookieManager.deleteCookie(response, AppConst.REMEMBER_ME_PARAMETER);
		CookieManager.deleteCookie(response, ShiroHttpSession.DEFAULT_SESSION_ID_NAME);
		
		// 跳转注册页
		logger.debug("跳转注册页");
		return "unmanager/register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@RequestParam("email")String email, @RequestParam("password")String password, Model model) {
		String eMsg = "";
		
		// 邮箱，密码非空check TODO
		if ("".equals(email) || "".equals(password)) {
			eMsg = "邮箱/密码不能为空";
			model.addAttribute("eMsg", eMsg);
			return "unmanager/register";
		}
		
		// 邮箱已存在check
		logger.debug("邮箱已存在check...");
		if(userService.emailExist(email)) {
			// 邮箱已存在
			logger.debug("邮箱已存在");
			eMsg = "邮箱已存在";
			model.addAttribute("eMsg", eMsg);
			
			return "unmanager/register";
		}
		
		// 封装用户信息
		logger.debug("封装用户信息...");
		User user = new User(email, password, AppConst.ACCOUNT_STATUS_ACTIVE);
		
		// 创建用户
		logger.debug("创建用户...");
		userService.createAccount(user);
		
		// 返回登入页
		logger.debug("用户创建成功");
		return "unmanager/login";
	}
}
