/**
 * Helper用常量
 * ming 2016/07/20
 */
package com.elp.consts;

public class AppConst {
	
	/**
	 * 加密算法
	 */
	public static final String ALGORITHM_NAME = "SHA-1";
	
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
	public static final int ACCOUNT_STATUS_INVALID = 0;
	
	// 正常
	public static final int ACCOUNT_STATUS_ACTIVE = 1;
	
	// 锁定
	public static final int ACCOUNT_STATUS_LOCKED = 2;
	
	// 删除
	public static final int ACCOUNT_STATUS_DELETED = 3;
	
	/**
	 * rememberMe 参数名
	 */
	public static final String REMEMBER_ME_PARAMETER = "rememberMe";
	
	/**
	 * 角色状态
	 * 0：正常
	 * 1：锁定
	 * 2：删除
	 */
	// 正常
	public static final int ROLE_STATUS_ACTIVE = 0;
	
	// 锁定
	public static final int ROLE_STATUS_LOCKED = 1;

	// 删除
	public static final int ROLE_STATUS_DELETED = 2;
	
	/**
	 * 权限状态
	 * 0：正常
	 * 1：锁定
	 * 2：删除
	 */
	// 正常
	public static final int PERMISSION_STATUS_ACTIVE = 0;
	
	// 锁定
	public static final int PERMISSION_STATUS_LOCKED = 1;

	// 删除
	public static final int PERMISSION_STATUS_DELETED = 2;
	
	/**
	 * 系统预留用户信息状态
	 * 0：未使用
	 * 1：已使用
	 */
	// 未使用
	public static final int RESERVE_USER_INFO_STATUS_FREE = 0;
	
	// 已使用
	public static final int RESERVE_USER_INFO_STATUS_USED = 1;
	
	/**
	 * 邀请码状态
	 * 0：未审核
	 * 1：同意
	 * 2：拒绝
	 */
	// 未审核
	public static final int APPLY_CODE_STATUS_UNCHECK = 0;
	
	// 同意
	public static final int APPLY_CODE_STATUS_AGREE = 1;

	// 拒绝
	public static final int APPLY_CODE_STATUS_REFUSED = 2;
	
	/**
	 * 定时任务CATEGORY
	 */
	// 系统预留用户信息更新
	public static final String JOB_CATEGORY_RES_USER_INFO_UPD = "系统预留用户信息更新";
	
	/**
	 * 定时任务状态
	 * 0：失败
	 * 1：成功
	 */
	// 失败
	public static final int JOB_STATUS_FAIL = 0;
	
	// 成功
	public static final int JOB_STATUS_SUCCESS = 1;
	
	/**
	 * 页面模块常量
	 */
	// 用户列表:USERLIST
	public static final String BLOCK_USERLIST = "01";
	
	// 标签云库:TAGS
	public static final String BLOCK_TAGS = "02";

	/**
	 * 应用程序CODE
	 */
	// 通知 INFO
	public static final String CODE_INFO = "101";
	
	// 警告 WARING
	public static final String CODE_WARING = "201";
	
	// 异常 EXCEPTION
	public static final String CODE_EXCEPTION = "401";
	
	/**
	 * 分页系统常量
	 */
	// 默认每页数量
	public static final int DEFAULT_PAGE_COUNT = 10;
	
	// 文章模块每页数量
	public static final int ARTICLE_PAGE_COUNT = 10;
	
	// 照片模块每页数量
	public static final int PHOTO_PAGE_COUNT = 10;
	
	// 音频模块每页数量
	public static final int RADIO_PAGE_COUNT = 10;
	
	// 视频模块每页数量
	public static final int VEDIO_PAGE_COUNT = 10;
}
