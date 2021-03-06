package com.aMu.imageP.dao;

import com.aMu.imageP.domain.ResPic;
import com.aMu.imageP.domain.ResPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResPicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_pic
     *
     * @mbggenerated
     */
    int countByExample(ResPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_pic
     *
     * @mbggenerated
     */
    int deleteByExample(ResPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_pic
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_pic
     *
     * @mbggenerated
     */
    int insert(ResPic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_pic
     *
     * @mbggenerated
     */
    int insertSelective(ResPic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_pic
     *
     * @mbggenerated
     */
    List<ResPic> selectByExample(ResPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_pic
     *
     * @mbggenerated
     */
    ResPic selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_pic
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ResPic record, @Param("example") ResPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_pic
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ResPic record, @Param("example") ResPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_pic
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ResPic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_pic
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ResPic record);
}