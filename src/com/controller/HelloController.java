package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public String homepage(){
		
		return "menu";
		
	}
	

	
	
	
	@RequestMapping("/hello")
	public ModelAndView helloworld(){
		
		String message="hello user";
		return new ModelAndView("hello","message",message);
	}

	@RequestMapping("/welcome")
	public ModelAndView welcome(){
		
		String message="hello user";
		return new ModelAndView("welcome","message",message);
	}
}
