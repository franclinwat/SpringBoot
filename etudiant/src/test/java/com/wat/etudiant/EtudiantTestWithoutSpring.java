package com.wat.etudiant;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.util.Assert;

import com.wat.etudiant.model.Etudiant;
import com.wat.etudiant.repository.EtudiantRepository;
import com.wat.etudiant.service.EtudiantServiceImp;


@ExtendWith(MockitoExtension.class)
public class EtudiantTestWithoutSpring {

	
	private EtudiantServiceImp etudiantService;
	

	/*
	@Mock
    EtudiantRepository etudiantRepository;
    @InjectMocks
    private EtudiantServiceImp etudiantService;
    
    private AutoCloseable closeable;
	
	@BeforeEach
	void setup(@Mock EtudiantRepository etudiantRepository){
		System.out.println("@BeforeAll executed");
		closeable = MockitoAnnotations.openMocks(this);
		etudiantService = new EtudiantServiceImp(etudiantRepository);
	}*/
	
	EtudiantRepository etudiantRepository;
	@BeforeEach
	void setup(){
		System.out.println("@BeforeAll executed");
		etudiantRepository = Mockito.mock(EtudiantRepository.class);
		etudiantService = new EtudiantServiceImp(etudiantRepository);
	}

	//@BeforeEach

	@Tag("DEV")
	@Test
	void checkIfSaveStudent22() {
		
		//given
		Etudiant etudiant = new Etudiant(3L,"franclin", LocalDate.now());
		
		when(etudiantRepository.save(Mockito.any(Etudiant.class))).thenReturn(etudiant);
		
		//when
		Etudiant etudiantExpected = etudiantService.saveEtudiant(etudiant);
		
		//then
		Assert.notNull(etudiantExpected, "student result is not null ");
		assertTrue(etudiantExpected.getName().equals(etudiant.getName()), "student name is "+etudiant.getName());
	}
}


