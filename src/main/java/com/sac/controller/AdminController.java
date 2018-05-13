package com.sac.controller;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sac.pojo.SacAdmin;
import com.sac.pojo.SacCompany;
import com.sac.pojo.SacCooperation;
import com.sac.pojo.SacCourse;
import com.sac.pojo.SacLesson;
import com.sac.pojo.SacMessage;
import com.sac.pojo.SacSchool;
import com.sac.pojo.SacStudent;
import com.sac.pojo.SacTeacher;
import com.sac.utils.UploadFile;

@RequestMapping("admin")
@Controller
public class AdminController extends BaseController {

	@RequestMapping("index.do")
	public String Admin() {
		return "admin/index";
	}

	@RequestMapping("logout.do")
	public String Logout() {
		session.removeAttribute("ADMIN");
		return "redirect:/admin.do";
	}

	@RequestMapping("showCourseAdd.do")
	public ModelAndView showCourseAdd() {
		Map<String, Object> model = new HashMap<>();
		List<SacTeacher> showAllTeacher = homeService.showAllTeacher();
		model.put("allteacher", showAllTeacher);
		return new ModelAndView("admin/courseAdd", model);
	}

	@RequestMapping("showLessonAdd.do")
	public ModelAndView showLessonAdd(Integer courseid) {
		Map<String, Object> model = new HashMap<>();
		model.put("courseid", courseid);
		return new ModelAndView("admin/lessonAdd", model);
	}

	@RequestMapping("showLessonUpdate.do")
	public ModelAndView showLessonUpdate(Integer lessonid) {
		Map<String, Object> model = new HashMap<>();
		model.put("lesson", courseService.singleLesson(lessonid));
		return new ModelAndView("admin/lessonUpdate", model);
	}

	@RequestMapping("addCourse.do")
	public ModelAndView addCourse(@RequestParam("file") MultipartFile file, @RequestParam("file2") MultipartFile file2,
			SacCourse sacCourse) {
		Map<String, Object> model = new HashMap<>();
		if (!file.isEmpty()) {
			try {
				if (!file2.isEmpty()) {
					String filePath2 = UploadFile.URL + "img/course/" + file2.getOriginalFilename();
					file2.transferTo(new File(filePath2));
					sacCourse.setHomepic("img/course/" + file2.getOriginalFilename());
				}
				String filePath = UploadFile.URL + "img/course/" + file.getOriginalFilename();

				file.transferTo(new File(filePath));
				sacCourse.setCoursepic("img/course/" + file.getOriginalFilename());
				boolean flag = adminService.addCourse(sacCourse);
				if (flag) {
					return new ModelAndView("redirect:showCourseList.do");
				} else {
					model.put("msg", "失败");
					return new ModelAndView("redirect:showCourseAdd.do", model);
				}

			} catch (Exception e) {
				model.put("msg", "失败");
				return new ModelAndView("redirect:showCourseAdd.do", model);
			}

		} else {
			model.put("msg", "失败");
			return new ModelAndView("redirect:showCourseAdd.do", model);
		}
	}

	@RequestMapping("addLesson.do")
	public ModelAndView addLesson(@RequestParam("file") MultipartFile file, SacLesson sacLesson) {
		Map<String, Object> model = new HashMap<>();
		model.put("courseid", sacLesson.getCourseid());
		if (!file.isEmpty()) {
			try {

				String filePath = UploadFile.URL + "video/" + file.getOriginalFilename();

				file.transferTo(new File(filePath));
				sacLesson.setLessonsrc("video/" + file.getOriginalFilename());
				boolean flag = adminService.addLesson(sacLesson);
				if (flag) {
					return new ModelAndView("redirect:showCourseView.do", model);
				} else {
					model.put("msg", "失败");
					return new ModelAndView("redirect:showLessonAdd.do", model);
				}

			} catch (Exception e) {
				model.put("msg", "失败");
				return new ModelAndView("redirect:showLessonAdd.do", model);
			}
		} else {
			model.put("msg", "失败");
			return new ModelAndView("redirect:showLessonAdd.do", model);
		}
	}

