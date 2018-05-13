package com.sac.dao;

import com.sac.pojo.SacCompany;
import com.sac.pojo.SacCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SacCompanyMapper {
    int countByExample(SacCompanyExample example);

    int deleteByExample(SacCompanyExample example);

    int deleteByPrimaryKey(Integer companyid);

    int insert(SacCompany record);

    int insertSelective(SacCompany record);

    List<SacCompany> selectByExample(SacCompanyExample example);

    SacCompany selectByPrimaryKey(Integer companyid);

    int updateByExampleSelective(@Param("record") SacCompany record, @Param("example") SacCompanyExample example);

    int updateByExample(@Param("record") SacCompany record, @Param("example") SacCompanyExample example);

    int updateByPrimaryKeySelective(SacCompany record);

    int updateByPrimaryKey(SacCompany record);
}