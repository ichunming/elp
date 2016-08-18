/**
 * Permission Service Implement
 * ming 2016/07/22
 */
package com.elp.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elp.dao.PermissionDao;
import com.elp.model.Permission;
import com.elp.service.PermissionService;

@Service
public class PermissionServiceImpl implements PermissionService{

	private static final Logger logger = LoggerFactory.getLogger(PermissionServiceImpl.class);
	
	@Autowired
	private PermissionDao permissionDao;

	/**
	 * 根据uid查找权限
	 * @param uid
	 * @return
	 */
	@Override
	public Set<String> findPermissionByUid(Integer uid) {
		// 权限取得
		logger.debug("权限取得");
		List<String> permissions = permissionDao.selectByUid(uid);
		return new HashSet<String>(permissions);
	}

	
	// *********************************************************
	// 未实现方法
	// *********************************************************
	

	@Override
	public void createPermission(Permission permission) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void addUserPermission(Integer uid, Integer pid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Permission findPermissionByPid(Integer pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void lockPermission(Integer pid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unlockPermission(Integer pid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePermission(Integer pid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUserPermission(Integer uid, Integer pid) {
		// TODO Auto-generated method stub
		
	}
}
