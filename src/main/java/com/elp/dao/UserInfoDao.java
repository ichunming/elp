package com.elp.dao;

import com.elp.model.UserInfo;

public interface UserInfoDao {
	/**
	 * 查找用户信息
	 * @param uid
	 * @return
	 */
	public UserInfo select(Integer uid);

	/**
	 * 插入用户信息
	 * @param userInfo
	 * @return
	 */
	public void insert(UserInfo userInfo);

	/**
	 * 更新用户信息
	 * @param userInfo
	 * @return
	 */
	public void update(UserInfo userInfo);

	/**
	 * 删除用户信息
	 * @param uid
	 * @return
	 */
	public void delete(Integer uid);
}