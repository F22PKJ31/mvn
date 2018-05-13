package com.sac.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sac.pojo.SacAdmin;
import com.sac.pojo.SacAdminExample;
import com.sac.pojo.SacComment;
import com.sac.pojo.SacCommentExample;
import com.sac.pojo.SacCompany;
import com.sac.pojo.SacCompanyExample;
import com.sac.pojo.SacCooperation;
import com.sac.pojo.SacCooperationExample;
import com.sac.pojo.SacCourse;
import com.sac.pojo.SacCourseExample;
import com.sac.pojo.SacCourseExample.Criteria;
import com.sac.utils.MyDate;
import com.sac.pojo.SacLesson;
import com.sac.pojo.SacLessonExample;
import com.sac.pojo.SacMessage;
import com.sac.pojo.SacMessageExample;
import com.sac.pojo.SacPost;
import com.sac.pojo.SacPostExample;
import com.sac.pojo.SacSchool;
import com.sac.pojo.SacSchoolExample;
import com.sac.pojo.SacSelectcourseExample;
import com.sac.pojo.SacStudent;
import com.sac.pojo.SacStudentExample;
import com.sac.pojo.SacTeacher;
import com.sac.pojo.SacTeacherExample;

@Service
public class AdminService extends BaseService {

	public boolean addCourse(SacCourse sacCourse) {
		// TODO Auto-generated method stub
		int i = sacCourseMapper.insert(sacCourse);
		if (i>=1) {
			return true;
		}else {
			return false;
		}
		
	}

	public boolean login(SacAdmin admin) {
		// TODO Auto-generated method stub
		SacAdminExample example = new SacAdminExample();
		example.createCriteria().andAdminUnEqualTo(admin.getAdminUn());
		List<SacAdmin> list = sacAdminMapper.selectByExample(example);
		if (list.isEmpty()) {
			return false;
		}else if (list.get(0).getAdminPsw().equals(admin.getAdminPsw())) {
			System.out.println(list.get(0).getAdminPsw());
			System.out.println(admin.getAdminPsw());
			return true;
		}else {
			return false;
		}
	}

	public int removeCourse(int courseid) {
		// TODO Auto-generated method stub
		SacSelectcourseExample example = new SacSelectcourseExample();
		example.createCriteria().andCourseidEqualTo(courseid);
		sacSelectcourseMapper.deleteByExample(example);
		SacLessonExample lessonExample = new SacLessonExample();
		lessonExample.createCriteria().andCourseidEqualTo(courseid);
		sacLessonMapper.deleteByExample(lessonExample);
		return sacCourseMapper.deleteByPrimaryKey(courseid);
	}

	public int updateCourse(SacCourse sacCourse) {
		// TODO Auto-generated method stub
		return sacCourseMapper.updateByPrimaryKeySelective(sacCourse);
	}

	public List<SacStudent> showAllStudent(String un) {
		// TODO Auto-generated method stub
		SacStudentExample example = new SacStudentExample();
		com.sac.pojo.SacStudentExample.Criteria createCriteria = example.createCriteria();
		createCriteria.andStuidIsNotNull();
		if (un!=null&&!un.equals("")) {
			createCriteria.andStunicknameLike("%"+un+"%");
		}
		return sacStudentMapper.selectByExample(example);
	}

	public int removeStudent(int stuid) {
		// TODO Auto-generated method stub
		return sacStudentMapper.deleteByPrimaryKey(stuid);
	}

	public int updateStudent(SacStudent sacStudent) {
		// TODO Auto-generated method stub
		return sacStudentMapper.updateByPrimaryKeySelective(sacStudent);
	}

	public SacStudent getStudentByid(Integer stuid) {
		// TODO Auto-generated method stub
		return sacStudentMapper.selectByPrimaryKey(stuid);
	}

	public int removeLesson(int lessonid) {
		// TODO Auto-generated method stub
		return sacLessonMapper.deleteByPrimaryKey(lessonid);
	}

	public boolean addLesson(SacLesson sacLesson) {
		// TODO Auto-generated method stub
		int i = sacLessonMapper.insert(sacLesson);
		if (i>=1) {
			return true;
		}else {
			return false;
		}
	}

	public int updateLesson(SacLesson sacLesson) {
		// TODO Auto-generated method stub
		return sacLessonMapper.updateByPrimaryKeySelective(sacLesson);
	}

