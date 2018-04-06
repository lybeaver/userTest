package user.course.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import user.course.service.StudentService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private StudentService service;
	@RequestMapping(value="",method=RequestMethod.GET)
   public ModelAndView init(ModelAndView model){
		Integer num = service.getCount();
		System.out.println(num);
		model.setViewName("redirect:/views/welcome.html");
	   return model;
   }	
}
