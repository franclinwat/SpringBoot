package com.wat.apiSpringboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wat.apiSpringboot.Model.Employee;
import com.wat.apiSpringboot.repository.EmployeeRepository;

import lombok.Data;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Optional<Employee> getEmployee( final Long id){
		return employeeRepository.findById(id);
	}
	
	public Iterable<Employee> getEmployee(){
		return employeeRepository.findAll();
		
	}
	
	public void deletedAllEmployee(Employee employee) {
		
		employeeRepository.delete(employee);
	}
	
	public void deletedEmployeeById(final Long id) {
		
		employeeRepository.deleteById(id);
	}
	
	public Employee  saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
		
	}

}
