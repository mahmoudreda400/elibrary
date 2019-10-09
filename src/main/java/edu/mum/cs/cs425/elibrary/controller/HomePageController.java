package edu.mum.cs.cs425.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {

//	@GetMapping(value = {"/","/elibrary","/elibrary/home"})
//	public ModelAndView displayHomePage1() {
//		  ModelAndView modelAndView = new ModelAndView();
//		    modelAndView.setViewName("home/index");
//		    return modelAndView;
////		return "home/index";
//	}
	
	@GetMapping(value = {"/","/elibrary","/elibrary/home"})
	public String displayHomePage() {
		return "home/index";
	}
	
	
	
}
