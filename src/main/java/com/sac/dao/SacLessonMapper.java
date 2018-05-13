package com.sac.dao;

import com.sac.pojo.SacLesson;
import com.sac.pojo.SacLessonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SacLessonMapper {
    int countByExample(SacLessonExample example);

    int deleteByExample(SacLessonExample example);

    int deleteByPrimaryKey(Integer lessonid);

    int insert(SacLesson record);

    int insertSelective(SacLesson record);

    List<SacLesson> selectByExample(SacLessonExample example);

    SacLesson selectByPrimaryKey(Integer lessonid);

    int updateByExampleSelective(@Param("record") SacLesson record, @Param("example") SacLessonExample example);

    int updateByExample(@Param("record") SacLesson record, @Param("example") SacLessonExample example);

    int updateByPrimaryKeySelective(SacLesson record);

    int updateByPrimaryKey(SacLesson record);
}