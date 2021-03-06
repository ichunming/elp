package com.elp.model;

import java.util.Date;

public class SysJobLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_job_log.id
     *
     * @mbggenerated Wed Jun 08 16:43:15 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_job_log.category
     *
     * @mbggenerated Wed Jun 08 16:43:15 CST 2016
     */
    private String category;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_job_log.task
     *
     * @mbggenerated Wed Jun 08 16:43:15 CST 2016
     */
    private String task;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_job_log.create_time
     *
     * @mbggenerated Wed Jun 08 16:43:15 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_job_log.status
     *
     * @mbggenerated Wed Jun 08 16:43:15 CST 2016
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_job_log.notes
     *
     * @mbggenerated Wed Jun 08 16:43:15 CST 2016
     */
    private String notes;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_job_log.id
     *
     * @return the value of sys_job_log.id
     *
     * @mbggenerated Wed Jun 08 16:43:15 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_job_log.id
     *
     * @param id the value for sys_job_log.id
     *
     * @mbggenerated Wed Jun 08 16:43:15 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_job_log.category
     *
     * @return the value of sys_job_log.category
     *
     * @mbggenerated Wed Jun 08 16:43:15 CST 2016
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_job_log.category
     *
     * @param category the value for sys_job_log.category
     *
     * @mbggenerated Wed Jun 08 16:43:15 CST 2016
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_job_log.task
     *
     * @return the value of sys_job_log.task
     *
     * @mbggenerated Wed Jun 08 16:43:15 CST 2016
     */
    public String getTask() {
        return task;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_job_log.task
     *
     * @param task the value for sys_job_log.task
     *
     * @mbggenerated Wed Jun 08 16:43:15 CST 2016
     */
    public void setTask(String task) {
        this.task = task == null ? null : task.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_job_log.create_time
     *
     * @return the value of sys_job_log.create_time
     *
     * @mbggenerated Wed Jun 08 16:43:15 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_job_log.create_time
     *
     * @param createTime the value for sys_job_log.create_time
     *
     * @mbggenerated Wed Jun 08 16:43:15 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_job_log.status
     *
     * @return the value of sys_job_log.status
     *
     * @mbggenerated Wed Jun 08 16:43:15 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_job_log.status
     *
     * @param status the value for sys_job_log.status
     *
     * @mbggenerated Wed Jun 08 16:43:15 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_job_log.notes
     *
     * @return the value of sys_job_log.notes
     *
     * @mbggenerated Wed Jun 08 16:43:15 CST 2016
     */
    public String getNotes() {
        return notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_job_log.notes
     *
     * @param notes the value for sys_job_log.notes
     *
     * @mbggenerated Wed Jun 08 16:43:15 CST 2016
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}