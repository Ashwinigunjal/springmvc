package com.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.Student;

@Controller
@RequestMapping("/data")
public class StudentController {

	
	@RequestMapping("/showform")
	public String showform(Model model){
		
		Student student = new Student();
		model.addAttribute("student",student);
		
		return "spring-form";
			
	}
	
	@RequestMapping("/processform")
	public String processform( @Valid @ModelAttribute("student") Student theStudent ,BindingResult theBindingResult ){
		
	
		System.out.println(theStudent.getName());
		if(!theBindingResult.hasErrors()){
			System.out.println("inside process form");
			return "spring-form";
		}
		else{
			return "spring-confirm";
		}
		
		
	}
	
}
