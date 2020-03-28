package com.ltg.appconfigurator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 

public class UserController {
	@GetMapping("/")
	public String index2() {
		return "index2"; 
	}
	@GetMapping("/userForm")
	public String userForm() {
		return "user-form";
	}

}
