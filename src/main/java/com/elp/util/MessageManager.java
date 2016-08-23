/**
 * MessageManager
 * 2015/11/14 chunming
 */
package com.elp.util;

import java.util.Map;

import com.elp.consts.AppConst;
import com.elp.entity.CustomMessage;

public class MessageManager {
	// message map
	private static Map<String, String> messageMap;
	
	/**
	 * 加载Message properties文件
	 * @param messagePath
	 */
	public static void loadMessage(String messagePath) {
		messageMap = PropUtil.getPropMap(messagePath);
	}
	
	// get info message
	public static CustomMessage getInfoMsg(String code) {
		return getMsg(code, AppConst.CODE_INFO);
	}
	
	// get warning message
	public static CustomMessage getWarnMsg(String code) {
		return getMsg(code, AppConst.CODE_WARING);
	}
	
	// get error message
	public static CustomMessage getErrorMsg(String code) {
		return getMsg(code, AppConst.CODE_EXCEPTION);
	}
	
	// get info message with parameters
	public static CustomMessage getInfoMsg(String code, String[] params) {
		return getMsg(code, AppConst.CODE_INFO, params);
	}
	
	// get warning message with parameters
	public static CustomMessage getWarnMsg(String code, String[] params) {
		return getMsg(code, AppConst.CODE_WARING, params);
	}
	
	// get error message with parameters
	public static CustomMessage getErrorMsg(String code, String[] params) {
		return getMsg(code, AppConst.CODE_EXCEPTION, params);
	}
	
	// get message
	private static CustomMessage getMsg(String code, String type) {
		CustomMessage cm = new CustomMessage();
		cm.setCode(type);
		cm.setMessage(messageMap.get(code));
		return cm;
	}
	
	// get message with parameters
	private static CustomMessage getMsg(String code, String type, String[] params) {
		String msg = messageMap.get(code);
		if(null != msg) {
			for(int i = 0; i < params.length; i++) {
				msg = msg.replace("{" + i + "}", params[i]);
			}
		}
		CustomMessage cm = new CustomMessage();
		cm.setCode(type);
		cm.setMessage(msg);
		return cm;
	}
}
