package com.student.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/show")
	public String test() {
		System.out.println("test controller");
		return"test";
		
		
		
		
		
	}

}
