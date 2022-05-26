package com.wat.HelloWordSpring.service;

import org.springframework.stereotype.Component;

import com.wat.HelloWordSpring.Model.Helloword;

@Component
public class HelloWordService {
	
	
	public Helloword getHelloword() {
		Helloword hw=new Helloword();
		return hw;
	}

}
