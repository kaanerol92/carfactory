package com.kaanerol.carfactory.controller;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.kaanerol.carfactory.entity.concretes.Cabrio;
import com.kaanerol.carfactory.entity.concretes.Hatchback;
import com.kaanerol.carfactory.entity.concretes.Sedan;

@SpringBootTest
@AutoConfigureMockMvc
class CarControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	private String getTypeUrl = "/car/getType?type=";

	@Test
	public void whenGetTypeCabrioThenSuccess() throws Exception {
		mockMvc.perform(get(getTypeUrl + Cabrio.TYPE)).andExpect(status().isOk())
				.andExpect(content().string(containsString(Cabrio.TYPE + " car has produced")));
	}
	
	@Test
	public void whenGetTypeSedanThenSuccess() throws Exception {
		mockMvc.perform(get(getTypeUrl + Sedan.TYPE)).andExpect(status().isOk())
		.andExpect(content().string(containsString(Sedan.TYPE + " car has produced")));
	}
	
	@Test
	public void whenGetTypeHatchbackThenSuccess() throws Exception {
		mockMvc.perform(get(getTypeUrl + Hatchback.TYPE)).andExpect(status().isOk())
		.andExpect(content().string(containsString(Hatchback.TYPE + " car has produced")));
	}
	
	@Test
	public void whenGetTypeUnknownThenSuccess() throws Exception {
		mockMvc.perform(get(getTypeUrl + "unknown")).andExpect(status().isBadRequest());
	}

}
