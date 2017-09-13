package com.vimal.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "welcome to spring mvc");
		return mv;
	}
	
	@RequestMapping(value = "/mypage" )
	public ModelAndView mypPge() {

		ModelAndView mv = new ModelAndView("mypage");
		mv.addObject("greeting", "welcome to spring mvc");
		return mv;
	}

	
	@RequestMapping(value = "/pageview" )
	public ModelAndView pageview() {

		ModelAndView mv = new ModelAndView("pageview");
		mv.addObject("greeting", "welcome to spring mvc");
		return mv;
	}

}
