package com.sac.dao;

import com.sac.pojo.SacPost;
import com.sac.pojo.SacPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SacPostMapper {
    int countByExample(SacPostExample example);

    int deleteByExample(SacPostExample example);

    int deleteByPrimaryKey(Integer postid);

    int insert(SacPost record);

    int insertSelective(SacPost record);

    List<SacPost> selectByExample(SacPostExample example);

    SacPost selectByPrimaryKey(Integer postid);

    int updateByExampleSelective(@Param("record") SacPost record, @Param("example") SacPostExample example);

    int updateByExample(@Param("record") SacPost record, @Param("example") SacPostExample example);

    int updateByPrimaryKeySelective(SacPost record);

    int updateByPrimaryKey(SacPost record);
}