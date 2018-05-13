package com.sac.dao;

import com.sac.pojo.SacSelectcourse;
import com.sac.pojo.SacSelectcourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SacSelectcourseMapper {
    int countByExample(SacSelectcourseExample example);

    int deleteByExample(SacSelectcourseExample example);

    int deleteByPrimaryKey(Integer selectid);

    int insert(SacSelectcourse record);

    int insertSelective(SacSelectcourse record);

    List<SacSelectcourse> selectByExample(SacSelectcourseExample example);

    SacSelectcourse selectByPrimaryKey(Integer selectid);

    int updateByExampleSelective(@Param("record") SacSelectcourse record, @Param("example") SacSelectcourseExample example);

    int updateByExample(@Param("record") SacSelectcourse record, @Param("example") SacSelectcourseExample example);

    int updateByPrimaryKeySelective(SacSelectcourse record);

    int updateByPrimaryKey(SacSelectcourse record);
}