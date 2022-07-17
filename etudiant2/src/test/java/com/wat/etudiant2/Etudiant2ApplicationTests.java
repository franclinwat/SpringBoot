package com.wat.etudiant2;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wat.etudiant2.modele.Etudiant;
import com.wat.etudiant2.service.EtudiantService;

@SpringBootTest
class Etudiant2ApplicationTests {
	
	@Autowired
	private EtudiantService etudiantService;

	@Test
	void testSaveOrupdateMethode() {
		
		//given
		Etudiant etudiant = new Etudiant(2L,"frank@mld.fr",55,"kima");
		//when
		Etudiant EtudiantExpected=etudiantService.saveEtudiantOrUpdate(etudiant);
		//then
		//assertNotNull(EtudiantExpected);
		//assertThat(EtudiantExpected).isNotNull();
		//assertTrue(EtudiantExpected.getName().equals(etudiant.getName()), "student name is "+etudiant.getName());

	}
	
	
	
	
	

}
