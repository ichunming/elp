package com.elp.dao;

import java.util.List;

import com.elp.model.ReserveUserInfo;

public interface ReserveUserInfoDao {
	
	/**
	 * 查找所有系统预留用户信息
	 * @return
	 */
	public List<ReserveUserInfo> selectAll();
	
	/**
	 * 插入预留用户信息
	 * @param rui
	 * @return
	 */
	public void insert(ReserveUserInfo rui);
	
	/**
	 * 更新预留用户信息
	 * @param rui
	 * @return
	 */
	public void update(ReserveUserInfo rui);
	
	/**
	 * 删除预留用户信息
	 * @param id
	 * @return
	 */
	public void delete(Integer id);
}