package com.wat.etudiant.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wat.etudiant.model.Etudiant;
import com.wat.etudiant.service.EtudiantService;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

//logger
@Slf4j
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class EtudiantController {
	

	private final EtudiantService etudiantService;
	
	@GetMapping("/students")
	public List<Etudiant> getAll() {
		log.info("Enter into getAll");
		return etudiantService.getAll();
	}

	@GetMapping("/students/{id}")	
	public ResponseEntity<Etudiant> getEtudianById(@PathVariable("id") Long id) {
		log.info("Enter into getEtudianById");
		Etudiant etudiant = etudiantService.getEtudianById(id);
		return ResponseEntity.status(HttpStatus.OK)
				.body(etudiant);
	}
	
	@PostMapping("/students")
	public ResponseEntity<Etudiant> saveEtudiant(@RequestBody Etudiant etudiant) {
		log.info("Enter into saveEtudiant");
		Etudiant etudiant2 = etudiantService.saveEtudiant(etudiant);
		return ResponseEntity.status(HttpStatus.CREATED)
				.location(URI.create(String.format("/students/%s", etudiant2.getId())))
				.body(etudiant2);
	}

	@DeleteMapping("/students/{id}")
	public void deleteEtudiantByid(@PathVariable("id") Long id) {
		log.info("Enter into deleteEtudiantByid");
		etudiantService.deleteEtudiantByid(id);
	}
	
}

// localhost:8080/h2-console
// jdbc:h2:mem:12075302-9aad-4aae-9d3b-75a49e81f546

// test des endpoint

// via curl:
// curl -X GET localhost:8080/api/v1/students
// curl -X GET localhost:8080/api/v1/students/1
// curl -X POST localhost:8080/api/v1/students -H "Content-Type: application/json" -d '{"name":"Merlin","birthdate":"2022-01-20"}'

// curl -X DELETE localhost:8080/api/v1/students/1

//------

// via postman

//------

//via navigateur: seulement les [get]

// localhost:8080/api/v1/students
// localhost:8080/api/v1/students/1

