package com.wat.etudiant2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wat.etudiant2.modele.Etudiant;
import com.wat.etudiant2.repository.EtudiantRepository;
import com.wat.exception.EtudiantException;

import lombok.extern.slf4j.Slf4j;


/*
 OFF < FATAL < ERROR (env:prod) < WARNING (uat) < INFO (dev) < DEBUG (local) < TRACE
*/

//@Slf4j
@Service
public class EtudiantServiceImp implements EtudiantService {
	
	Logger logger = LoggerFactory.getLogger(EtudiantServiceImp.class);
	private final static Logger BUSINESS = LoggerFactory.getLogger("business");
	
	@Autowired
	private EtudiantRepository etudiantRepository;


	@Override
	@Transactional(rollbackOn = {EtudiantException.class})
	public Etudiant saveEtudiantOrUpdateFake(Etudiant etudiants) {
		logger.info("-----------------Get into method {} with param {}", "saveEtudiantOrUpdate", etudiants.toString());
	
		logger.debug("-----------------Student age is {}", etudiants.getAge());
		int a = 8;
		int b = 0;
		try {
			if(b == 0) {
				logger.warn("-----------------division by {} is not possible", b);
			}
				
			int result = a/b;
			
		} catch( Exception e) {
			logger.error(e.getMessage());
			//throw new RuntimeException(e.getMessage(), e);
			throw new EtudiantException(e.getMessage());
		}
		logger.info("---------------leave method {}", "saveEtudiantOrUpdate");
		return etudiantRepository.save(etudiants);
		
	}
	
	
	@Override
	public Etudiant saveEtudiantOrUpdate(Etudiant etudiants) {
		logger.info("post into methode {}  {} ","savenulleEtudiantOrUpdate"  );
		return etudiantRepository.save(etudiants);
		
	}
	
	@Override
	public List<Etudiant> getAllEtudiant() {
		logger.info("-----------------Get into method {}", "getAllEtudiant");
		List<Etudiant> etudiants = new ArrayList<>();
		
		for (Etudiant e : etudiantRepository.findAll()) {
			etudiants.add(e);
		}
		
		System.out.println(etudiants);
		logger.info("-----------------leave method {}", "getAllEtudiant");
		return etudiants;
	}
	

	@Override
	public Etudiant getEtudiantById(Long id) {
// stream from java 8
		return etudiantRepository.findById(id).orElseThrow(() -> new EtudiantException(String.format("Etudiant with id %d not found", id)));
	}

	@Override
	public void deleteEtudiantById(Long id) {
		etudiantRepository.deleteById(id);

	}



}
