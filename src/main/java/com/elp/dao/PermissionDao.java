package com.elp.dao;

import java.util.List;

import com.elp.model.Permission;

public interface PermissionDao {

	/**
	 * 取得权限信息
	 * @param pid
	 * @return
	 */
	public Permission select(Integer pid);
	
	/**
	 * 插入权限信息
	 * @param permission
	 * @return
	 */
	public void insert(Permission permission);
	
	/**
	 * 更新权限信息
	 * @param permission
	 * @return
	 */
	public void update(Permission permission);
	
	/**
	 * 删除权限信息
	 * @param pid
	 * @return
	 */
	
	public void delete(Integer pid);
	/**
	 * 根据uid取得权限信息
	 * @param uid
	 * @return
	 */
	public List<String> selectByUid(Integer uid);
}