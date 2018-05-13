package com.sac.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sac.pojo.SacStudent;

@Controller
public class InfoController  extends BaseController{

	
	@RequestMapping("info.do")
	public ModelAndView showInfo(HttpSession session,Integer index) {
		Map<String, Object> model = new HashMap<>();
		if (index == null) {
			index = 1;
		}
		SacStudent student = (SacStudent) session.getAttribute("Login");
		if (student==null) {
			return new ModelAndView("redirect:/home.do");
		}else{
			if (index == 1) {
				model.put("infoCourse", infoService.showCourseAtInfo(student.getStuid()));
			}else if (index == 2) {
				model.put("infoPost", infoService.showPostAtInfo(student.getStunickname()));
			}else{
				model.put("infoComment", infoService.showCommentAtInfo(student.getStunickname()));
			}
			return new ModelAndView("info",model);			
		}
	}
	
	@RequestMapping("concelCourse.do")
	public @ResponseBody Map<String, Boolean> concelCourse(Integer courseid,HttpSession session) {
		SacStudent student = (SacStudent) session.getAttribute("Login");
		boolean flag = infoService.concelCourse(courseid,student.getStuid());
		Map<String,Boolean> map = new HashMap<String,Boolean>();
		map.put("mes", flag);
		return map;	
	}
	
	@RequestMapping("concelPost.do")
	public @ResponseBody Map<String, Boolean> concelPost(Integer postid) {
		System.out.println(postid);
		boolean flag = infoService.concelPost(postid);
		Map<String,Boolean> map = new HashMap<String,Boolean>();
		map.put("mes", flag);
		return map;	
	}
	
	@RequestMapping("concelComment.do")
	public @ResponseBody Map<String, Boolean> concelComment(Integer commentid) {
		boolean flag = infoService.concelComment(commentid);
		Map<String,Boolean> map = new HashMap<String,Boolean>();
		map.put("mes", flag);
		return map;	
	}
}
