package com.elp.controller.api;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.elp.entity.BaseResult;
import com.elp.util.SpringContextUtil;

@Controller
@ResponseBody
@RequestMapping("/api/emojis")
public class EmojiControllerApi {
	private Logger logger = LoggerFactory.getLogger(EmojiControllerApi.class);
	
	@RequestMapping(value="retrieve", method={RequestMethod.POST,RequestMethod.GET})
	public BaseResult getUserInfo() {
		// 取得emojis
		logger.debug("取得emojis");
		Map<String, String> emojis = SpringContextUtil.getAttribute("emojis");

		// 返回emojis
		logger.debug("返回emojis");
		BaseResult result = new BaseResult();
		result.setData(emojis);
		
		return result;
	}
}