	@RequestMapping("addStudent.do")
	public ModelAndView addStudent(@RequestParam("file") MultipartFile file, SacStudent sacStudent) {
		Map<String, Object> model = new HashMap<>();
		if (!file.isEmpty()) {
			try {

				String filePath = UploadFile.URL + "img/student/" + file.getOriginalFilename();

				file.transferTo(new File(filePath));
				sacStudent.setStuheadpic("img/student/" + file.getOriginalFilename());
				int flag = homeService.addStudent(sacStudent);
				if (flag == 1) {
					return new ModelAndView("redirect:showStudentList.do");
				} else {
					model.put("msg", "失败");
					return new ModelAndView("redirect:showStudentAdd.do", model);
				}

			} catch (Exception e) {
				model.put("msg", "失败");
				return new ModelAndView("redirect:showStudentAdd.do", model);
			}
		} else {
			model.put("msg", "失败");
			return new ModelAndView("redirect:showStudentAdd.do", model);
		}
	}

	@RequestMapping("showStudentAdd.do")
	public ModelAndView showStudentAdd() {
		Map<String, Object> model = new HashMap<>();
		model.put("school",adminService.showSchoolByName(null));
		return new ModelAndView("admin/studentAdd",model);
	}

	@RequestMapping("showStudentUpdate.do")
	public ModelAndView showStudentUpdate(Integer stuid) {
		Map<String, Object> model = new HashMap<>();
		model.put("stu", adminService.getStudentByid(stuid));
		model.put("school",adminService.showSchoolByName(null));
		return new ModelAndView("admin/studentUpdate", model);
	}

	@RequestMapping("showCourseList.do")
	public ModelAndView showCourseList(Integer ishome, String teacher, String cn) {
		Map<String, Object> model = new HashMap<>();
		model.put("allCourseList", adminService.showCourseByName(ishome, teacher, cn));
		model.put("teachers", homeService.showAllTeacher());
		return new ModelAndView("admin/courseList", model);
	}

	@RequestMapping("showStudentList.do")
	public ModelAndView showStudentList(String un) {
		Map<String, Object> model = new HashMap<>();
		System.out.println(un);
		model.put("showStudentList", adminService.showAllStudent(un));
		return new ModelAndView("admin/studentList", model);
	}

	@RequestMapping("showCourseUpdate.do")
	public ModelAndView showCourseUpdate(Integer courseid) {
		Map<String, Object> model = new HashMap<>();
		List<SacTeacher> showAllTeacher = homeService.showAllTeacher();
		model.put("allteacher", showAllTeacher);
		model.put("course", courseService.singleCourse(courseid));
		return new ModelAndView("admin/courseUpdate", model);
	}

	@RequestMapping("showCourseView.do")
	public ModelAndView showCourseView(Integer courseid, String ln) {
		Map<String, Object> model = new HashMap<>();
		model.put("allLessonList", adminService.getLessonByNameAndCourseid(ln, courseid));
		return new ModelAndView("admin/courseView", model);
	}

	@RequestMapping("removeCourse.do")
	public @ResponseBody Map<String, Object> removeCourse(int courseid) {
		Map<String, Object> model = new HashMap<>();
		int flag = adminService.removeCourse(courseid);
		if (flag == 1) {
			model.put("ret", 1);
		} else {
			model.put("ret", 0);
		}
		return model;

	}

	@RequestMapping("removeLesson.do")
	public @ResponseBody Map<String, Object> removeLesson(int lessonid) {
		Map<String, Object> model = new HashMap<>();
		int flag = adminService.removeLesson(lessonid);
		if (flag == 1) {
			model.put("ret", 1);
		} else {
			model.put("ret", 0);
		}
		return model;

	}

	@RequestMapping("removeStudent.do")
	public @ResponseBody Map<String, Object> removeStudent(int stuid) {
		Map<String, Object> model = new HashMap<>();
		int flag = adminService.removeStudent(stuid);
		if (flag == 1) {
			model.put("ret", 1);
		} else {
			model.put("ret", 0);
		}
		return model;
	}

