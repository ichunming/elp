/**
 * 画面浮动模块类
 * 2015/10/20 chunming
 */
package com.elp.entity;

import java.util.List;

import com.elp.model.Tag;
import com.elp.model.UserInfo;

public class Block {
	// 类型
	private String type;
	// 模块名称 
	private String name;
	// 用户列表模块内容
	private List<UserInfo> userList;
	// 标签云库模块内容
	private List<Tag> tagList;
	
	// default constructor
	public Block() {}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<UserInfo> getUserList() {
		return userList;
	}

	public void setUserList(List<UserInfo> userList) {
		this.userList = userList;
	}

	public List<Tag> getTagList() {
		return tagList;
	}

	public void setTagList(List<Tag> tagList) {
		this.tagList = tagList;
	}
}
