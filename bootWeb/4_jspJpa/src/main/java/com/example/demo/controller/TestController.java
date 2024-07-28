package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@GetMapping("addMemberSuccess")
	public String addMemberSuccess()
	{
		return "addMemberSuccess";
	}
	
	@GetMapping("addMemberSuccess2")
	public ModelAndView addMemberSuccess2()
	{
		return new ModelAndView("addMemberSuccess");
	}

}