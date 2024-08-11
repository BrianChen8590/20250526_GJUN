package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@GetMapping("loginSuccess")
	public String loginSuccess()
	{
		return "loginSuccess";
	}
	
	
	
	@GetMapping("loginSuccess2")
	public ModelAndView loginSuccess2()
	{
		return new ModelAndView("loginSuccess");
	}
	
}
