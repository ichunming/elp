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
	
	@Override
	public void createPermission(Permission permission) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disablePermission(Long permissionId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enablePermission(Long permissionId) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 根据uid查找权限
	 * @param uid
	 * @return
	 */
	@Override
	public Set<String> findPermissionByUid(int uid) {
		// 权限取得
		logger.debug("权限取得");
		List<String> permissions = permissionDao.selectByUid(uid);
		return new HashSet<String>(permissions);
	}
}
