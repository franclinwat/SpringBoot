package com.wat.etudiant.service;

import java.util.List;

import com.wat.etudiant.model.Etudiant;



public interface EtudiantService {

	 Etudiant saveEtudiant(Etudiant etudiant );
     List<Etudiant> getAll();
     Etudiant getEtudianById(Long id);
     void deleteEtudiantByid(Long id);
     //
     Etudiant saveEtudiant2(Etudiant etudiant);
}
