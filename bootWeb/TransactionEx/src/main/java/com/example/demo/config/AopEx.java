package com.example.demo.config;

import org.springframework.stereotype.Component;

@Component
public class AopEx {

	public void getA() {
		System.out.println("正在執行 A....");
	}

	public void getB() {
		System.out.println("正在執行 B....");
	}

}
