package controller;

import com.opensymphony.xwork2.ActionSupport;

import entity.Member;
import service.impl.MemberServiceImpl;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;

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

	@Override
	public String execute() throws Exception {
		Member m = msi.LoginMember(getUsername(), getPassword());

		if (m != null) {
			return "LoginSuccess";
		} else {
			return "LoginError";
		}

	}

	private static MemberServiceImpl msi = new MemberServiceImpl();

}