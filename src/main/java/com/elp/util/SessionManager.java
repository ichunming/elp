/**
 * Session管理
 * 2016/08/17 ming
 */
package com.elp.util;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SessionManager {

	private static Logger logger = LoggerFactory.getLogger(SessionManager.class);

	/**
	 * 设置Attribute
	 * @param key
	 * @param value
	 */
	public static void setAttribute(String key, Object value) {

		logger.debug("设置Session Attribute：" + "(" + key + "," + value +")");

		// 取得当前用户
		logger.debug("取得当前用户");
		Subject currentUser = SecurityUtils.getSubject();

		// 设置Session Attribute
		logger.debug("设置Session Attribute");
		currentUser.getSession().setAttribute(key, value);
	}

	/**
	 * 取得Attribute
	 * @param key
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T>T getAttribute(String key) {

		logger.debug("取得Session Attribute：" + key);
		
		// 取得当前用户
		logger.debug("取得当前用户");
		Subject currentUser = SecurityUtils.getSubject();

		// 取得Session Attribute
		logger.debug("取得Session Attribute");
		return (T)currentUser.getSession().getAttribute(key);
	}
	
	/**
	 * 删除Attribute
	 * @param key
	 * @return
	 */
	public static void deleteAttribute(String key) {

		// 删除Session Attribute
		logger.debug("删除Session Attribute：");

		// 取得当前用户
		logger.debug("取得当前用户");
		Subject currentUser = SecurityUtils.getSubject();

		// 取得Session Attribute
		logger.debug("取得Session Attribute");
		currentUser.getSession().getAttribute(key);
	}
	
	/**
	 * 检查是否存在Attribute
	 * @param key
	 * @return
	 */
	public static boolean hasAttribute(String key) {
		
		logger.debug("检查是否存在Attribute");
		
		// check key
		logger.debug("check key");
		if(null == key || "".equals(key)) {
			return false;
		}
		
		// 取得当前用户
		logger.debug("取得当前用户");
		Subject currentUser = SecurityUtils.getSubject();

		// 取得Session Attribute
		logger.debug("取得Session Attribute");
		Object value = currentUser.getSession().getAttribute(key);
		
		return null != value;
	}
}
