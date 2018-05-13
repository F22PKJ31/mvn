package com.sac.dao;

import com.sac.pojo.SacComment;
import com.sac.pojo.SacCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SacCommentMapper {
    int countByExample(SacCommentExample example);

    int deleteByExample(SacCommentExample example);

    int deleteByPrimaryKey(Integer commentid);

    int insert(SacComment record);

    int insertSelective(SacComment record);

    List<SacComment> selectByExample(SacCommentExample example);

    SacComment selectByPrimaryKey(Integer commentid);

    int updateByExampleSelective(@Param("record") SacComment record, @Param("example") SacCommentExample example);

    int updateByExample(@Param("record") SacComment record, @Param("example") SacCommentExample example);

    int updateByPrimaryKeySelective(SacComment record);

    int updateByPrimaryKey(SacComment record);
}