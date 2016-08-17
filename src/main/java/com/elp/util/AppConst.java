/**
 * Helper用常量
 * ming 2016/07/20
 */
package com.elp.util;

public class AppConst {
	
	/**
	 * 加密算法
	 */
	public static final String ALGORITHM_NAME = "MD5";
	
	/**
	 * 加密迭代次数
	 */
	public static final int HASH_ITERATIONS = 4;
	
	/**
	 * 最大重复登入次数
	 */
	public static final int MAX_RETRY_COUNT = 5;
	
	/**
	 * 用户帐户状态
	 * 0：未激活
	 * 1：正常
	 * 2：锁定
	 * 3：删除
	 */
	// 未激活
	public static int ACCOUNT_STATUS_INVALID = 0;
	
	// 正常
	public static int ACCOUNT_STATUS_ACTIVE = 1;
	
	// 锁定
	public static int ACCOUNT_STATUS_LOCKED = 2;
	
	// 删除
	public static int ACCOUNT_STATUS_DELETED = 3;
	
	/**
	 * rememberMe 参数名
	 */
	public static String REMEMBER_ME_PARAMETER = "rememberMe";
}
