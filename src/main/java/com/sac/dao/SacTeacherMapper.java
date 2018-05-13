package com.sac.dao;

import com.sac.pojo.SacTeacher;
import com.sac.pojo.SacTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SacTeacherMapper {
    int countByExample(SacTeacherExample example);

    int deleteByExample(SacTeacherExample example);

    int deleteByPrimaryKey(Integer teacherid);

    int insert(SacTeacher record);

    int insertSelective(SacTeacher record);

    List<SacTeacher> selectByExample(SacTeacherExample example);

    SacTeacher selectByPrimaryKey(Integer teacherid);

    int updateByExampleSelective(@Param("record") SacTeacher record, @Param("example") SacTeacherExample example);

    int updateByExample(@Param("record") SacTeacher record, @Param("example") SacTeacherExample example);

    int updateByPrimaryKeySelective(SacTeacher record);

    int updateByPrimaryKey(SacTeacher record);
}