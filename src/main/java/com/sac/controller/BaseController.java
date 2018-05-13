package com.sac.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.sac.service.AdminService;
import com.sac.service.CourseService;
import com.sac.service.HomeService;
import com.sac.service.InfoService;
import com.sac.service.MessageService;
import com.sac.service.PostService;

public class BaseController {

	@Autowired
	protected HomeService homeService;
	@Autowired
	protected CourseService courseService;
	@Autowired
	protected InfoService infoService;
	@Autowired
	protected PostService postService;
	@Autowired
	protected AdminService adminService;
	@Autowired
	protected MessageService messageService;
	@Autowired
	protected HttpSession session;
	@Autowired
	protected HttpServletRequest request;
}
