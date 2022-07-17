package com.wat.etudiant2.modele;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Table(name = "ETUDIANTS")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Etudiant {

	@Id // mark id as primary key
	//@SequenceGenerator(name = "ETUDIANT_SEQ", sequenceName = "ETUDIANT_SEQ")
	//@GeneratedValue(generator = "ETUDIANT_SEQ", strategy = GenerationType.SEQUENCE)
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column // defining id as column name
	private Long id;

	
	private String name;
	
	@Column
	private int age;
	
	
	private String email;

}
