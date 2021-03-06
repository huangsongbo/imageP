package com.aMu.imageP.dao;

import com.aMu.imageP.domain.UserProduction;
import com.aMu.imageP.domain.UserProductionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserProductionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_production
     *
     * @mbggenerated
     */
    int countByExample(UserProductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_production
     *
     * @mbggenerated
     */
    int deleteByExample(UserProductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_production
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_production
     *
     * @mbggenerated
     */
    int insert(UserProduction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_production
     *
     * @mbggenerated
     */
    int insertSelective(UserProduction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_production
     *
     * @mbggenerated
     */
    List<UserProduction> selectByExample(UserProductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_production
     *
     * @mbggenerated
     */
    UserProduction selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_production
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserProduction record, @Param("example") UserProductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_production
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserProduction record, @Param("example") UserProductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_production
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserProduction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_production
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserProduction record);
}