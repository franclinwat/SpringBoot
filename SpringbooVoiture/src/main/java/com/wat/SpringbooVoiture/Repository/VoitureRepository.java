package com.wat.SpringbooVoiture.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wat.SpringbooVoiture.modele.Voiture;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {

}
