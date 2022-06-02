package com.wat.SpringbooVoiture;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wat.SpringbooVoiture.Service.VoitureService;
import com.wat.SpringbooVoiture.modele.Voiture;

@SpringBootTest
class SpringbooVoitureApplicationTests {
	
	@Autowired
	private VoitureService service;
	
	
	private Voiture voiture=new Voiture("watson",16);

	@Test
	void contextLoads() {
		
		service.saveVoiture(voiture);
		
	}

}
