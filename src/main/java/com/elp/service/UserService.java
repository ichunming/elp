/**
 * User Service Interface
 * ming 2016/07/20
 */
package com.elp.service;

import com.elp.model.User;
import com.elp.model.UserInfo;

public interface UserService {
	
	/**
	 * 创建用户帐户
	 * @param user
	 */
	public void createAccount(User user);
	
	/**
	 * 创建用户信息
	 * @param userInfo
	 */
	public void createUserInfo(UserInfo userInfo);

	/**
	 * 根据email查找帐户
	 * @param email
	 * @return
	 */
	public User findAccountByEmail(String email);
	
	/**
	 * 查找用户信息
	 * @param uid
	 * @return
	 */
	public UserInfo findUserInfo(Integer uid);

	/**
	 * 修改密码
	 * @param uid
	 * @param newPassword
	 */
	public void changePassword(Integer uid, String newPassword);

	/**
	 * 帐户锁定
	 * @param uid
	 */
	public void lockAccount(Integer uid);
	
	/**
	 * 帐户解锁
	 * @param uid
	 */
	public void unlockAccount(Integer uid);
	
	/**
	 * 删除帐户
	 * @param uid
	 */
	public void deleteAccount(Integer uid);
	
	/**
	 * 更新用户信息
	 * @param userInfo
	 */
	public void updateUserInfo(UserInfo userInfo);
	
	/**
	 * 删除用户信息
	 * @param uid
	 */
	public void deleteUserInfo(Integer uid);
	
	/**
	 * 邮箱存在性check
	 * @param email
	 * @return
	 */
	public boolean emailExist(String email);
}
