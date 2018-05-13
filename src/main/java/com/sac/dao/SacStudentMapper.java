package com.sac.dao;

import com.sac.pojo.SacStudent;
import com.sac.pojo.SacStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SacStudentMapper {
    int countByExample(SacStudentExample example);

    int deleteByExample(SacStudentExample example);

    int deleteByPrimaryKey(Integer stuid);

    int insert(SacStudent record);

    int insertSelective(SacStudent record);

    List<SacStudent> selectByExample(SacStudentExample example);

    SacStudent selectByPrimaryKey(Integer stuid);

    int updateByExampleSelective(@Param("record") SacStudent record, @Param("example") SacStudentExample example);

    int updateByExample(@Param("record") SacStudent record, @Param("example") SacStudentExample example);

    int updateByPrimaryKeySelective(SacStudent record);

    int updateByPrimaryKey(SacStudent record);
}