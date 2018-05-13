package com.sac.dao;

import com.sac.pojo.SacAdmin;
import com.sac.pojo.SacAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SacAdminMapper {
    int countByExample(SacAdminExample example);

    int deleteByExample(SacAdminExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(SacAdmin record);

    int insertSelective(SacAdmin record);

    List<SacAdmin> selectByExample(SacAdminExample example);

    SacAdmin selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") SacAdmin record, @Param("example") SacAdminExample example);

    int updateByExample(@Param("record") SacAdmin record, @Param("example") SacAdminExample example);

    int updateByPrimaryKeySelective(SacAdmin record);

    int updateByPrimaryKey(SacAdmin record);
}