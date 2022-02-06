package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/info")
	public String info() {
		System.out.println("hello");
		return "home/info";
	}
	
	@RequestMapping("/affichage")
	public String Affichage() {
		
		return "home/affichage";
	}

}
