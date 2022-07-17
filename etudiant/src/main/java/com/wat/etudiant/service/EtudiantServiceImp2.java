package com.wat.etudiant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wat.etudiant.model.Etudiant;
import com.wat.etudiant.repository.EtudiantRepository;

public class EtudiantServiceImp2 implements EtudiantService{
	
	
	@Autowired
	private EtudiantRepository etudiantRepository;

	@Override
	public Etudiant saveEtudiant(Etudiant etudiant) {
		
		return etudiantRepository.save(etudiant);
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

	@Override
	public Etudiant saveEtudiant2(Etudiant etudiant) {

		return etudiantRepository.save(etudiant);
	}

}
