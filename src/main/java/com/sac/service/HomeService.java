package com.sac.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sac.pojo.PostAndPoster;
import com.sac.pojo.SacCooperation;
import com.sac.pojo.SacCooperationExample;
import com.sac.pojo.SacCourse;
import com.sac.pojo.SacCourseExample;
import com.sac.pojo.SacMessage;
import com.sac.pojo.SacMessageExample;
import com.sac.pojo.SacPost;
import com.sac.pojo.SacPostExample;
import com.sac.pojo.SacSchoolExample;
import com.sac.pojo.SacStudent;
import com.sac.pojo.SacStudentExample;
import com.sac.pojo.SacTeacher;
import com.sac.pojo.SacTeacherExample;
import com.sac.utils.MyDate;

@Service
public class HomeService extends BaseService {

	public int addStudent(SacStudent sacStudent) {
		SacStudentExample example = new SacStudentExample();
		example.createCriteria().andStunicknameEqualTo(sacStudent.getStunickname());
		List<SacStudent> list = sacStudentMapper.selectByExample(example);
		if (list.isEmpty()) {
			return sacStudentMapper.insert(sacStudent);
		} else { 
			return 0;
		}
	}

	public boolean login(SacStudent sacStudent) {
		// TODO Auto-generated method stub
		SacStudentExample example = new SacStudentExample();
		example.createCriteria().andStunicknameEqualTo(sacStudent.getStunickname());
		List<SacStudent> list = sacStudentMapper.selectByExample(example);
		if (!list.isEmpty()) {
			if (list.get(0).getStupsw().equals(sacStudent.getStupsw())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public List<SacCourse> showCourseAtHome() {
		// TODO Auto-generated method stub
		SacCourseExample example = new SacCourseExample();
		example.createCriteria().andIshomeEqualTo(1);
		return sacCourseMapper.selectByExample(example);
	}

	public List<SacCourse> showBigAtHome() {
		// TODO Auto-generated method stub
		SacCourseExample example = new SacCourseExample();
		example.createCriteria().andHomepicIsNotNull();
		return sacCourseMapper.selectByExample(example);
	}

	public List<SacCourse> showAllCourse() {
		// TODO Auto-generated method stub
		SacCourseExample example = new SacCourseExample();
		example.createCriteria().andCoursenameIsNotNull();
		return sacCourseMapper.selectByExample(example);
	}

	public List<SacTeacher> showAllTeacher() {
		// TODO Auto-generated method stub
		SacTeacherExample example = new SacTeacherExample();
		example.createCriteria().andTeacheridIsNotNull();
		return sacTeacherMapper.selectByExample(example);

	}

	public List<PostAndPoster> showAllPostAndPoster() {
		// TODO Auto-generated method stub
		SacPostExample example = new SacPostExample();
		example.createCriteria().andPostcontentIsNotNull();
		List<PostAndPoster> list = new ArrayList<>();
		Iterator<SacPost> iterator = sacPostMapper.selectByExample(example).iterator();
		while (iterator.hasNext()) {
			SacPost sacPost = (SacPost) iterator.next();
			SacStudentExample example2 = new SacStudentExample();
			example2.createCriteria().andStunicknameEqualTo(sacPost.getPostername());
			PostAndPoster postAndPoster = new PostAndPoster(sacPost,
					sacStudentMapper.selectByExample(example2).get(0).getStuheadpic());
			postAndPoster.setPostdate(new MyDate(postAndPoster.getPostdate()));
			list.add(postAndPoster);
		}
		return list;
	}

	public SacStudent selectStudent(SacStudent sacStudent) {
		SacStudentExample example = new SacStudentExample();
		example.createCriteria().andStunicknameEqualTo(sacStudent.getStunickname());
		return sacStudentMapper.selectByExample(example).get(0);
		// TODO Auto-generated method stub

	}

	public List<SacCourse> searchCourse(String coursename) {
		// TODO Auto-generated method stub
		SacCourseExample example = new SacCourseExample();
		example.createCriteria().andCoursenameLike("%" + coursename + "%");
		return sacCourseMapper.selectByExample(example);
	}

	public long countCourse() {
		// TODO Auto-generated method stub
		SacCourseExample example = new SacCourseExample();
		example.createCriteria().andCoursenameIsNotNull();
		return sacCourseMapper.countByExample(example);
	}

	public List<SacMessage> allMessage(String sn) {
		// TODO Auto-generated method stub
		SacSchoolExample schoolExample = new SacSchoolExample();
		schoolExample.createCriteria().andSchoolnameEqualTo(sn);
		Integer schoolid = sacSchoolMapper.selectByExample(schoolExample).get(0).getSchoolid();
		SacCooperationExample example2 = new SacCooperationExample();
		example2.createCriteria().andSchoolidEqualTo(schoolid);
		List<SacCooperation> cooperationList = sacCooperationMapper.selectByExample(example2);
		List<String> list = new ArrayList<>();
		if (!cooperationList.isEmpty()) {
			for (SacCooperation sacCooperation : cooperationList) {
				list.add(sacCooperation.getCompanyname());
			}			
		}
		for (String string : list) {
			System.out.println("....."+string);
		}
		SacMessageExample example = new SacMessageExample();
		example.createCriteria().andMessagecompanyIn(list);
		List<SacMessage> selectByExample = sacMessageMapper.selectByExample(example);
		for (SacMessage sacMessage : selectByExample) {
			sacMessage.setMessagedate(new MyDate(sacMessage.getMessagedate()));
		}
		return selectByExample;
	}

}
