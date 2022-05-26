package com.wat.apiSpringboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wat.apiSpringboot.Model.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
