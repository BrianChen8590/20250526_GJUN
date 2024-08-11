package com.example.demo.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AopExTest {
	
	@Autowired
	private AopEx ex;

	@Test
	public void getATest() {
		ex.getA();
		ex.getB();
	}
	
}
