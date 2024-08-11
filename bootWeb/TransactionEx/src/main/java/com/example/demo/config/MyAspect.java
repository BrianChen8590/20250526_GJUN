package com.example.demo.config;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

	@Before("execution(* com.example.demo.config.AopEx.*(..))") // 整個專案所有的方法
	public void before() {
		System.out.println("I am before");

	}

	@After("execution(* com.example.demo.config.AopEx.*(..))")
	public void after() {
		System.out.println("I am after");
	}
}
