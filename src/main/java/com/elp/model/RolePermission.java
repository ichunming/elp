package com.elp.model;

public class RolePermission {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column roles_permissions.role_id
	 * @mbggenerated  Wed Jul 27 15:46:49 CST 2016
	 */
	private Long roleId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column roles_permissions.permission_id
	 * @mbggenerated  Wed Jul 27 15:46:49 CST 2016
	 */
	private Long permissionId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column roles_permissions.role_id
	 * @return  the value of roles_permissions.role_id
	 * @mbggenerated  Wed Jul 27 15:46:49 CST 2016
	 */
	public Long getRoleId() {
		return roleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column roles_permissions.role_id
	 * @param roleId  the value for roles_permissions.role_id
	 * @mbggenerated  Wed Jul 27 15:46:49 CST 2016
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column roles_permissions.permission_id
	 * @return  the value of roles_permissions.permission_id
	 * @mbggenerated  Wed Jul 27 15:46:49 CST 2016
	 */
	public Long getPermissionId() {
		return permissionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column roles_permissions.permission_id
	 * @param permissionId  the value for roles_permissions.permission_id
	 * @mbggenerated  Wed Jul 27 15:46:49 CST 2016
	 */
	public void setPermissionId(Long permissionId) {
		this.permissionId = permissionId;
	}
}