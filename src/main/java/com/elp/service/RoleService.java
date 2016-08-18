/**
 * Role Service Interface
 * ming 2016/07/20
 */
package com.elp.service;

import java.util.Set;

import com.elp.model.Role;

public interface RoleService {

	/**
	 * 创建角色信息
	 * @param role
	 */
	public void createRole(Role role);
	
	/**
	 * 添加用户-角色关系
	 * @param uid
	 * @param rid
	 */
	public void addUserRole(Integer uid, Integer rid);

	/**
	 * 根据rid查找角色信息
	 * @param rid
	 * @return
	 */
	public Role findRoleByRid(Integer rid);

	/**
	 * 根据uid查找角色信息
	 * @param uid
	 * @return
	 */
	public Set<String> findRoleByUid(Integer uid);
	
	/**
	 * 锁定角色信息
	 * @param rid
	 */
	public void lockRole(Integer rid);
	
	/**
	 * 解锁角色信息
	 * @param rid
	 */
	public void unlockRole(Integer rid);
	
	/**
	 * 删除角色信息
	 * @param rid
	 */
	public void deleteRole(Integer rid);

	/**
	 * 移除用户-角色关系
	 * @param uid
	 * @param rid
	 */
	public void removeUserRole(Integer uid, Integer rid);
}
