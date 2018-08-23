package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorld {

	@RequestMapping("/showform")
	public String showform(){
		
		return "form";
	}
	
	@RequestMapping("/processformversion2")
	public String letsshoute(HttpServletRequest request, Model model){
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String thename = name.toUpperCase();
		String pass=password.toUpperCase();
		model.addAttribute("name",thename);
		model.addAttribute("password",pass);
		return "helloworld";
	}
	
	
	@RequestMapping("/processformversion3")
	public String letsshoute(@RequestParam("name")String Name , Model model){
		
		
		String thename = Name.toUpperCase();
	
		model.addAttribute("name",thename);
	
		return "helloworld";
	}
	
	@RequestMapping("/processform")
	public String processform(){
		return "helloworld";
	}
	
}
