package com.rbp.backend.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rbp.backend.Entity.State;
import com.rbp.backend.dao.IStateDao;
import com.rbp.backend.dto.StateDto;
import com.rbp.backend.error.CustomNotFoundException;
import com.rbp.backend.service.StateService;

import javassist.NotFoundException;

@RestController
@Validated
@CrossOrigin(origins = "http://localhost:4200")
public class MasterController {
	
	@Autowired
	private StateService stateService;
	
	@GetMapping("/states")
	public Page<StateDto> getAllStates( @RequestParam(defaultValue = "0") Integer pageNo, 
									@RequestParam(defaultValue = "10") Integer pageSize,
									@RequestParam(defaultValue = "id") String sortBy) {
		return stateService.getAllStates(pageNo, pageSize, sortBy);
	}
	
	@GetMapping("/state/{id}")
	public StateDto getState(@PathVariable("id") Long id) {
		return stateService.getState(id);
	}
	
	@PutMapping("/state/{id}")
	public State updateState(@RequestBody StateDto stateDto, @PathVariable Long id) {
		return stateService.updateOrSave(stateDto, id);		
	}
	
	@PostMapping("/state")
	public State saveState(@RequestBody @Valid State state) {
		return stateService.save(state);	
	}

}
