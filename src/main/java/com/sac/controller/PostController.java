package com.sac.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sac.pojo.SacComment;
import com.sac.pojo.SacPost;
import com.sac.service.PostService;

@Controller
public class PostController extends BaseController {

	@RequestMapping("fatie.do")
	public String toFatie(){
		return "fatie";
	}
	
	@RequestMapping("addPost.do")
	public ModelAndView addPost(SacPost post){
		int flag = postService.addPost(post);
		if (flag==0) {
			return new ModelAndView("success");
		}else{
			return new ModelAndView("fail");
		}
	}
	@RequestMapping("tiezi.do")
	public ModelAndView showTiezi(Integer postid,Integer count) {
		if (count==null) {
			count = 1;
		}
		if (count <=0) {
			count++;
		}else if (count > 1+(postService.getCommentByPostId(postid).size()/10.0)) {
			count--;
		}
		Map<String, Object> model = new HashMap<>();
		model.put("post", postService.getPostById(postid));
		model.put("comment", postService.getCommentByPostId(postid));
		model.put("Count", count);
		return new ModelAndView("tiezi", model);
	}
	@RequestMapping("addCommend.do")
	public String addCommend(SacComment sacComment){
		postService.addCommend(sacComment);
		return "redirect:/tiezi.do?postid="+sacComment.getPostid();
	}
}
