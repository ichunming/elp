package com.elp.model;

import java.util.Date;

public class CodeApply {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column code_apply.id
     *
     * @mbggenerated Fri Aug 19 11:53:34 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column code_apply.email
     *
     * @mbggenerated Fri Aug 19 11:53:34 CST 2016
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column code_apply.name
     *
     * @mbggenerated Fri Aug 19 11:53:34 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column code_apply.reason
     *
     * @mbggenerated Fri Aug 19 11:53:34 CST 2016
     */
    private String reason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column code_apply.status
     *
     * @mbggenerated Fri Aug 19 11:53:34 CST 2016
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column code_apply.create_date
     *
     * @mbggenerated Fri Aug 19 11:53:34 CST 2016
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column code_apply.update_date
     *
     * @mbggenerated Fri Aug 19 11:53:34 CST 2016
     */
    private Date updateDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column code_apply.id
     *
     * @return the value of code_apply.id
     *
     * @mbggenerated Fri Aug 19 11:53:34 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column code_apply.id
     *
     * @param id the value for code_apply.id
     *
     * @mbggenerated Fri Aug 19 11:53:34 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column code_apply.email
     *
     * @return the value of code_apply.email
     *
     * @mbggenerated Fri Aug 19 11:53:34 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column code_apply.email
     *
     * @param email the value for code_apply.email
     *
     * @mbggenerated Fri Aug 19 11:53:34 CST 2016
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column code_apply.name
     *
     * @return the value of code_apply.name
     *
     * @mbggenerated Fri Aug 19 11:53:34 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column code_apply.name
     *
     * @param name the value for code_apply.name
     *
     * @mbggenerated Fri Aug 19 11:53:34 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column code_apply.reason
     *
     * @return the value of code_apply.reason
     *
     * @mbggenerated Fri Aug 19 11:53:34 CST 2016
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column code_apply.reason
     *
     * @param reason the value for code_apply.reason
     *
     * @mbggenerated Fri Aug 19 11:53:34 CST 2016
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column code_apply.status
     *
     * @return the value of code_apply.status
     *
     * @mbggenerated Fri Aug 19 11:53:34 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column code_apply.status
     *
     * @param status the value for code_apply.status
     *
     * @mbggenerated Fri Aug 19 11:53:34 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column code_apply.create_date
     *
     * @return the value of code_apply.create_date
     *
     * @mbggenerated Fri Aug 19 11:53:34 CST 2016
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column code_apply.create_date
     *
     * @param createDate the value for code_apply.create_date
     *
     * @mbggenerated Fri Aug 19 11:53:34 CST 2016
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column code_apply.update_date
     *
     * @return the value of code_apply.update_date
     *
     * @mbggenerated Fri Aug 19 11:53:34 CST 2016
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column code_apply.update_date
     *
     * @param updateDate the value for code_apply.update_date
     *
     * @mbggenerated Fri Aug 19 11:53:34 CST 2016
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}