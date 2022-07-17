package com.wat.produits;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wat.produits.entities.Produit;
import com.wat.produits.repos.ProduitRepository;
import com.wat.produits.service.ProduitService;

@SpringBootTest
class SpringbootProduitApplicationTests {

	@Autowired
	private ProduitService produitService;
	
	
	
	
	@Test
	public void tesCreateProduit() {
		//given
		Produit prod2 = new Produit("Dell58",967,new Date());
		produitService.saveProduit(prod2);
		
		//when
		
		String expect=produitService.getProduit(6L).getNomProduit();
		
		//then
		
		assertThat(expect).isEqualTo("Dell58");
	}
	
	

}
