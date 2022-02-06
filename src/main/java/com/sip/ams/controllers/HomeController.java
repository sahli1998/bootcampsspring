package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/info")
	public String info(Model model) {
		String[] array = {"OCP","OCP","Spring","Angular"};
		String info="fullStack";
		System.out.println("page info");
		model.addAttribute("array",array);
		model.addAttribute("work",info);
		return "home/info";
	}
	
	@RequestMapping("/affichage")
	public String Affichage() {
		System.out.println("hello");
		
		return "home/affichage";
	}

}
