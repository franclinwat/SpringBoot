package com.wat.produits.service;

import java.util.ArrayList;

import com.wat.produits.entities.Produit;

public interface ProduitService {
	
	
	Produit saveProduit(Produit p);
	Produit updateProduit(Produit p);
	void deleteProduit(Produit p);
	void deleteProduitById(Long id);
	Produit getProduit(Long id);
	ArrayList<Produit> getAllproduit();
	

}
