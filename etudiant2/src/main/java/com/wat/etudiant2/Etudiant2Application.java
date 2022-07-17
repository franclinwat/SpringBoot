package com.wat.etudiant2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.wat.etudiant2.modele.Etudiant;
import com.wat.etudiant2.service.EtudiantService;
import com.wat.exception.EtudiantException;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Etudiant2Application {
	
	@Autowired
	EtudiantService etudiantService;

	public static void main(String[] args) {
		
		
		
		ConfigurableApplicationContext configurableApplicationContext= SpringApplication.run(Etudiant2Application.class, args);
		
		//EtudiantService etudiantService = configurableApplicationContext.getBean(EtudiantService.class);
		
		//Etudiant etudiant = new Etudiant(2L,"frank@mld.fr",55,"kima");
		//Etudiant etudiant2 = new Etudiant(4L,"mrank@mld.fr",88,"lili");
		Etudiant etudiant = Etudiant.builder().age(55).email("frank@mld.fr").name("kima").build();
		Etudiant etudiant2 = Etudiant.builder().age(88).email("fmrank@mld.fr").name("lili").build();
		//try {
		
				//etudiantService.saveEtudiantOrUpdate(etudiant);
				//etudiantService.saveEtudiantOrUpdate(etudiant2);
		
		//}catch(EtudiantException ex) {
			//log.error(ex.getMessage());
		//}

		
	}
	
	/*@Bean
	public CommandLineRunner start(EtudiantService etudiantService) {
		return arg -> {
			Etudiant etudiant = Etudiant.builder().age(55).email("frank@mld.fr").name("kima").build();
			Etudiant etudiant2 = Etudiant.builder().age(88).email("fmrank@mld.fr").name("lili").build();
			etudiantService.saveEtudiantOrUpdate(etudiant2);
			etudiantService.saveEtudiantOrUpdate(etudiant);
		};
	}*/

}
