package com.elp.dao;

import java.util.List;

public interface RoleDao {

	/**
	 * 根据用户名查找用户角色
	 * @param name
	 * @return
	 */
	public List<String> selectByName(String name);
}