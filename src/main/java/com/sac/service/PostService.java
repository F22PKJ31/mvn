package com.sac.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sac.pojo.CommentAndStudentPic;
import com.sac.pojo.SacComment;
import com.sac.pojo.SacCommentExample;
import com.sac.pojo.SacPost;
import com.sac.pojo.SacStudentExample;
import com.sac.utils.MyDate;

@Service
public class PostService extends BaseService {

	public int addPost(SacPost post) {
		post.setPostdate(new Date());
		if (sacPostMapper.insert(post) >= 1) {
			return 0;
		} else {
			return 1;
		}
	}

	public SacPost getPostById(Integer postid) {
		// TODO Auto-generated method stub

		return sacPostMapper.selectByPrimaryKey(postid);
	}

	public List<CommentAndStudentPic> getCommentByPostId(Integer postid) {
		SacStudentExample sacStudentExample = new SacStudentExample();
		SacCommentExample sacCommentExample = new SacCommentExample();
		sacCommentExample.createCriteria().andPostidEqualTo(postid);
		List<SacComment> selectByExample = sacCommentMapper.selectByExample(sacCommentExample);
		List<CommentAndStudentPic> list = new ArrayList<>();
		for (SacComment sacComment : selectByExample) {
			sacStudentExample.createCriteria().andStunicknameEqualTo(sacComment.getStudentname());
			CommentAndStudentPic c = new CommentAndStudentPic(sacStudentMapper.selectByExample(sacStudentExample).get(0).getStuheadpic());
			sacComment.setCommentdate(new MyDate(sacComment.getCommentdate()));
			c.setSacComment(sacComment);
			list.add(c);
			sacStudentExample.clear();
		}
		return list;
	}

	public void addCommend(SacComment sacComment) {
		// TODO Auto-generated method stub
		sacComment.setCommentdate(new Date());
		sacCommentMapper.insert(sacComment);
	}
}
