package com.kaanerol.carfactory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kaanerol.carfactory.service.abstracts.CarService;

@RestController
@RequestMapping("/car")
public class CarController {

	@Autowired
	CarService carService;

	@GetMapping("/getType")
	public ResponseEntity<String> getType(@RequestParam String type) {
		return ResponseEntity.ok(carService.getType(type));
	}
}
