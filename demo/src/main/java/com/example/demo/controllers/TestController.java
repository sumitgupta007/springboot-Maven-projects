package com.example.demo.controllers;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.InitBinder;

import com.example.demo.dto.FormDto;
import com.example.demo.formatter.FormFormatter;

@Controller
public class TestController {
	@RequestMapping("/home")
	public String method1(@ModelAttribute("formdto") FormDto dto) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>inside /home");
		return "home";
	}
	@RequestMapping("/register")
	public String method2(@Valid @ModelAttribute("formdto") FormDto dto, BindingResult result) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>inside /register");
		if(result.hasErrors()) {
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>inside result"+result);
			return "home";
		}
		return "register";
		
	}
	
	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		
		
		StringTrimmerEditor editor=new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, "name", editor);
//		
//		FormFormatter  formt =new FormFormatter();
//		
//System.out.println("inside formatter");
//		binder.addCustomFormatter(formt);
//		binder.setDisallowedFields("name");
		
		
		
		
	}
	

}
