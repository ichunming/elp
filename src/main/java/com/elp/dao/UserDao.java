package com.elp.dao;

import com.elp.model.User;

public interface UserDao {
	
	/**
	 * 查找用户
	 * @param uid
	 * @return
	 */
	public User select(Integer uid);
	
	/**
	 * 插入用户
	 * @param user
	 * @return
	 */
	public void insert(User user);
	
	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	public void update(User user);
	
	/**
	 * 删除用户
	 * @param uid
	 * @return
	 */
	public void delete(Integer uid);
	
	/**
	 * 通过email查找用户
	 * @param email
	 * @return
	 */
	public User selectByEmail(String email);
}