package com.sac.dao;

import com.sac.pojo.SacCooperation;
import com.sac.pojo.SacCooperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SacCooperationMapper {
    int countByExample(SacCooperationExample example);

    int deleteByExample(SacCooperationExample example);

    int deleteByPrimaryKey(Integer cooperationid);

    int insert(SacCooperation record);

    int insertSelective(SacCooperation record);

    List<SacCooperation> selectByExample(SacCooperationExample example);

    SacCooperation selectByPrimaryKey(Integer cooperationid);

    int updateByExampleSelective(@Param("record") SacCooperation record, @Param("example") SacCooperationExample example);

    int updateByExample(@Param("record") SacCooperation record, @Param("example") SacCooperationExample example);

    int updateByPrimaryKeySelective(SacCooperation record);

    int updateByPrimaryKey(SacCooperation record);
}