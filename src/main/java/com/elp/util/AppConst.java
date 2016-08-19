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
	
	/**
	 * 角色状态
	 * 0：正常
	 * 1：锁定
	 * 2：删除
	 */
	// 正常
	public static int ROLE_STATUS_ACTIVE = 0;
	
	// 锁定
	public static int ROLE_STATUS_LOCKED = 1;

	// 删除
	public static int ROLE_STATUS_DELETED = 2;
	
	/**
	 * 权限状态
	 * 0：正常
	 * 1：锁定
	 * 2：删除
	 */
	// 正常
	public static int PERMISSION_STATUS_ACTIVE = 0;
	
	// 锁定
	public static int PERMISSION_STATUS_LOCKED = 1;

	// 删除
	public static int PERMISSION_STATUS_DELETED = 2;
	
	/**
	 * 系统预留用户信息状态
	 * 0：未使用
	 * 1：已使用
	 */
	// 未使用
	public static int RESERVE_USER_INFO_STATUS_FREE = 0;
	
	// 已使用
	public static int RESERVE_USER_INFO_STATUS_USED = 1;
	
	/**
	 * 邀请码状态
	 * 0：未审核
	 * 1：同意
	 * 2：拒绝
	 */
	// 未审核
	public static int APPLY_CODE_STATUS_UNCHECK = 0;
	
	// 同意
	public static int APPLY_CODE_STATUS_AGREE = 1;

	// 拒绝
	public static int APPLY_CODE_STATUS_REFUSED = 2;
	
	/**
	 * 定时任务CATEGORY
	 */
	// 系统预留用户信息更新
	public static String JOB_CATEGORY_RES_USER_INFO_UPD = "系统预留用户信息更新";
	
	/**
	 * 定时任务状态
	 * 0：失败
	 * 1：成功
	 */
	// 失败
	public static int JOB_STATUS_FAIL = 0;
	
	// 成功
	public static int JOB_STATUS_SUCCESS = 1;
}
