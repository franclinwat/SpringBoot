package com.wat.testUnitaire;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.MessageFormat;
import java.time.Duration;
import java.time.Instant;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestUnitaireApplicationTests {
	
	
	private Calculatrice calculatorUnderTest;
	
	private static Instant startedAt;
	
	@BeforeAll
	public static void  initStartingTime() {
		System.out.println("----------call before all the tests-------");
		startedAt=Instant.now();
		
	}
	
	@AfterAll
	public static void showTestDuration () {
		System.out.println("*********call after all the tests********");
		Instant endAt=Instant.now();
		Long duration=Duration.between(startedAt, endAt).toMillis();
		System.out.println(MessageFormat.format("Test duration : {0} ms", duration));
		
	}
	
	@BeforeEach
	public void initialCalculator() {
		calculatorUnderTest=new Calculatrice();
		System.out.println("call before each test");
	}
	
	@AfterEach
	public void underCalculator() {
		calculatorUnderTest=null;
		System.out.println("call after  each test");
		
	}
	

	@Test
	void testAdd2PositiveNumber() {
	
		//given
		int a,b;
		a=3;
		b=2;

		//when
		
		int expected=calculatorUnderTest.add(a, b);
		
		//then
		//assertEquals(5, expected);
		
		//utilisation de Asserj
		assertThat(5).isEqualTo(expected);
	}

	@Test
	void MutiplicationnDoubleTest() {
		//given
		double a,b;
		a=10;
		b=2;
		
		//when
		
		double expected=calculatorUnderTest.multiply(a, b);
		
		//then
		
		//utilisation de Asserj
		assertThat(20.0).isEqualTo(expected);
	}
}