	public List<SacCourse> showCourseByName(Integer ishome, String teacher, String cn) {
		// TODO Auto-generated method stub
		SacCourseExample example = new SacCourseExample();
		Criteria criteria = example.createCriteria();
		criteria.andCoursenameIsNotNull();
		if (cn!=null) 
			if (!cn.equals("")) 			
				criteria.andCoursenameLike("%"+cn+"%");			
		if (ishome!=null) 
			if (!ishome.equals("")) 	
				criteria.andIshomeEqualTo(ishome);			
		if (teacher!=null) 
			if (!teacher.equals("")) 
				criteria.andCourseteacherEqualTo(teacher);		
		return sacCourseMapper.selectByExample(example);
	}
	public int removeTeacher(int teacherid) {
		int deleteByPrimaryKey = sacTeacherMapper.deleteByPrimaryKey(teacherid);
		return deleteByPrimaryKey;
	}
	public int updateTeacher(SacTeacher sacTeacher) {
		return sacTeacherMapper.updateByPrimaryKeySelective(sacTeacher);
	}
	public SacTeacher getTeacherById(int teacherid) {
		// TODO Auto-generated method stub
		return sacTeacherMapper.selectByPrimaryKey(teacherid);
	}
	public boolean addTeacher(SacTeacher sacTeacher) {
		// TODO Auto-generated method stub
		int i = sacTeacherMapper.insert(sacTeacher);
		if (i>=1) {
			return true;
		}else {
			return false;
		}
		
	}

	public List<SacLesson> getLessonByNameAndCourseid(String ln, Integer courseid) {
		// TODO Auto-generated method stub
		SacLessonExample example = new SacLessonExample();
		com.sac.pojo.SacLessonExample.Criteria criteria = example.createCriteria();
		criteria.andCourseidEqualTo(courseid);
		if (ln!=null) {
			criteria.andLessonnameLike("%"+ln+"%");			
		}
		return sacLessonMapper.selectByExample(example);			
	}

	public List<SacTeacher> showTeacherByName(String tn) {
		// TODO Auto-generated method stub
		SacTeacherExample example = new SacTeacherExample();
		com.sac.pojo.SacTeacherExample.Criteria criteria = example.createCriteria();
		criteria.andTeacheridIsNotNull();
		if (tn!=null) {
			criteria.andTeachernameLike("%"+tn+"%");			
		}
		return sacTeacherMapper.selectByExample(example);
	}

	public int addCompany(SacCompany sacCompany) {
		// TODO Auto-generated method stub
		return sacCompanyMapper.insert(sacCompany);
	}

	public Object showCompanyByName(String tn) {
		// TODO Auto-generated method stub
		SacCompanyExample example = new SacCompanyExample();
		com.sac.pojo.SacCompanyExample.Criteria criteria = example.createCriteria();
		criteria.andCompanyidIsNotNull();
		if (tn!=null) {
			criteria.andCompanynameLike("%"+tn+"%");			
		}
		return sacCompanyMapper.selectByExample(example);
	}

	public int removeCompany(int companyid) {
		// TODO Auto-generated method stub
		return sacCompanyMapper.deleteByPrimaryKey(companyid);
	}

	public int updateCompany(SacCompany sacCompany) {
		// TODO Auto-generated method stub
		return sacCompanyMapper.updateByPrimaryKeySelective(sacCompany);
	}

	public Object getCompanyById(int companyid) {
		// TODO Auto-generated method stub
		return sacCompanyMapper.selectByPrimaryKey(companyid);
	}

	public int addSchool(SacSchool sacSchool) {
		// TODO Auto-generated method stub
		return sacSchoolMapper.insert(sacSchool);
	}

	public Object showSchoolByName(String tn) {
		// TODO Auto-generated method stub
		SacSchoolExample example = new SacSchoolExample();
		com.sac.pojo.SacSchoolExample.Criteria criteria = example.createCriteria();
		criteria.andSchoolidIsNotNull();
		if (tn!=null) {
			criteria.andSchoolnameLike("%"+tn+"%");			
		}
		return sacSchoolMapper.selectByExample(example);
	}

	public Object getSchoolById(int schoolid) {
		// TODO Auto-generated method stub
		return sacSchoolMapper.selectByPrimaryKey(schoolid);
	}

	public int removeSchool(int schoolid) {
		// TODO Auto-generated method stub
		return sacSchoolMapper.deleteByPrimaryKey(schoolid);
	}

	public int updateSchool(SacSchool sacSchool) {
		// TODO Auto-generated method stub
		return sacSchoolMapper.updateByPrimaryKeySelective(sacSchool);
	}

	public Object getCooperationByNameAndSchoolid(String ln, Integer schoolid) {
		// TODO Auto-generated method stub
		SacCooperationExample example = new SacCooperationExample();
		com.sac.pojo.SacCooperationExample.Criteria criteria = example.createCriteria();
		if (ln!=null) {
			criteria.andCompanynameLike("%"+ln+"%");
		}
		criteria.andSchoolidEqualTo(schoolid);
		return sacCooperationMapper.selectByExample(example);
	}

