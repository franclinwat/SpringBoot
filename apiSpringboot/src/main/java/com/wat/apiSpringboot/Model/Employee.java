package com.wat.apiSpringboot.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employees")

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "first_Name")
	private String firstName;

	@Column(name = "last_Name")
	private String lasttName;

	private String Mail;
	private String password;

	public Employee() {}

	public Employee(String firstName, String lasttName, String mail, String password) {
		super();
		this.firstName = firstName;
		this.lasttName = lasttName;
		Mail = mail;
		this.password = password;
	}
	
	
}
