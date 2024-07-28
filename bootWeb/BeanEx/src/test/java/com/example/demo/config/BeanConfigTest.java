package com.example.demo.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanConfigTest {

	@Autowired
	BeanConfig beanConfig;

	BeanConfig beanConfig2 = new BeanConfig();

	@Test
	public void beanTest() {
		// the bean memory location the same as
		System.out.println(beanConfig.getEmployee());
		System.out.println(beanConfig.getEmployee());
		System.out.println("----------------------------------------");
		// the bean memory is different location
		System.out.println(beanConfig2.getEmployee());
		System.out.println(beanConfig2.getEmployee());
	}

	@Test
	public void beanTest2() {
		// the bean memory location the same as
		System.out.println(beanConfig.getEmployee());
		System.out.println(beanConfig.getEmployee());
		System.out.println("----------------------------------------");
		// the bean memory is different location
		System.out.println(beanConfig2.getEmployee());
		System.out.println(beanConfig2.getEmployee());
	}
}
