package com.wat.apiSpringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wat.apiSpringboot.Model.Employee;
import com.wat.apiSpringboot.service.EmployeeService;

@RestController

public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService ;
	
	
	@GetMapping("/employee")
	public Iterable<Employee> getEmployee(){
		return employeeService.getEmployee();
	}
	

}