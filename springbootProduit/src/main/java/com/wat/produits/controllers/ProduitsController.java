package com.wat.produits.controllers;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wat.produits.dto.ProduitDto;
import com.wat.produits.entities.Produit;
import com.wat.produits.service.ProduitService;

@Controller
public class ProduitsController {
	
	
	@Autowired
	@Qualifier("produitserviceImpl")
	ProduitService produitService;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		
		return "createProduit";
	}
	
	@PostMapping("/saveProduit")
	public String saveProduit(@ModelAttribute("produit") ProduitDto produit,
							 // @RequestParam("date") String date,
							  ModelMap modelMap) throws ParseException{
		//conversion de la date 
		//conversion du json en provenent du front
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
		
		Date dateCreation=dateFormat.parse(String.valueOf(produit.getDate()));
		
		// data transfer object DTO
		Produit p  = new Produit();
		p.setNomProduit(produit.getNomProduit());
		p.setPrixProduit(produit.getPrixProduit());
		p.setDate(dateCreation);
		
		Produit saveProduit=produitService.saveProduit(p);
		String msg ="produit enregistre avec Id "+saveProduit.getIdproduit();
		modelMap.addAttribute("msg",msg);
		return "createProduit";
	}
	
	@RequestMapping("/ListeProduits")
			public String ListeProduits(ModelMap modelMap) {
		
		List<Produit> prod = produitService.getAllproduit();
		modelMap.addAttribute("produits",prod);
		return "ListeProduits";
		
	}
	

}
