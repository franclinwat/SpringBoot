package com.wat.HelloWordSpring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wat.HelloWordSpring.service.HelloWordService;

@SpringBootTest
class HelloWordSpringApplicationTests {

	@Autowired
	private HelloWordService hs;
	
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testHellowordservice() {
		String  expect="Hello word";
		String result=hs.getHelloword().getValue();
		
		assertEquals(expect, result);
	}
}
