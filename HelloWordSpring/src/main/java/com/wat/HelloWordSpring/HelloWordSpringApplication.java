package com.wat.HelloWordSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wat.HelloWordSpring.service.HelloWordService;

@SpringBootApplication
public class HelloWordSpringApplication implements CommandLineRunner{

	@Autowired
	private HelloWordService hs;
	
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWordSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		System.out.println(hs.getHelloword());
		
	}

}
