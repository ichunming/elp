package com.elp.controller.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.elp.entity.BaseResult;
import com.elp.model.UserInfo;
import com.elp.service.UserService;

@Controller
@ResponseBody
@RequestMapping("/api/user")
public class UserControllerApi {
	private Logger logger = LoggerFactory.getLogger(UserControllerApi.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="userInfo/retrieve/{uid}", method={RequestMethod.POST,RequestMethod.GET})
	public BaseResult getUserInfo(@PathVariable Integer uid) {
		// 取得用户信息
		logger.debug("取得用户信息");
		UserInfo userInfo = userService.findUserInfo(uid);
		
		// 返回用户信息
		logger.debug("返回用户信息");
		BaseResult result = new BaseResult();
		result.setData(userInfo);
		
		return result;
	}
}