package com.elp.shiro.authc;

import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.util.ByteSource;

@SuppressWarnings("serial")
public class MySimpleAuthenticationInfo extends SimpleAuthenticationInfo {

	// 用户ID
	private int uid;
	
	public MySimpleAuthenticationInfo(int uid, Object principal, Object hashedCredentials, ByteSource credentialsSalt, String realmName) {
        super(principal, hashedCredentials, credentialsSalt, realmName);
        this.uid = uid;
    }

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}
}
