package com.elp.model;

import java.util.Date;

public class UserPermission extends UserPermissionKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_permission.create_date
     *
     * @mbggenerated Tue Aug 16 17:42:02 CST 2016
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_permission.update_date
     *
     * @mbggenerated Tue Aug 16 17:42:02 CST 2016
     */
    private Date updateDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_permission.create_date
     *
     * @return the value of user_permission.create_date
     *
     * @mbggenerated Tue Aug 16 17:42:02 CST 2016
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_permission.create_date
     *
     * @param createDate the value for user_permission.create_date
     *
     * @mbggenerated Tue Aug 16 17:42:02 CST 2016
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_permission.update_date
     *
     * @return the value of user_permission.update_date
     *
     * @mbggenerated Tue Aug 16 17:42:02 CST 2016
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_permission.update_date
     *
     * @param updateDate the value for user_permission.update_date
     *
     * @mbggenerated Tue Aug 16 17:42:02 CST 2016
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}