	@RequestMapping("updateCourse.do")
	public ModelAndView updateCourse(@RequestParam("file") MultipartFile file,
			@RequestParam("file2") MultipartFile file2, SacCourse sacCourse, Integer ishomepic) {
		Map<String, Object> model = new HashMap<>();
		System.out.println("123" + ishomepic);
		try {
			if (!file.isEmpty()) {
				String filePath = UploadFile.URL + "img/course/" + file.getOriginalFilename();
				file.transferTo(new File(filePath));
				sacCourse.setCoursepic("img/course/" + file.getOriginalFilename());
			}
			if (ishomepic == 0) {
				sacCourse.setHomepic("没有主页图片");
			} else if (!file2.isEmpty()) {
				String filePath2 = UploadFile.URL + "img/course/" + file2.getOriginalFilename();
				file2.transferTo(new File(filePath2));
				sacCourse.setHomepic("img/course/" + file2.getOriginalFilename());
			}
		} catch (Exception e) {
			model.put("msg", "失败");
			return new ModelAndView("redirect:showCourseUpdate.do?courseid=" + sacCourse.getCourseid(), model);
		}
		int flag = adminService.updateCourse(sacCourse);
		if (flag == 1) {
			return new ModelAndView("redirect:showCourseList.do");
		} else {
			model.put("msg", "失败");
			return new ModelAndView("redirect:showCourseUpdate.do?courseid=" + sacCourse.getCourseid(), model);
		}
	}

	@RequestMapping("updateLesson.do")
	public ModelAndView updateLesson(@RequestParam("file") MultipartFile file, SacLesson sacLesson) {
		Map<String, Object> model = new HashMap<>();
		if (!file.isEmpty()) {
			try {
				String filePath = UploadFile.URL + "video/" + file.getOriginalFilename();
				file.transferTo(new File(filePath));
				sacLesson.setLessonsrc("video/" + file.getOriginalFilename());
			} catch (Exception e) {
				model.put("msg", "失败");
				return new ModelAndView("redirect:showLessonUpdate.do?lessonid=" + sacLesson.getLessonid(), model);
			}
		}
		int flag = adminService.updateLesson(sacLesson);
		if (flag == 1) {
			return new ModelAndView("redirect:showCourseView.do?courseid=" + sacLesson.getCourseid());
		} else {
			model.put("msg", "失败");
			return new ModelAndView("redirect:showLessonUpdate.do?lessonid=" + sacLesson.getLessonid(), model);
		}
	}

	@RequestMapping("updateStudent.do")
	public ModelAndView updateStudent(@RequestParam("file") MultipartFile file, SacStudent sacStudent) {
		Map<String, Object> model = new HashMap<>();
		if (!file.isEmpty()) {
			try {

				String filePath = UploadFile.URL + "img/student/" + file.getOriginalFilename();

				file.transferTo(new File(filePath));
				sacStudent.setStuheadpic("img/student/" + file.getOriginalFilename());

			} catch (Exception e) {
				model.put("msg", "失败");
				return new ModelAndView("redirect:showStudentUpdate.do?stuid=" + sacStudent.getStuid(), model);
			}
		}
		int flag = adminService.updateStudent(sacStudent);
		if (flag == 1) {
			return new ModelAndView("redirect:showStudentList.do");
		} else {
			model.put("msg", "失败");
			return new ModelAndView("redirect:showStudentUpdate.do?stuid=" + sacStudent.getStuid(), model);
		}
	}

	@RequestMapping("addTeacher.do")
	public ModelAndView addTeacher(@RequestParam("file") MultipartFile file, SacTeacher sacTeacher) {
		Map<String, Object> model = new HashMap<>();
		if (!file.isEmpty()) {
			try {

				String filePath = UploadFile.URL + "img/" + file.getOriginalFilename();

				file.transferTo(new File(filePath));
				sacTeacher.setTeacherpic("img/" + file.getOriginalFilename());
				boolean flag = adminService.addTeacher(sacTeacher);
				if (flag) {
					return new ModelAndView("redirect:showTeacherList.do");
				} else {
					model.put("msg", "添加失败");
					return new ModelAndView("redirect:showTeacherAdd.do", model);
				}

			} catch (Exception e) {
				model.put("msg", "上传失败");
				return new ModelAndView("redirect:showTeacherAdd.do", model);
			}
		} else {
			model.put("msg", "没有图片失败");
			return new ModelAndView("redirect:showTeacherAdd.do", model);
		}
	}

	@RequestMapping("showTeacherList.do")
	public ModelAndView showTeacherList(String tn) {
		Map<String, Object> model = new HashMap<>();
		model.put("allTeacherList", adminService.showTeacherByName(tn));
		return new ModelAndView("admin/teacherList", model);
	}

	@RequestMapping("showTeacherAdd.do")
	public ModelAndView showTeacherAdd() {
		return new ModelAndView("admin/teacherAdd");
	}

	@RequestMapping("showTeacherUpdate.do")
	public ModelAndView showTeacherUpdate(int teacherid) {
		Map<String, Object> model = new HashMap<>();
		model.put("teacher", adminService.getTeacherById(teacherid));
		return new ModelAndView("admin/teacherUpdate", model);
	}

