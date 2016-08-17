package com.elp.dao;

import java.util.List;

public interface RoleDao {

	/**
	 * 根据uid查找用户角色
	 * @param uid
	 * @return
	 */
	public List<String> selectByUid(int uid);
}