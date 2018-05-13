package com.sac.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@RequestMapping("mes")
@Controller
public class MessageController extends BaseController {

	@RequestMapping("message.do")
	public ModelAndView showMessage(Integer mesid){
		Map<String, Object> model = new HashMap<>();
		model.put("mes", messageService.getMessage(mesid));
		return new ModelAndView("message",model);
	}
}
