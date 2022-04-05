package com.wat.produits.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wat.produits.service.ProduitService;

public class ProduitsController {
	@Autowired
	ProduitService produitService;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		
		return "createProduit";
	}

}
