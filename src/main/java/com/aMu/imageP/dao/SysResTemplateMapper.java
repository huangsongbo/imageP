package com.aMu.imageP.dao;

import com.aMu.imageP.domain.SysResTemplate;
import com.aMu.imageP.domain.SysResTemplateExample;
import com.aMu.imageP.domain.resultMap.SysResTemplateResultMap;
import com.aMu.imageP.domain.search.SysResTemplateSearch;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SysResTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_res_template
     *
     * @mbggenerated
     */
    int countByExample(SysResTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_res_template
     *
     * @mbggenerated
     */
    int deleteByExample(SysResTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_res_template
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_res_template
     *
     * @mbggenerated
     */
    int insert(SysResTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_res_template
     *
     * @mbggenerated
     */
    int insertSelective(SysResTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_res_template
     *
     * @mbggenerated
     */
    List<SysResTemplate> selectByExample(SysResTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_res_template
     *
     * @mbggenerated
     */
    SysResTemplate selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_res_template
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SysResTemplate record, @Param("example") SysResTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_res_template
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SysResTemplate record, @Param("example") SysResTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_res_template
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SysResTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_res_template
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysResTemplate record);

	List<SysResTemplateResultMap> getList(SysResTemplateSearch sysResTemplateSearch);
}