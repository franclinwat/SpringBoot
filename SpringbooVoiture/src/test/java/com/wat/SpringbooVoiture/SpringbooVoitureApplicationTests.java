package com.wat.SpringbooVoiture;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.wat.SpringbooVoiture.Controller.VoitureController;
import com.wat.SpringbooVoiture.Service.VoitureService;


//@WebMvcTest(controllers = VoitureController.class)
@SpringBootTest
@AutoConfigureMockMvc
class SpringbooVoitureApplicationTests {
	
	
	@Autowired
	public  MockMvc mockMvc;
	
	
	//test d'integration  avec MockMvc
	
	@Test
	public void testGetVoiture() throws Exception {
			
		mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(jsonPath("$[1].nom", is("watson")));
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/* test unitaire MockMvc
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private VoitureService service;
	
	

	@Test
	public void getAllVoiture() throws Exception {
		
		mockMvc.perform(get("/")).andExpect(status().isOk());
	}
	*/
	
	
	
}