	@RequestMapping("removeTeacher.do")
	public @ResponseBody Map<String, Object> removeTeacher(int teacherid) {
		Map<String, Object> model = new HashMap<>();
		int flag = adminService.removeTeacher(teacherid);
		if (flag == 1) {
			model.put("ret", 1);
		} else {
			model.put("ret", 0);
		}
		return model;
	}

	@RequestMapping("updateTeacher.do")
	public ModelAndView updateTeacher(@RequestParam("file") MultipartFile file, SacTeacher sacTeacher) {
		Map<String, Object> model = new HashMap<>();
		if (!file.isEmpty()) {
			try {
				String filePath = UploadFile.URL + "img/" + file.getOriginalFilename();
				file.transferTo(new File(filePath));
				sacTeacher.setTeacherpic("img/" + file.getOriginalFilename());

			} catch (Exception e) {
				model.put("msg", "失败");
				return new ModelAndView("redirect:showTeacherUpdate.do?teacherid=" + sacTeacher.getTeacherid(), model);
			}
		}
		int flag = adminService.updateTeacher(sacTeacher);
		if (flag == 1) {
			return new ModelAndView("redirect:showTeacherList.do");
		} else {
			model.put("msg", "失败");
			return new ModelAndView("redirect:showTeacherUpdate.do?teacherid=" + sacTeacher.getTeacherid(), model);
		}
	}

	@RequestMapping("showStudentView.do")
	public ModelAndView showStudentView(Integer stuid,@RequestParam(value="index",defaultValue="1")Integer index) {
		Map<String, Object> model = new HashMap<>();
		SacStudent student = adminService.getStudentByid(stuid);
		if (index == 1) {
			model.put("CourseList", infoService.showCourseAtInfo(student.getStuid()));
		}else if (index == 2) {
			model.put("PostList", infoService.showPostAtInfo(student.getStunickname()));
		}else{
			model.put("CommentList", infoService.showCommentAtInfo(student.getStunickname()));
		}
		return new ModelAndView("admin/studentView", model);
	}

	@RequestMapping("addCompany.do")
	public ModelAndView addCompany(SacCompany sacCompany) {
		Map<String, Object> model = new HashMap<>();

		int flag = adminService.addCompany(sacCompany);
		if (flag >= 1) {
			return new ModelAndView("redirect:showCompanyList.do");
		} else {
			model.put("msg", "添加失败");
			return new ModelAndView("redirect:showCompanyAdd.do", model);
		}

	}

	@RequestMapping("showCompanyList.do")
	public ModelAndView showCompanyList(String tn) {
		Map<String, Object> model = new HashMap<>();
		model.put("allCompanyList", adminService.showCompanyByName(tn));
		return new ModelAndView("admin/companyList", model);
	}

	@RequestMapping("showCompanyAdd.do")
	public ModelAndView showCompanyAdd() {
		return new ModelAndView("admin/companyAdd");
	}

	@RequestMapping("showCompanyUpdate.do")
	public ModelAndView showCompanyUpdate(int companyid) {
		Map<String, Object> model = new HashMap<>();
		model.put("company", adminService.getCompanyById(companyid));
		return new ModelAndView("admin/companyUpdate", model);
	}

	@RequestMapping("removeCompany.do")
	public @ResponseBody Map<String, Object> removeCompany(int companyid) {
		Map<String, Object> model = new HashMap<>();
		int flag = adminService.removeCompany(companyid);
		if (flag == 1) {
			model.put("ret", 1);
		} else {
			model.put("ret", 0);
		}
		return model;
	}

	@RequestMapping("updateCompany.do")
	public ModelAndView updateCompany(SacCompany sacCompany) {
		Map<String, Object> model = new HashMap<>();

		int flag = adminService.updateCompany(sacCompany);
		if (flag == 1) {
			return new ModelAndView("redirect:showCompanyList.do");
		} else {
			model.put("msg", "失败");
			return new ModelAndView("redirect:showCompanyUpdate.do?companyid=" + sacCompany.getCompanyid(), model);
		}
	}

	@RequestMapping("addSchool.do")
	public ModelAndView addSchool(SacSchool sacSchool) {
		Map<String, Object> model = new HashMap<>();

		int flag = adminService.addSchool(sacSchool);
		if (flag >= 1) {
			return new ModelAndView("redirect:showSchoolList.do");
		} else {
			model.put("msg", "添加失败");
			return new ModelAndView("redirect:showSchoolAdd.do", model);
		}

	}

