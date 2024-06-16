package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.impl.MemberDaoImpl;

public class TestController {

	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("applicationContext.xml");
		MemberDaoImpl mdi = a.getBean("MDI", MemberDaoImpl.class);
		
		mdi.selectAll().forEach(action->{
			System.out.println(action.getName());
		});
	}

}