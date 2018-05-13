package com.sac.dao;

import com.sac.pojo.SacCourse;
import com.sac.pojo.SacCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SacCourseMapper {
    int countByExample(SacCourseExample example);

    int deleteByExample(SacCourseExample example);

    int deleteByPrimaryKey(Integer courseid);

    int insert(SacCourse record);

    int insertSelective(SacCourse record);

    List<SacCourse> selectByExample(SacCourseExample example);

    SacCourse selectByPrimaryKey(Integer courseid);

    int updateByExampleSelective(@Param("record") SacCourse record, @Param("example") SacCourseExample example);

    int updateByExample(@Param("record") SacCourse record, @Param("example") SacCourseExample example);

    int updateByPrimaryKeySelective(SacCourse record);

    int updateByPrimaryKey(SacCourse record);
}