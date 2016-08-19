/**
 * User Service Implement
 * ming 2016/07/20
 */
package com.elp.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elp.dao.ReserveUserInfoDao;
import com.elp.dao.UserDao;
import com.elp.dao.UserInfoDao;
import com.elp.model.ReserveUserInfo;
import com.elp.model.User;
import com.elp.model.UserInfo;
import com.elp.service.UserService;
import com.elp.util.PasswordHelper;

@Service("userService")
public class UserServiceImpl implements UserService {

	private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UserInfoDao userInfoDao;
	
	@Autowired
	private ReserveUserInfoDao reserveUserInfoDao;
	
	/**
	 * 创建帐户
	 * @param user
	 */
	@Override
	public void createAccount(User user) {
		logger.debug("创建帐户...");
		
		// 加密处理
		logger.debug("密码加密...");
		PasswordHelper.encrypPassword(user);

		// 用户插入数据库
		logger.debug("帐户信息插入数据库...");
		userDao.insert(user);
		
		logger.debug("帐户创建成功");
	}

	/**
	 * 根据email查找帐户
	 * @param email
	 * @return
	 */
	@Override
	public User findAccountByEmail(String email) {
		// 查找用户
		return userDao.selectByEmail(email);
	}

	/**
	 * 邮箱存在性check
	 * @param email
	 * @return
	 */
	@Override
	public boolean emailExist(String email) {
		// 通过email查找用户信息
		logger.debug("通过email查找用户信息");
		User user = this.findAccountByEmail(email);
		
		// 查询结果check
		logger.debug("查询结果check");
		if(null != user) {
			// 查找到用户
			logger.debug("查找到用户");
			return true;
		}
		
		// 未查找到用户
		logger.debug("未查找到用户");
		return false;
	}

	/**
	 * 查找用户信息
	 * @param uid
	 * @return
	 */
	@Override
	public UserInfo findUserInfo(Integer uid) {
		return userInfoDao.select(uid);
	}
	
	/**
	 * 查找已使用系统预留用户信息
	 * @return
	 */
	public List<ReserveUserInfo> findAllReserveUserInfo() {
		return reserveUserInfoDao.selectAll();
	}
	
	/**
	 * 通过用户名查找用户信息
	 * @param username
	 * @return
	 */
	public UserInfo findUserInfoByUsername(String username) {
		return userInfoDao.selectByUsername(username);
	}
	
	/**
	 * 更新系统预留用户信息
	 * @param rui
	 */
	public void updateReserveUserInfo(ReserveUserInfo rui) {
		reserveUserInfoDao.update(rui);
	}
	
	// *********************************************************
	// 未实现方法
	// *********************************************************
	
	
	@Override
	public void createUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePassword(Integer uid, String newPassword) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lockAccount(Integer uid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unlockAccount(Integer uid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount(Integer uid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserInfo(Integer uid) {
		// TODO Auto-generated method stub
		
	}
}