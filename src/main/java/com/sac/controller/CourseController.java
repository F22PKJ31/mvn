package com.sac.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sac.pojo.SacSelectcourse;
import com.sac.pojo.SacStudent;
import com.sac.service.CourseService;

@Controller
public class CourseController  extends BaseController{

	
	@RequestMapping("course.do")
	public ModelAndView showCourse(Integer courseid,HttpSession session) {
		Map<String, Object> model = new HashMap<>();
		SacStudent sacStudent = (SacStudent)session.getAttribute("Login");
		if (sacStudent!=null) {
			model.put("isSelect", courseService.isSelect(sacStudent,courseid));			
		}
		model.put("course", courseService.singleCourse(courseid));
		model.put("lesson", courseService.showLessonByCourseid(courseid));
		return new ModelAndView("course", model);
		
	}
	@RequestMapping("single.do")
	public ModelAndView singleCourse(Integer lessonid) {
		Map<String, Object> model = new HashMap<>();
		model.put("single", courseService.singleLesson(lessonid));
		return new ModelAndView("single", model);
		
	}
	@RequestMapping("selectcoures.do")
	public ModelAndView selectCourse(Integer courseid,HttpSession session) {
		SacSelectcourse sacSelectcourse = new SacSelectcourse();
		sacSelectcourse.setCourseid(courseid);
		SacStudent sacStudent = (SacStudent)session.getAttribute("Login");
		sacSelectcourse.setStuid(sacStudent.getStuid());
		sacSelectcourse.setCourseid(courseid);
		Map<String, Object> model = new HashMap<>();
		model.put("select", courseService.selectCourse(sacSelectcourse));
		return new ModelAndView("redirect:/course.do?courseid="+courseid, model);
		
	}
	@RequestMapping("teacher.do")
	public ModelAndView showTeacher(Integer teacherid) {
		Map<String, Object> model = new HashMap<>();
		model.put("teacher", courseService.showTeacher(teacherid));
		model.put("course", courseService.coursesByTeacher(teacherid));
		return new ModelAndView("teacher", model);
		
	}
}
