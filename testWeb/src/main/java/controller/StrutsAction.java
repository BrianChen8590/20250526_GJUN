package controller;

import com.opensymphony.xwork2.ActionSupport;

public class StrutsAction extends ActionSupport {
	// field-->request.getParameter-->直接宣告-->自動轉型
	private int x;
	// 不能有建構式
	// method-->getter/setter

	public int getX() {
		return x;
	}

	public void setX(int x) {

		this.x = x;
	}

	@Override
	public String execute() throws Exception {
		if (getX() >= 60) {
			return "a";
		} else {
			return "b";
		}

	}

}