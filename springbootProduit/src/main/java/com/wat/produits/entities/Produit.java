package com.wat.produits.entities;




import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.Data;


@Entity
@Data

public class Produit {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idproduit;
	private String nomProduit;
	private double prixProduit;
	//format de passage de l'entite au front 
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
	private Date date;
	
	
	
	public Produit() {

	}
	
	public Produit(String nomProduit, int prixProduit,Date date) {

		this.nomProduit=nomProduit;
		this.prixProduit=prixProduit;
		this.date=date;
	}
	
	public Produit(String nomProduit, int prixProduit) {

		this.nomProduit=nomProduit;
		this.prixProduit=prixProduit;
		
	}
	
	

}
