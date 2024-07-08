package com.example.demo.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.impl.PorderDaoImpl;
import com.example.demo.model.Porder;

@SpringBootTest
public class PorderDaoImplTest {

	@Autowired
	private PorderDaoImpl porderDaoImpl;

	@Test
	public void addProderTest() {
		Porder p = new Porder("qq", 1, 2, 3);
		porderDaoImpl.add(p);
	}

}
