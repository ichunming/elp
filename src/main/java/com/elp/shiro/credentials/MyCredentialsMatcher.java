/**
 * 自定义CredentialsMatcher
 * ming 2016/07/27
 */
package com.elp.shiro.credentials;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.SaltedAuthenticationInfo;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.elp.helper.PasswordHelper;
import com.elp.shiro.authc.MySimpleAuthenticationInfo;
import com.elp.util.AppConst;
import com.elp.util.Session;
import com.elp.util.SessionManager;

public class MyCredentialsMatcher implements CredentialsMatcher {

	private Logger logger = LoggerFactory.getLogger(MyCredentialsMatcher.class);
	
	private Cache<String, AtomicInteger> passwordRetryCache;
	
	public MyCredentialsMatcher() {
	}
	
	public MyCredentialsMatcher(CacheManager cacheManager) {
		passwordRetryCache = cacheManager.getCache("passwordRetryCache");
	}
	
	@Override
	public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {

		String username = (String)token.getPrincipal();
		int uid;
		Object salt = null;
		Object orgPassword = null;
		String password = null;
		
        // 重复登入次数取得
		logger.debug("重复登入次数取得");
        AtomicInteger retryCount = passwordRetryCache.get(username);
        
        if(retryCount == null) {
        	// 第一次登入，初始化Cache
        	logger.debug("第一次登入，初始化Cache");
            retryCount = new AtomicInteger(0);
            passwordRetryCache.put(username, retryCount);
        }
        
        // 重复登入次数check
        logger.debug("重复登入次数check");
        if(retryCount.incrementAndGet() >= AppConst.MAX_RETRY_COUNT) {
            // 超过最大尝试次数
        	logger.debug("超过最大尝试次数");
            throw new ExcessiveAttemptsException();
        }
		
		if (info instanceof SaltedAuthenticationInfo && info instanceof MySimpleAuthenticationInfo) {
			// salt取得
			logger.debug("salt取得");
			salt = ((SaltedAuthenticationInfo) info).getCredentialsSalt();
			uid = ((MySimpleAuthenticationInfo) info).getUid();
		} else {
			// 非SaltedAuthenticationInfo实例
			logger.debug("非SaltedAuthenticationInfo & MySimpleAuthenticationInfo实例");
			return false;
		}

		orgPassword = token.getCredentials();
		password = (String)info.getCredentials();
		
		// 密码匹配
		if (PasswordHelper.match(orgPassword, salt, password)) {
			// 密码匹配成功
			logger.debug("密码匹配成功，清除用户cache");
			passwordRetryCache.remove(username);
			
			// 用户ID,用户邮箱存入session
			logger.debug("用户ID,用户邮箱存入session");
			SessionManager.setAttribute(Session.UID, uid);
			SessionManager.setAttribute(Session.EMAIL, info.getPrincipals());
			return true;
		}
		
		// 密码匹配不成功
		logger.debug("密码匹配不成功");
		return false;
	}

}
