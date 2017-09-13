package com.vimal.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManageController {

	@RequestMapping("/newjsp")
	public String mynewjsp(ModelMap model){
		
		model.addAttribute("hello", "This is my new jsp");
		return "newjsp";
	}
	
	
	
	
}
