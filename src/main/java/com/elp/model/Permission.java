package com.elp.model;

import java.util.Date;

public class Permission {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.id
     *
     * @mbggenerated Tue Aug 16 17:42:02 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.name
     *
     * @mbggenerated Tue Aug 16 17:42:02 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.description
     *
     * @mbggenerated Tue Aug 16 17:42:02 CST 2016
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.status
     *
     * @mbggenerated Tue Aug 16 17:42:02 CST 2016
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.create_date
     *
     * @mbggenerated Tue Aug 16 17:42:02 CST 2016
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.update_date
     *
     * @mbggenerated Tue Aug 16 17:42:02 CST 2016
     */
    private Date updateDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.id
     *
     * @return the value of permission.id
     *
     * @mbggenerated Tue Aug 16 17:42:02 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.id
     *
     * @param id the value for permission.id
     *
     * @mbggenerated Tue Aug 16 17:42:02 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.name
     *
     * @return the value of permission.name
     *
     * @mbggenerated Tue Aug 16 17:42:02 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.name
     *
     * @param name the value for permission.name
     *
     * @mbggenerated Tue Aug 16 17:42:02 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.description
     *
     * @return the value of permission.description
     *
     * @mbggenerated Tue Aug 16 17:42:02 CST 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.description
     *
     * @param description the value for permission.description
     *
     * @mbggenerated Tue Aug 16 17:42:02 CST 2016
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.status
     *
     * @return the value of permission.status
     *
     * @mbggenerated Tue Aug 16 17:42:02 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.status
     *
     * @param status the value for permission.status
     *
     * @mbggenerated Tue Aug 16 17:42:02 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.create_date
     *
     * @return the value of permission.create_date
     *
     * @mbggenerated Tue Aug 16 17:42:02 CST 2016
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.create_date
     *
     * @param createDate the value for permission.create_date
     *
     * @mbggenerated Tue Aug 16 17:42:02 CST 2016
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.update_date
     *
     * @return the value of permission.update_date
     *
     * @mbggenerated Tue Aug 16 17:42:02 CST 2016
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.update_date
     *
     * @param updateDate the value for permission.update_date
     *
     * @mbggenerated Tue Aug 16 17:42:02 CST 2016
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}