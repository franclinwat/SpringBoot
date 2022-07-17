package com.wat.etudiant2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wat.etudiant2.modele.Etudiant;
import com.wat.etudiant2.service.EtudiantService;
import com.wat.etudiant2.service.EtudiantServiceImp;


@RestController
public class EtudiantController {
	


	// autowired the StudentService class
	@Autowired
	private EtudiantService etudiantService;

	@Autowired
	private EtudiantServiceImp etudiantServiceImp;
	// creating a get mapping that retrieves all the students detail from the
	// database
	
	
	@GetMapping("/students")
	public List<Etudiant> getAllEudiant() {
		return etudiantServiceImp.getAllEtudiant();
	}

	//creating a get mapping that retrieves the detail of a specific student 
	@GetMapping("/students/{id}")
	public Etudiant getEtudiantById(@PathVariable("id") Long  id) {
		return etudiantService.getEtudiantById(id);
	}
	
	//creating a delete mapping that deletes a specific student  
	
	@DeleteMapping("/students/{id}")
	public void deleteEtudiantById(@PathVariable("id") Long id) {
		etudiantService.deleteEtudiantById(id);

	}
	
	@PostMapping("/students")
	public Etudiant saveEtudiantOrUpdate(@RequestBody Etudiant etudiant) {
		return etudiantServiceImp.saveEtudiantOrUpdate(etudiant);
	}

	

	
}
