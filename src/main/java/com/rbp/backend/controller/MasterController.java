package com.rbp.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rbp.backend.dto.StateDto;
import com.rbp.backend.service.StateService;

@RestController
public class MasterController {
	
	@Autowired
	private StateService stateService;
	
	@GetMapping("/states")
	public List<StateDto> getAllStates() {
		return stateService.getAllStates();
	}
	@GetMapping("/states/{id}")
	public StateDto getState(@PathVariable("id") Long id) {
		return stateService.getState(id);
	}

}
