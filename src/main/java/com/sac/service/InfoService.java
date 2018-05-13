package com.sac.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sac.dao.SacCommentMapper;
import com.sac.dao.SacCourseMapper;
import com.sac.dao.SacPostMapper;
import com.sac.dao.SacSelectcourseMapper;
import com.sac.dao.SacStudentMapper;
import com.sac.pojo.SacComment;
import com.sac.pojo.SacCommentExample;
import com.sac.pojo.SacCourse;
import com.sac.pojo.SacCourseExample;
import com.sac.pojo.SacPost;
import com.sac.pojo.SacPostExample;
import com.sac.pojo.SacSelectcourse;
import com.sac.pojo.SacSelectcourseExample;
import com.sac.pojo.SacSelectcourseExample.Criteria;

@Service
public class InfoService extends BaseService {

	public List<SacCourse> showCourseAtInfo(Integer stuid) {
		// TODO Auto-generated method stub
		SacSelectcourseExample example = new SacSelectcourseExample();
		example.createCriteria().andStuidEqualTo(stuid);
		List<SacSelectcourse> list = sacSelectcourseMapper.selectByExample(example);
		List<SacCourse> list2 = new ArrayList<>();
		for (SacSelectcourse sacSelectcourse : list) {
			list2.add(showCourseById(sacSelectcourse.getCourseid()).get(0));
		}
		return list2;
	}

	public List<SacCourse> showCourseById(Integer courseid) {
		// TODO Auto-generated method stub
		SacCourseExample example = new SacCourseExample();
		example.createCriteria().andCourseidEqualTo(courseid);
		return sacCourseMapper.selectByExample(example);
	}

	public List<SacPost> showPostAtInfo(String postername) {
		// TODO Auto-generated method stub
		SacPostExample example = new SacPostExample();
		example.createCriteria().andPosternameEqualTo(postername);
		return sacPostMapper.selectByExample(example);
	}

	public List<SacComment> showCommentAtInfo(String stuname) {
		// TODO Auto-generated method stub
		SacCommentExample example = new SacCommentExample();
		example.createCriteria().andStudentnameEqualTo(stuname);
		return sacCommentMapper.selectByExample(example);
	}

	public boolean concelCourse(Integer courseid, Integer stuid) {
		// TODO Auto-generated method stub
		SacSelectcourseExample example = new SacSelectcourseExample();
		Criteria criteria = example.createCriteria();
		criteria.andCourseidEqualTo(courseid);
		criteria.andStuidEqualTo(stuid);
		return sacSelectcourseMapper.deleteByExample(example) >= 1;
	}

	public boolean concelPost(Integer postid) {
		// TODO Auto-generated method stub
		SacCommentExample example = new SacCommentExample();
		example.createCriteria().andPostidEqualTo(postid);
		sacCommentMapper.deleteByExample(example);
		return sacPostMapper.deleteByPrimaryKey(postid) >= 1;
	}

	public boolean concelComment(Integer commentid) {
		// TODO Auto-generated method stub
		return sacCommentMapper.deleteByPrimaryKey(commentid) >= 1;
	}
}
