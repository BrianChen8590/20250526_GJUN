package com.example.demo.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.impl.MemberDaoImpl;
import com.example.demo.model.Member;

@SpringBootTest
public class MemberDaoImplTest {

	@Autowired
	private MemberDaoImpl mdi;

	// @Test
	public void addTtest() {
		Member m = new Member("aa", "ii", "456", "台北", "789");
		mdi.add(m);
		System.out.println("add success");
	}

	// @Test
	public void queryTest() {
		List<Member> l = mdi.selectAll();

		for (Member m : l) {
			System.out.println("id:" + m.getId() + "\tname:" + m.getName());

		}
	}

	// @Test
	public void selectMemberTest() {
		List<Member> l = mdi.selectMember("ii", "456");

		for (Member m : l) {
			System.out.println("id:" + m.getId() + "\tname:" + m.getName());

		}
	}

	// @Test
	public void selectUsernameTest() {
		List<Member> l = mdi.selectUsername("aa");

		for (Member m : l) {
			System.out.println("id:" + m.getId() + "\tname:" + m.getName());

		}
	}

	@Test
	public void updateTest() {
		List<Member> l = mdi.selectById(20);
		Member[] m = l.toArray(new Member[1]);

		m[0].setName("tecaher");
		m[0].setAddress("高雄");

		mdi.update(m[0]);

		System.out.println("update success");
	}

	// @Test
	public void deleteTest() {
		mdi.delete(21);

		System.out.println("delete success");
	}

}
