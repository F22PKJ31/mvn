package com.sac.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sac.dao.SacCourseMapper;
import com.sac.dao.SacLessonMapper;
import com.sac.dao.SacSelectcourseMapper;
import com.sac.dao.SacTeacherMapper;
import com.sac.pojo.SacCourse;
import com.sac.pojo.SacCourseExample;
import com.sac.pojo.SacLesson;
import com.sac.pojo.SacLessonExample;
import com.sac.pojo.SacSelectcourse;
import com.sac.pojo.SacSelectcourseExample;
import com.sac.pojo.SacSelectcourseExample.Criteria;
import com.sac.pojo.SacStudent;
import com.sac.pojo.SacTeacher;

@Service
public class CourseService extends BaseService {

	public SacLesson singleLesson(Integer lessonid) {
		// TODO Auto-generated method stub

		return sacLessonMapper.selectByPrimaryKey(lessonid);
	}

	public List<SacLesson> showLessonByCourseid(Integer courseid) {
		// TODO Auto-generated method stub
		SacLessonExample example = new SacLessonExample();
		example.createCriteria().andCourseidEqualTo(courseid);
		return sacLessonMapper.selectByExample(example);
	}

	public List<SacCourse> singleCourse(Integer courseid) {
		// TODO Auto-generated method stub
		SacCourseExample example = new SacCourseExample();
		example.createCriteria().andCourseidEqualTo(courseid);
		return sacCourseMapper.selectByExample(example);
	}

	public boolean isSelect(SacStudent sacStudent, Integer courseid) {
		// TODO Auto-generated method stub
		SacSelectcourseExample example = new SacSelectcourseExample();
		Criteria criteria = example.createCriteria();
		criteria.andStuidEqualTo(sacStudent.getStuid());
		criteria.andCourseidEqualTo(courseid);
		List<SacSelectcourse> list = sacSelectcourseMapper.selectByExample(example);
		if (list.isEmpty()) {
			return false;
		} else {
			return true;
		}

	}

	public boolean selectCourse(SacSelectcourse sacSelectcourse) {
		// TODO Auto-generated method stub
		SacSelectcourseExample example = new SacSelectcourseExample();
		Criteria criteria = example.createCriteria();
		criteria.andCourseidEqualTo(sacSelectcourse.getCourseid());
		criteria.andStuidEqualTo(sacSelectcourse.getStuid());
		List<SacSelectcourse> list = sacSelectcourseMapper.selectByExample(example);
		example.clear();
		if (list.isEmpty()) {
			sacSelectcourse.setSelecttime(new Date());
			return sacSelectcourseMapper.insert(sacSelectcourse) >= 1;

		}
		return false;
	}

	public SacTeacher showTeacher(Integer teacherid) {
		// TODO Auto-generated method stub
		return sacTeacherMapper.selectByPrimaryKey(teacherid);
	}

	public List<SacCourse> coursesByTeacher(Integer teacherid) {
		// TODO Auto-generated method stub

		SacCourseExample example = new SacCourseExample();
		example.createCriteria().andCourseteacherEqualTo(showTeacher(teacherid).getTeachername());
		return sacCourseMapper.selectByExample(example);
	}

	public Object getCooperationById(Integer cooperationid) {
		// TODO Auto-generated method stub
		return sacCooperationMapper.selectByPrimaryKey(cooperationid);
	}


}
