package com.sac.dao;

import com.sac.pojo.SacSchool;
import com.sac.pojo.SacSchoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SacSchoolMapper {
    int countByExample(SacSchoolExample example);

    int deleteByExample(SacSchoolExample example);

    int deleteByPrimaryKey(Integer schoolid);

    int insert(SacSchool record);

    int insertSelective(SacSchool record);

    List<SacSchool> selectByExample(SacSchoolExample example);

    SacSchool selectByPrimaryKey(Integer schoolid);

    int updateByExampleSelective(@Param("record") SacSchool record, @Param("example") SacSchoolExample example);

    int updateByExample(@Param("record") SacSchool record, @Param("example") SacSchoolExample example);

    int updateByPrimaryKeySelective(SacSchool record);

    int updateByPrimaryKey(SacSchool record);
}