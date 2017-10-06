package com.aMu.imageP.domain;

import java.util.Date;

public class SysTemplateLabelRel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_template_label_rel.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_template_label_rel.template_id
     *
     * @mbggenerated
     */
    private Long templateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_template_label_rel.label_id
     *
     * @mbggenerated
     */
    private Long labelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_template_label_rel.gmt_create
     *
     * @mbggenerated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_template_label_rel.is_deleted
     *
     * @mbggenerated
     */
    private Integer isDeleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_template_label_rel.id
     *
     * @return the value of sys_template_label_rel.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_template_label_rel.id
     *
     * @param id the value for sys_template_label_rel.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_template_label_rel.template_id
     *
     * @return the value of sys_template_label_rel.template_id
     *
     * @mbggenerated
     */
    public Long getTemplateId() {
        return templateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_template_label_rel.template_id
     *
     * @param templateId the value for sys_template_label_rel.template_id
     *
     * @mbggenerated
     */
    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_template_label_rel.label_id
     *
     * @return the value of sys_template_label_rel.label_id
     *
     * @mbggenerated
     */
    public Long getLabelId() {
        return labelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_template_label_rel.label_id
     *
     * @param labelId the value for sys_template_label_rel.label_id
     *
     * @mbggenerated
     */
    public void setLabelId(Long labelId) {
        this.labelId = labelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_template_label_rel.gmt_create
     *
     * @return the value of sys_template_label_rel.gmt_create
     *
     * @mbggenerated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_template_label_rel.gmt_create
     *
     * @param gmtCreate the value for sys_template_label_rel.gmt_create
     *
     * @mbggenerated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_template_label_rel.is_deleted
     *
     * @return the value of sys_template_label_rel.is_deleted
     *
     * @mbggenerated
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_template_label_rel.is_deleted
     *
     * @param isDeleted the value for sys_template_label_rel.is_deleted
     *
     * @mbggenerated
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}