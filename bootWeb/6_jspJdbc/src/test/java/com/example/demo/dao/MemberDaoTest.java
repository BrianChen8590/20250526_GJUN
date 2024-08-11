package com.example.demo.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.impl.MemberDaoImpl;

@SpringBootTest
public class MemberDaoTest {
	
	@Autowired
	MemberDaoImpl mdi;
	
	@Test
	public void memberTest() {
		System.out.println(mdi.selectAll());
	}

}
