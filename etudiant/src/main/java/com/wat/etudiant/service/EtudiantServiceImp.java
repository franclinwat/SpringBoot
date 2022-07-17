package com.wat.etudiant.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.wat.etudiant.Utility;
import com.wat.etudiant.model.Etudiant;
import com.wat.etudiant.repository.EtudiantRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EtudiantServiceImp implements EtudiantService {

	// way 1
	// @Autowired
	// private EtudiantRepository etudiantRepository;

	/*
	 * // way 2 private EtudiantRepository etudiantRepository;
	 * 
	 * public EtudiantServiceImp(EtudiantRepository etudiantRepository) {
	 * this.etudiantRepository = etudiantRepository; }
	 */

	// way 3 final key is mandatory, goes with @RequiredArgsConstructor
	private final EtudiantRepository etudiantRepository;

	@Override
	public Etudiant saveEtudiant(Etudiant etudiant) {
		if (etudiant.getName().equals("merlin")) {
			System.out.println("sdqfsdf");
		}
		Etudiant etudiant2 = etudiantRepository.save(etudiant);
		Utility.sayHello();
		return etudiant2;
	}

	public Etudiant saveEtudiant2(Etudiant etudiant) {
		if (etudiant.getName().equals("merlin")) {
			System.out.println("sdqfsdf");
		}
		Etudiant etudiant2 = etudiant;
		Utility.sayHello();
		return etudiant2;
	}

	@Override
	public List<Etudiant> getAll() {
		
		return etudiantRepository.findAll();
	}

	@Override
	public Etudiant getEtudianById(Long id) {

		return etudiantRepository.findById(id).get();
	}

	@Override
	public void deleteEtudiantByid(Long id) {
		etudiantRepository.deleteById(id);
	}

}