	public List<SacCompany> getAllCompany() {
		// TODO Auto-generated method stub
		SacCompanyExample example = new SacCompanyExample();
		example.createCriteria().andCompanyidIsNotNull();
		return sacCompanyMapper.selectByExample(example);
	}

	public int addCooperation(SacCooperation sacCooperation) {
		// TODO Auto-generated method stub
		return sacCooperationMapper.insert(sacCooperation);
	}

	public int updateCooperation(SacCooperation sacCooperation) {
		// TODO Auto-generated method stub
		return sacCooperationMapper.updateByPrimaryKeySelective(sacCooperation);
	}

	public int removeCooperation(int cooperation) {
		// TODO Auto-generated method stub
		return sacCooperationMapper.deleteByPrimaryKey(cooperation);
	}

	public int updateAdmin(SacAdmin admin) {
		// TODO Auto-generated method stub
		return sacAdminMapper.updateByPrimaryKeySelective(admin);
	}

	public SacAdmin getAdminByUn(String adminUn) {
		// TODO Auto-generated method stub
		SacAdminExample example = new SacAdminExample();
		example.createCriteria().andAdminUnEqualTo(adminUn);
		return sacAdminMapper.selectByExample(example).get(0);
	}

	public List<SacPost> showPostByTitleAndPoster(String pt, String pn) {
		// TODO Auto-generated method stub
		SacPostExample example = new SacPostExample();
		com.sac.pojo.SacPostExample.Criteria criteria = example.createCriteria();
		criteria.andPostidIsNotNull();
		if (pt!=null) {
			criteria.andPosttitleLike("%"+pt+"%");			
		}
		if (pn!=null) {
			criteria.andPosternameLike("%"+pn+"%");
			System.out.println(pn);
		}
		List<SacPost> postsList = sacPostMapper.selectByExample(example);
		for (SacPost sacPost : postsList) {
			sacPost.setPostdate(new MyDate(sacPost.getPostdate()));
		}
		return postsList;
	}

	public int removePost(int postid) {
		// TODO Auto-generated method stub
		SacCommentExample example = new SacCommentExample();
		example.createCriteria().andPostidEqualTo(postid);
		sacCommentMapper.deleteByExample(example);
		return sacPostMapper.deleteByPrimaryKey(postid);
	}

	public Object getCommentByCommenterAndPostid(String ln, Integer postid) {
		// TODO Auto-generated method stub
		SacCommentExample example = new SacCommentExample();
		com.sac.pojo.SacCommentExample.Criteria criteria = example.createCriteria();
		criteria.andPostidEqualTo(postid);
		if (ln!=null) {
			criteria.andStudentnameLike("%"+ln+"%");
		}
		List<SacComment> commentsList = sacCommentMapper.selectByExample(example);
		for (SacComment sacComment : commentsList) {
			sacComment.setCommentdate(new MyDate(sacComment.getCommentdate()));
		}
		return commentsList;
	}

	public int removeComment(int commentid) {
		// TODO Auto-generated method stub
		return sacCommentMapper.deleteByPrimaryKey(commentid);
	}

	public Object getMessageByTitleAndCompanyid(String mt, Integer companyid) {
		// TODO Auto-generated method stub
		SacMessageExample example = new SacMessageExample();
		com.sac.pojo.SacMessageExample.Criteria criteria = example.createCriteria();
		criteria.andMessagecompanyEqualTo(sacCompanyMapper.selectByPrimaryKey(companyid).getCompanyname());
		if (mt!=null) {
			criteria.andMessagetitleLike("%"+mt+"%");
		}
		List<SacMessage> messagelist = sacMessageMapper.selectByExample(example);
		if (!messagelist.isEmpty()) {
			for (SacMessage sacMessage : messagelist) {
				sacMessage.setMessagedate(new MyDate(sacMessage.getMessagedate()));
			}			
		}
		return messagelist;
	}

	public int removeMessage(int messageid) {
		// TODO Auto-generated method stub
		return sacMessageMapper.deleteByPrimaryKey(messageid);
	}

	public Object getMessageById(Integer messageid) {
		// TODO Auto-generated method stub
		return sacMessageMapper.selectByPrimaryKey(messageid);
	}

	public int addMessage(SacMessage sacMessage, Integer companyid) {
		// TODO Auto-generated method stub
		sacMessage.setMessagecompany(sacCompanyMapper.selectByPrimaryKey(companyid).getCompanyname());
		sacMessage.setMessagedate(new Date());
		return sacMessageMapper.insert(sacMessage);
	}

	public int updateMessage(SacMessage sacMessage) {
		// TODO Auto-generated method stub
		sacMessage.setMessagedate(new Date());
		return sacMessageMapper.updateByPrimaryKeySelective(sacMessage);
	}

	
	
	
}
