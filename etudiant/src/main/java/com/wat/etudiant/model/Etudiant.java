package com.wat.etudiant.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	private Long id;
	@Column(name = "STUDENT_NAME")
	private String name;
	private LocalDate  birthdate;
	
	
	
}
