package com.wat.produits;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wat.produits.entities.Produit;
import com.wat.produits.repos.ProduitRepository;

@SpringBootTest
class SpringbootProduitApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
	
	Produit prod = new Produit("Dell1",500);
	Produit prod2 = new Produit("Dell1",500,new Date());
	
	@Test
	public void tesCreateProduit() {
		
		produitRepository.save(prod);
	}
	
	@Test
	public void testDeletedProduit() {
		
		produitRepository.deleteById(1L);
		produitRepository.deleteById(2L);
	}
	

}
