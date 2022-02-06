package com.sip.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/info")
	public String info(Model model) {
		ArrayList<String> list = new ArrayList<>();
		list.add("OCA");
		list.add("OCP");
		list.add("ANGULAR");
		
		String info="fullStack";
		System.out.println("page info");
		model.addAttribute("NAMES",list);
		model.addAttribute("work",info);
		return "home/info";
	}
	
	@RequestMapping("/affichage")
	public String Affichage() {
		System.out.println("hello");
		
		return "home/affichage";
	}

}
