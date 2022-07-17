package com.wat.testUnitaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wat.testUnitaire.modele.Voiture;

public interface VoitureRepository extends JpaRepository<Voiture, Long>{

}
