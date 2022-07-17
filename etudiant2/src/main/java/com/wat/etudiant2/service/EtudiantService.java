package com.wat.etudiant2.service;

import java.util.List;

import com.wat.etudiant2.modele.Etudiant;
import com.wat.exception.EtudiantException;

public interface EtudiantService {

	Etudiant saveEtudiantOrUpdate(Etudiant etudiant);

	List<Etudiant> getAllEtudiant();

	Etudiant getEtudiantById(Long id);

	void deleteEtudiantById(Long id);

	Etudiant saveEtudiantOrUpdateFake(Etudiant etudiants) throws EtudiantException;

}