	@RequestMapping("showSchoolList.do")
	public ModelAndView showSchoolList(String tn) {
		Map<String, Object> model = new HashMap<>();
		model.put("allSchoolList", adminService.showSchoolByName(tn));
		return new ModelAndView("admin/schoolList", model);
	}

	@RequestMapping("showSchoolAdd.do")
	public ModelAndView showSchoolAdd() {
		return new ModelAndView("admin/schoolAdd");
	}

	@RequestMapping("showSchoolUpdate.do")
	public ModelAndView showSchoolUpdate(int schoolid) {
		Map<String, Object> model = new HashMap<>();
		model.put("school", adminService.getSchoolById(schoolid));
		return new ModelAndView("admin/schoolUpdate", model);
	}

	@RequestMapping("removeSchool.do")
	public @ResponseBody Map<String, Object> removeSchool(int schoolid) {
		Map<String, Object> model = new HashMap<>();
		int flag = adminService.removeSchool(schoolid);
		if (flag == 1) {
			model.put("ret", 1);
		} else {
			model.put("ret", 0);
		}
		return model;
	}

	@RequestMapping("updateSchool.do")
	public ModelAndView updateSchool(SacSchool sacSchool) {
		Map<String, Object> model = new HashMap<>();

		int flag = adminService.updateSchool(sacSchool);
		if (flag == 1) {
			return new ModelAndView("redirect:showSchoolList.do");
		} else {
			model.put("msg", "失败");
			return new ModelAndView("redirect:showSchoolUpdate.do?schoolid=" + sacSchool.getSchoolid(), model);
		}
	}

	@RequestMapping("showSchoolView.do")
	public ModelAndView showSchoolView(Integer schoolid, String ln) {
		Map<String, Object> model = new HashMap<>();
		model.put("schoolid",schoolid);
		model.put("allCooperationList", adminService.getCooperationByNameAndSchoolid(ln, schoolid));
		return new ModelAndView("admin/schoolView", model);
	}

	@RequestMapping("showCooperationAdd.do")
	public ModelAndView showCooperationAdd(Integer schoolid) {
		Map<String, Object> model = new HashMap<>();
		model.put("schoolid", schoolid);
		model.put("allcompany", adminService.getAllCompany());
		return new ModelAndView("admin/cooperationAdd", model);
	}

	@RequestMapping("showCooperationUpdate.do")
	public ModelAndView showCooperationUpdate(Integer cooperationid) {
		Map<String, Object> model = new HashMap<>();
		model.put("cooperation", courseService.getCooperationById(cooperationid));
		model.put("allcompany", adminService.getAllCompany());
		return new ModelAndView("admin/cooperationUpdate", model);
	}

	@RequestMapping("addCooperation.do")
	public ModelAndView addCooperation(SacCooperation sacCooperation) {
		Map<String, Object> model = new HashMap<>();

		int flag = adminService.addCooperation(sacCooperation);
		if (flag == 1) {
			return new ModelAndView("redirect:showSchoolView.do?schoolid="+sacCooperation.getSchoolid());
		} else {
			model.put("msg", "失败");
			return new ModelAndView("redirect:showStudentAdd.do?schoolid="+sacCooperation.getSchoolid(), model);
		}

	}
	@RequestMapping("updateCooperation.do")
	public ModelAndView updateCooperation(SacCooperation sacCooperation) {
		Map<String, Object> model = new HashMap<>();
		int flag = adminService.updateCooperation(sacCooperation);
		if (flag == 1) {
			return new ModelAndView("redirect:showSchoolView.do?schoolid="+sacCooperation.getSchoolid());
		} else {
			model.put("msg", "失败");
			return new ModelAndView("redirect:showStudentAdd.do?schoolid="+sacCooperation.getSchoolid(), model);
		}

	}
	
