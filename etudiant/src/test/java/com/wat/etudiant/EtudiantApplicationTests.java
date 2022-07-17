package com.wat.etudiant;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.util.Assert;

import com.wat.etudiant.model.Etudiant;
import com.wat.etudiant.repository.EtudiantRepository;
import com.wat.etudiant.service.EtudiantService;


@SpringBootTest
class EtudiantApplicationTests {


	@Autowired
	private EtudiantService etudiantService;
	
    @MockBean
    EtudiantRepository etudiantRepository;
    
	@Test
	void checkIfSaveStudent() {
		
		//given
		Etudiant etudiant = new Etudiant(3L,"franclin", LocalDate.now());
		
		when(etudiantRepository.save(Mockito.any(Etudiant.class))).thenReturn(etudiant);
		
		//when
		Etudiant etudiantExpected = etudiantService.saveEtudiant(etudiant);
		
		//then
		Assert.isTrue(etudiantExpected.getName().equals(etudiant.getName()), "student name is "+etudiant.getName());
	}
	
	@Test
	void checkIfSaveStudentWithNameMerlin() {
		
		//given
		Etudiant etudiant = new Etudiant(3L,"merlin", LocalDate.now());
		
		when(etudiantRepository.save(Mockito.any())).thenReturn(etudiant);
		
		//when
		Etudiant etudiantExpected = etudiantService.saveEtudiant(etudiant);
		
		//then
		Assert.isTrue(etudiantExpected.getName().equals(etudiant.getName()), "student name is "+etudiant.getName());
	}
	
	@Test
	void checkIfSaveStudent2() {
		
		//given
		Etudiant etudiant = new Etudiant(3L,"franclin", LocalDate.now());
		
		//when
		Etudiant etudiantExpected = etudiantService.saveEtudiant2(etudiant);
		
		//then
		Assert.notNull(etudiantExpected, "student result is not null ");
		assertTrue(etudiantExpected.getName().equals(etudiant.getName()), "student name is "+etudiant.getName());
	}

}
