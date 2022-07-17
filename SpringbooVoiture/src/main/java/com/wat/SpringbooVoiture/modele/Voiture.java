package com.wat.SpringbooVoiture.modele;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Voiture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVoiture;
	
	@Column(name = "first_Name")
	private String nom;
	
	private int age;
	
	public Voiture() {}

	public Voiture(String nom, int age) {
		
		this.nom = nom;
		this.age = age;
	}
	
	

	
}
