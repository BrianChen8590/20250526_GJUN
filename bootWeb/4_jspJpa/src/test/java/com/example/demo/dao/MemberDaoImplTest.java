package com.example.demo.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.impl.MemberServiceImpl;

@SpringBootTest
public class MemberDaoImplTest {

	@Autowired
	MemberServiceImpl msi;

	@Test
	public void test() {
		System.out.println(msi.selectAllMember());
		;
	}

}
