package com.rbp.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rbp.backend.dto.CityDto;
import com.rbp.backend.service.CityService;

@RestController
public class CityMasterController {

	@Autowired
	private CityService cityService; 
	
	@GetMapping("/cities")
	public List<CityDto> getAllCities(){
		return cityService.getAllCities();
	}
}
