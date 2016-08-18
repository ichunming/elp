/**
 * 自定义Realm
 * ming 2016/07/22
 */
package com.elp.shiro.realm;

import java.util.Set;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.ExpiredCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.elp.model.User;
import com.elp.service.PermissionService;
import com.elp.service.RoleService;
import com.elp.service.UserService;
import com.elp.shiro.authc.MySimpleAuthenticationInfo;
import com.elp.util.AppConst;
import com.elp.util.Session;
import com.elp.util.SessionManager;

public class MyRealm extends AuthorizingRealm {

	private static final Logger logger = LoggerFactory.getLogger(MyRealm.class);
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private PermissionService permissionService;
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

		// 用户ID
		int uid;
		
        // 角色权限信息
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        
        // 角色，权限设置
        logger.debug("角色，权限设置");
        
        if(SessionManager.hasAttribute(Session.UID)) {
        	uid = SessionManager.getAttribute(Session.UID);
        } else {
        	throw new AuthenticationException();
        }
        
        authorizationInfo.setRoles(roleService.findRoleByUid(uid));
        authorizationInfo.setStringPermissions(permissionService.findPermissionByUid(uid));
        
        return authorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// 用户信息
		String email = (String)token.getPrincipal();
		
		// 通过邮箱获取用户信息
		logger.debug("通过邮箱获取用户信息...");
        User user = userService.findAccountByEmail(email);
        
        if(user == null) {
        	// 用户不存在
        	logger.debug("用户不存在");
            throw new UnknownAccountException();
        }
        
        if(user.getStatus() == AppConst.ACCOUNT_STATUS_INVALID) {
        	// 帐户未激活
        	logger.debug("帐户未激活");
            throw new ExpiredCredentialsException();
        } else if (user.getStatus() == AppConst.ACCOUNT_STATUS_LOCKED) {
        	// 帐户被锁定
        	logger.debug("帐户被锁定");
        	throw new LockedAccountException();
        } else if(user.getStatus() == AppConst.ACCOUNT_STATUS_DELETED) {
        	// 帐户被删除
        	logger.debug("帐户被删除");
        	throw new DisabledAccountException();
        }
        
        // 封装认证信息
        logger.debug("封装认证信息");
        SimpleAuthenticationInfo info = new MySimpleAuthenticationInfo(
        		user.getId(),    // uid
                user.getEmail(), // email
                user.getPassword(), // password 
                ByteSource.Util.bytes(user.getEmail() + user.getSalt()),// salt=email + salt
                getName()  // realm name
        );
        
        // 密码匹配
        logger.debug("密码匹配");
        assertCredentialsMatch(token, info);
        
        return info;
	}

}
