package com.sac.controller;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sac.pojo.SacAdmin;
import com.sac.pojo.SacCourse;
import com.sac.pojo.SacMessage;
import com.sac.pojo.SacStudent;
import com.sac.utils.UploadFile;

@Controller
public class HomeController extends BaseController {

	@RequestMapping("home.do")
	public ModelAndView showHome() {
		Map<String, List<SacCourse>> model = new HashMap<>();
		model.put("homeCourse", homeService.showCourseAtHome());
		model.put("bigCourse", homeService.showBigAtHome());
		return new ModelAndView("home", model);
	}

	@RequestMapping("admin.do")
	public String Admin() {

		return "admin/login";
	}
	@RequestMapping("welcome.do")
	public ModelAndView welcome(SacAdmin admin) {
		Map<String, Object> model = new HashMap<>();
		if (admin == null) {
			admin = (SacAdmin) session.getAttribute("ADMIN");
		}
		if (adminService.login(admin)) {
			admin = adminService.getAdminByUn(admin.getAdminUn());
			session.setAttribute("ADMIN", admin);
			return new ModelAndView("redirect:admin/index.do");
		} else {
			model.put("msg", "用户名或密码错误");
			return new ModelAndView("admin/login",model);
		}
	}
	@RequestMapping("luntan.do")
	public ModelAndView showLuntan(Integer count) {
		Map<String, Object> model = new HashMap<>();
		if (count == null) {
			count = 1;
		}
		if (count <= 0) {
			count++;
		} else if (count > 1 + (homeService.showAllPostAndPoster().size() / 10.0)) {
			count--;
		}
		model.put("allPost", homeService.showAllPostAndPoster());
		model.put("Count", count);
		return new ModelAndView("luntan", model);
	}

	

	@RequestMapping("subject.do")
	public ModelAndView showSubject(Integer count) {
		Map<String, Object> model = new HashMap<>();
		if (count == null) {
			count = 1;
		}
		if (count <= 0) {
			count++;
		} else if (count > 1 + (homeService.countCourse() / 8.0)) {
			count--;
		}
		model.put("allCourse", homeService.showAllCourse());
		model.put("allTeacher", homeService.showAllTeacher());
		model.put("Count", count);
		return new ModelAndView("subject", model);
	}

	@RequestMapping("reg.do")
	public ModelAndView showReg() {
		Map<String, Object> model = new HashMap<>();
		model.put("school", adminService.showSchoolByName(null));
		return new ModelAndView("reg",model);
	}
	@RequestMapping("mes.do")
	public String showMes() {
		return "mes";
	}
	@RequestMapping("search.do")
	public ModelAndView searchCourse(String coursename) {
		Map<String, Object> model = new HashMap<>();
		model.put("searchCourse", homeService.searchCourse(coursename));
		return new ModelAndView("search", model);
	}

	@RequestMapping("addStudent.do")
	public ModelAndView addStudent(@RequestParam("file") MultipartFile file,SacStudent sacStudent,String repsw) {
		Map<String, String> model = new HashMap<>();
		if (!repsw.equals(sacStudent.getStupsw())) {
			model.put("mes", "两次密码不一致");
			return new ModelAndView("reg",model);
		}
		if (!file.isEmpty()) {
			try {
				String filePath = UploadFile.URL + "img/student/" + file.getOriginalFilename();
				file.transferTo(new File(filePath));
				sacStudent.setStuheadpic("img/student/" + file.getOriginalFilename());
			} catch (Exception e) {
				model.put("mes", "注册失败");
				return new ModelAndView("reg",model);
			}
		}else {
			sacStudent.setStuheadpic("img/6A7B06C62CCDEA283B82808E6849B476.jpg");			
		}
		int i = homeService.addStudent(sacStudent);
		if (i == 1) {
			model.put("mes", "注册成功");
			
			session.setAttribute("Login", homeService.selectStudent(sacStudent));
			return new ModelAndView("redirect:home.do",model);
		} else {
			model.put("mes", "注册失败");
			return new ModelAndView("reg",model);
		}
		
	}

	@RequestMapping("login.do")
	public @ResponseBody Map<String, Boolean> login(SacStudent sacStudent, HttpSession session) {
		boolean flag = homeService.login(sacStudent);
		if (flag) {
			SacStudent student = homeService.selectStudent(sacStudent);
			session.setAttribute("Login", student);
		}
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("login", flag);
		return map;

	}

	@RequestMapping("logout.do")
	@ResponseBody
	public void logout(HttpSession session) {
		session.removeAttribute("Login");
	}

	@RequestMapping("mes/xinxi.do")
	public ModelAndView showXinxi(@RequestParam(defaultValue="1",value="pn") Integer pn) {
		Map<String, Object> model = new HashMap<>();
		PageHelper.startPage(pn, 3);
		List<SacMessage> allMessage = homeService.allMessage(((SacStudent)session.getAttribute("Login")).getStuschool());
		PageInfo<SacMessage> pageInfo = new PageInfo<SacMessage>(allMessage);
		model.put("allMessage",pageInfo );
		return new ModelAndView("xinxi", model);
	}

}
