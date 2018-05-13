package com.sac.dao;

import com.sac.pojo.SacMessage;
import com.sac.pojo.SacMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SacMessageMapper {
    int countByExample(SacMessageExample example);

    int deleteByExample(SacMessageExample example);

    int deleteByPrimaryKey(Integer messageid);

    int insert(SacMessage record);

    int insertSelective(SacMessage record);

    List<SacMessage> selectByExample(SacMessageExample example);

    SacMessage selectByPrimaryKey(Integer messageid);

    int updateByExampleSelective(@Param("record") SacMessage record, @Param("example") SacMessageExample example);

    int updateByExample(@Param("record") SacMessage record, @Param("example") SacMessageExample example);

    int updateByPrimaryKeySelective(SacMessage record);

    int updateByPrimaryKey(SacMessage record);
}