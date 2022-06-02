package com.wat.SpringbooVoiture.Service;

import java.util.List;

import com.wat.SpringbooVoiture.modele.Voiture;

public interface VoitureService {

	Voiture saveVoiture(Voiture v);

	Voiture getVoitureById(Long id);

	List<Voiture> getAllVoiture();

	void deleteVoitureById(Long id);

	void deleteAllVoiture();

}
