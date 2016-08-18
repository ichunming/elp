/**
 * Permission Service Interface
 * ming 2016/07/20
 */
package com.elp.service;

import java.util.Set;

import com.elp.model.Permission;

public interface PermissionService {

	/**
	 * 创建权限
	 * @param permission
	 */
	public void createPermission(Permission permission);
	
	/**
	 * 添加用户-权限关系
	 * @param uid
	 * @param pid
	 */
	public void addUserPermission(Integer uid, Integer pid);
	
	/**
	 * 根据pid查找权限信息
	 * @param pid
	 * @return
	 */
	public Permission findPermissionByPid(Integer pid);

	/**
	 * 根据uid查找权限信息
	 * @param uid
	 * @return
	 */
	public Set<String> findPermissionByUid(Integer uid);
	
	/**
	 * 锁定权限信息
	 * @param pid
	 */
	public void lockPermission(Integer pid);
	
	/**
	 * 解锁权限信息
	 * @param pid
	 */
	public void unlockPermission(Integer pid);
	
	/**
	 * 删除权限信息
	 * @param pid
	 */
	public void deletePermission(Integer pid);

	/**
	 * 移除用户-权限关系
	 * @param uid
	 * @param pid
	 */
	public void removeUserPermission(Integer uid, Integer pid);
}
