package com.sac.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sac.dao.SacAdminMapper;
import com.sac.dao.SacCommentMapper;
import com.sac.dao.SacCompanyMapper;
import com.sac.dao.SacCooperationMapper;
import com.sac.dao.SacCourseMapper;
import com.sac.dao.SacLessonMapper;
import com.sac.dao.SacMessageMapper;
import com.sac.dao.SacPostMapper;
import com.sac.dao.SacSchoolMapper;
import com.sac.dao.SacSelectcourseMapper;
import com.sac.dao.SacStudentMapper;
import com.sac.dao.SacTeacherMapper;
import com.sac.pojo.SacCourseExample;

public class BaseService {

	@Autowired
	protected SacCourseMapper sacCourseMapper;
	@Autowired
	protected SacLessonMapper sacLessonMapper;
	@Autowired
	protected SacSelectcourseMapper sacSelectcourseMapper;
	@Autowired
	protected SacTeacherMapper sacTeacherMapper;
	@Autowired
	protected SacStudentMapper sacStudentMapper;
	@Autowired
	protected SacPostMapper sacPostMapper;
	@Autowired
	protected SacCommentMapper sacCommentMapper;
	@Autowired
	protected SacAdminMapper sacAdminMapper;
	@Autowired
	protected SacMessageMapper sacMessageMapper;
	@Autowired
	protected SacSchoolMapper sacSchoolMapper;
	@Autowired
	protected SacCompanyMapper sacCompanyMapper;
	@Autowired
	protected SacCooperationMapper sacCooperationMapper;
	
}