	@RequestMapping("removeCooperation.do")
	public @ResponseBody Map<String, Object> removeCooperation(int cooperationid) {
		Map<String, Object> model = new HashMap<>();
		int flag = adminService.removeCooperation(cooperationid);
		if (flag == 1) {
			model.put("ret", 1);
		} else {
			model.put("ret", 0);
		}
		return model;
	}
	@RequestMapping("updatePassword.do")
	public ModelAndView updatePassword(String oldPassword,String newPassword,String reNewPassword) {
		Map<String, Object> model = new HashMap<>();
		SacAdmin admin = (SacAdmin) session.getAttribute("ADMIN");
		if (!oldPassword.equals(admin.getAdminPsw())) {
			model.put("msg", "密码错误");
			return new ModelAndView("admin/password", model);
		}else if (!newPassword.equals(reNewPassword)) {
			model.put("msg", "两次密码不一致");
			return new ModelAndView("admin/password", model);
		}else {
			admin.setAdminPsw(newPassword);
			if (adminService.updateAdmin(admin)>=1) {
				session.setAttribute("ADMIN", admin);
				return new ModelAndView("redirect:index.do");				
			}else{
				model.put("msg", "修改失败");
				return new ModelAndView("admin/password", model);
			}
		}
	}
	@RequestMapping("password.do")
	public String Password() {
		return "admin/password";
	}

	@RequestMapping("showPostList.do")
	public ModelAndView showPostList(String pt,String pn) {
		Map<String, Object> model = new HashMap<>();
		model.put("allPostList", adminService.showPostByTitleAndPoster(pt,pn));
		return new ModelAndView("admin/postList", model);
	}
	@RequestMapping("removePost.do")
	public @ResponseBody Map<String, Object> removePost(int postid) {
		Map<String, Object> model = new HashMap<>();
		int flag = adminService.removePost(postid);
		if (flag == 1) {
			model.put("ret", 1);
		} else {
			model.put("ret", 0);
		}
		return model;
	}
	@RequestMapping("showPostView.do")
	public ModelAndView showPostView(Integer postid, String sn) {
		Map<String, Object> model = new HashMap<>();
		model.put("allCommentList", adminService.getCommentByCommenterAndPostid(sn, postid));
		return new ModelAndView("admin/postView", model);
	}
	
	@RequestMapping("removeComment.do")
	public @ResponseBody Map<String, Object> removeComment(int commentid) {
		Map<String, Object> model = new HashMap<>();
		int flag = adminService.removeComment(commentid);
		if (flag == 1) {
			model.put("ret", 1);
		} else {
			model.put("ret", 0);
		}
		return model;
	}
	@RequestMapping("showCompanyView.do")
	public ModelAndView showCompanyView(Integer companyid, String mt) {
		Map<String, Object> model = new HashMap<>();
		model.put("MessagesList", adminService.getMessageByTitleAndCompanyid(mt, companyid));
		return new ModelAndView("admin/companyView", model);
	}
	@RequestMapping("removeMessage.do")
	public @ResponseBody Map<String, Object> removeMessage(int messageid) {
		Map<String, Object> model = new HashMap<>();
		int flag = adminService.removeMessage(messageid);
		if (flag == 1) {
			model.put("ret", 1);
		} else {
			model.put("ret", 0);
		}
		return model;
	}
	@RequestMapping("showMessageAdd.do")
	public ModelAndView showMessageAdd(Integer companyid) {
		Map<String, Object> model = new HashMap<>();
		model.put("companyid", companyid);
		return new ModelAndView("admin/messageAdd", model);
	}

	@RequestMapping("showMessageUpdate.do")
	public ModelAndView showMessageUpdate(Integer messageid,Integer companyid) {
		Map<String, Object> model = new HashMap<>();
		model.put("companyid", companyid);
		model.put("message", adminService.getMessageById(messageid));
		return new ModelAndView("admin/messageUpdate", model);
	}
	@RequestMapping("addMessage.do")
	public ModelAndView addMessage(SacMessage sacMessage,Integer companyid) {
		Map<String, Object> model = new HashMap<>();
		int flag = adminService.addMessage(sacMessage,companyid);
		if (flag == 1) {
			return new ModelAndView("redirect:showCompanyView.do?companyid="+companyid);
		} else {
			model.put("msg", "失败");
			return new ModelAndView("redirect:showCompanyAdd.do?companyid="+companyid, model);
		}

	}
	@RequestMapping("updateMessage.do")
	public ModelAndView updateMessage(SacMessage sacMessage,Integer companyid) {
		Map<String, Object> model = new HashMap<>();
		int flag = adminService.updateMessage(sacMessage);
		if (flag == 1) {
			return new ModelAndView("redirect:showCompanyView.do?companyid="+companyid);
		} else {
			model.put("msg", "失败");
			return new ModelAndView("redirect:showCompanyAdd.do?companyid="+companyid, model);
		}

	}
}
