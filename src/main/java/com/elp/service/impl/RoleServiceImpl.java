/**
 * Role Service Implement
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

import com.elp.dao.RoleDao;
import com.elp.model.Role;
import com.elp.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	private static final Logger logger = LoggerFactory.getLogger(RoleServiceImpl.class);
	
	@Autowired
	private RoleDao roleDao;
	
	/**
	 * 根据uid查找角色
	 * @param uid
	 * @return
	 */
	@Override
	public Set<String> findRoleByUid(Integer uid) {
		// 查询角色信息
		logger.debug("查询角色信息");
		List<String> result = roleDao.selectByUid(uid);
		return new HashSet<String>(result);
	}

	
	// *********************************************************
	// 未实现方法
	// *********************************************************
	
	
	@Override
	public void createRole(Role role) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addUserRole(Integer uid, Integer rid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Role findRoleByRid(Integer rid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void lockRole(Integer rid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unlockRole(Integer rid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRole(Integer rid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUserRole(Integer uid, Integer rid) {
		// TODO Auto-generated method stub
		
	}
}
