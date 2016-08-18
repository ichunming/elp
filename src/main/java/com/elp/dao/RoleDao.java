package com.elp.dao;

import java.util.List;
import com.elp.model.Role;

public interface RoleDao {

	/**
	 * 查找用户角色
	 * @param uid
	 * @return
	 */
	public Role select(Integer rid);
	
	/**
	 * 插入角色信息
	 * @param role
	 * @return
	 */
	public void insert(Role role);
	
	/**
	 * 更新角色信息
	 * @param role
	 * @return
	 */
	public void update(Role role);
	
	/**
	 * 删除角色信息
	 * @param rid
	 * @return
	 */
	public void delete(Integer rid);
	
	/**
	 * 根据uid查找用户角色
	 * @param uid
	 * @return
	 */
	public List<String> selectByUid(Integer uid);
}