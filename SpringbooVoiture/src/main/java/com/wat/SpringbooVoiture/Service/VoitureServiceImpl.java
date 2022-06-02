package com.wat.SpringbooVoiture.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wat.SpringbooVoiture.Repository.VoitureRepository;
import com.wat.SpringbooVoiture.modele.Voiture;

@Service
public class VoitureServiceImpl implements VoitureService{

	 @Autowired
	 VoitureRepository voitureRepository;
	
	@Override
	public Voiture saveVoiture(Voiture v) {
		
		return voitureRepository.save(v);
	}

	@Override
	public Voiture getVoitureById(Long id) {
		return voitureRepository.findById(id).get();
	}

	@Override
	public List<Voiture> getAllVoiture() {
		
		return voitureRepository.findAll();
	}

	@Override
	public void deleteVoitureById(Long id) {
		voitureRepository.deleteById(id);
		
	}

	@Override
	public void deleteAllVoiture() {
		voitureRepository.deleteAll();
		
	}

}
