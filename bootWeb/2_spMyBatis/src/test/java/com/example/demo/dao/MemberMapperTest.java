package com.example.demo.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Member;

@SpringBootTest
public class MemberMapperTest {
	@Autowired
	MemberMapper mp;

	// @Test
	public void addTest() {
		mp.add(new Member("a", "uu", "123", "台北", "44"));

		System.out.println("add success");
	}

	// @Test
	public void selectTest() {
		mp.selectAll().forEach(member -> {
			System.out.println(String.format("%s, %s, %s, %s", member.getId(), member.getName(), member.getPhone(),
					member.getUsername()));
		});
	}

	@Test
	public void selectByIdTest() {
		mp.selectById(21).forEach(member -> {
			System.out.println(String.format("%s, %s, %s, %s", member.getId(), member.getName(), member.getPhone(),
					member.getUsername()));
		});
	}
	
}