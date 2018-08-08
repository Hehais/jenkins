package com.uzengroup.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TestController {

	
	@PostMapping("/index")
	public String index() {
		System.out.println("aaaaaaaaaaaaaaaa");
		return "index";
	}
	
	@RequestMapping("/postTest")
	public ModelAndView postTest(HttpServletRequest request) {
		String codeType = request.getParameter("codeType");
		String mobile = request.getParameter("mobile");
		String countryCode = request.getParameter("countryCode");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("codeType", codeType);
		mav.addObject("mobile", mobile);
		mav.addObject("countryCode", countryCode);
		mav.setViewName("index");
		return mav;
	}
}
