package controller.member;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;

import entity.Member;
import service.impl.MemberServiceImpl;

public class AddMemberController extends ActionSupport {
	private String name;
	private String username;
	private String password;
	private String address;
	private String phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String execute() throws Exception {
		MemberServiceImpl msi = a.getBean("MSI", MemberServiceImpl.class);

		msi.addMember(new Member(getName(), getUsername(), getPassword(), getAddress(), getPhone()));

		return "addMemberSuccess";
	}

	private static ApplicationContext a = new ClassPathXmlApplicationContext("applicationContext.xml");

}