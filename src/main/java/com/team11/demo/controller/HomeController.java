package com.team11.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

		
	@RequestMapping("/")
	public String index() {
		return "home";
	}
	

	
	
}
