package com.elp.dao;

import java.util.List;

public interface PermissionDao {

	/**
	 * 根据uid取得权限信息
	 * @param uid
	 * @return
	 */
	public List<String> selectByUid(int uid);
}