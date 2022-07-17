package com.wat.etudiant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wat.etudiant.model.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{

}
