package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import dao.impl.MemberDaoImpl;
import model.Member;

@Controller
public class MemberController {

	private static final ApplicationContext a = new ClassPathXmlApplicationContext("sp1.xml");
	private static final MemberDaoImpl mdi = a.getBean("MDI", MemberDaoImpl.class);

	@PostMapping("add")
	public String add(Member m) {
		mdi.add(m);
		return "addSuccess";
	}

	@GetMapping("addMember")
	public String addMember() {
		return "addMember";
	}

	@GetMapping("queryMember")
	public String queryMember() {
		return "queryMember";
	}

	@GetMapping("updateMember")
	public String updateMember() {
		return "updateMember";
	}

	@GetMapping("deleteMember")
	public String deleteMember() {
		return "deleteMember";
	}

}
