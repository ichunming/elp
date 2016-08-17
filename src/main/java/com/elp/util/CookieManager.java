/**
 * Cookie管理
 * 2016/08/17 ming
 */
package com.elp.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CookieManager {
	private static Logger logger = LoggerFactory.getLogger(SessionManager.class);
	
	private static int CookieDefaultMaxAge = 60 * 60 * 24 * 30;

	/**
	 * 设置cookie
	 * @param response
	 * @param key
	 * @param value
	 */
	public static void addCookie(HttpServletResponse response, String key, String value) {
		addCookie(response, key, value, CookieDefaultMaxAge);
	}

	/**
	 * 设置cookie
	 * @param response
	 * @param key
	 * @param value
	 * @param age
	 */
	public static void addCookie(HttpServletResponse response, String key, String value, int age) {
		// 设置cookie
		logger.debug("设置cookie");

		if(!checkKey(key)) {
			return;
		}
		
		// 设置cookie
		logger.debug("设置cookie:" + key);
		Cookie cookie = new Cookie(key, value);
		cookie.setMaxAge(age);
		response.addCookie(cookie);
	}
	
	/**
	 * 取得cookie
	 * @param request
	 * @param key
	 * @return
	 */
	public static String getCookie(HttpServletRequest request, String key) {
		// 取得cookie
		logger.debug("取得cookie");
		
		// check key
		if(!checkKey(key)) {
			return null;
		}
		
		// 遍历cookie
		logger.debug("遍历cookie");
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie : cookies){
		    if(key.equals(cookie.getName())) {
		    	// 找到key对应cookie
		    	logger.debug("找到key对应cookie");
		    	return cookie.getValue();
		    }
		}
		
		// 未找到key对应cookie
		logger.debug("未找到key对应cookie");
		return null;
	}
	
	/**
	 * 删除cookie
	 * @param response
	 * @param key
	 */
	public static void deleteCookie(HttpServletResponse response, String key) {
		// 删除cookie
		logger.debug("删除cookie");
		addCookie(response, key, null, 0);
	}
	
	private static boolean checkKey(String key) {
		// check key
		logger.debug("check key");
		if(null == key || "".equals(key)) {
			return false;
		}
		
		return true;
	}
}
