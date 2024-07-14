package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Member;
import com.example.demo.service.impl.MemberServiceImpl;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("member")
public class MemberController {

	@Autowired
	MemberServiceImpl msi;

	@PostMapping("Login")
	public ModelAndView login(String username, String password, Model model, HttpSession session) {
		Member m = msi.LoginMember(username, password);
		if (m != null) {
			session.setAttribute("M", m);
			model.addAttribute("M", m);
			return new ModelAndView("loginSuccess");
		} else {
			return new ModelAndView("loginError");
		}

	}

	@PostMapping("add")
	public ModelAndView add(String name, String username, String password, String address, String phone) {
		boolean b = msi.selectUsername(username);
		if (b) {
			return new ModelAndView("addMemberError");
		} else {
			Member m = new Member(name, username, password, address, phone);
			msi.addMember(m);
			return new ModelAndView("addMemberSuccess");
		}
	}

	@GetMapping("query")
	public ModelAndView query() {
		return new ModelAndView("query");
	}

}
