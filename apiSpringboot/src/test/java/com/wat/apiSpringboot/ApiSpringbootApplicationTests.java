package com.wat.apiSpringboot;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.wat.apiSpringboot.Model.Employee;
import com.wat.apiSpringboot.controller.EmployeeController;
import com.wat.apiSpringboot.service.EmployeeService;


@WebMvcTest(controllers = EmployeeController.class)
//@SpringBootTest
class ApiSpringbootApplicationTests {
	
	// test unitaire avec mock
	
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private EmployeeService employeeService;
	
	@Test
	public void testGetEmployees() throws Exception{
		
		mockMvc.perform(get("/employees")).andExpect(status().isOk());
		
	}
	
	
	/* test et ajout d'un employee dans la Db 
	@Autowired
	private EmployeeService employeeService;
	
	@Test
	public void testCreateEmployees() {
		Employee employee = new Employee("Kima","Wat","Kima@yahoo.fr","papa");
		
		employeeService.saveEmployee(employee);
		
	}  */

}
