package com.bd.benu.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
	
	@GetMapping(value = {"/","/load"})
	public String loadPage() {
		
		return"home";
	}

}
