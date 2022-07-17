package com.wat.SpringbooVoiture.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.wat.SpringbooVoiture.Service.VoitureService;
import com.wat.SpringbooVoiture.modele.Voiture;

@Controller
public class VoitureController {
	
	@Autowired
	private VoitureService service;
	
	
	@GetMapping("/")
	public String  HomePage(Model model) {
		
		List<Voiture> listVoiture=service.getAllVoiture();
		model.addAttribute("listVoiture", listVoiture);                               
		
		return "home";
		
	}
	

	

}
