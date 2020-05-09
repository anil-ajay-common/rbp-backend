package com.rbp.backend.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Converter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.rbp.backend.Entity.State;
import com.rbp.backend.dao.IStateDao;
import com.rbp.backend.dto.StateDto;
import com.rbp.backend.error.CustomNotFoundException;

@Service
public class StateService {
	
	@Autowired
	private IStateDao stateDao;
	
	public Page<StateDto> getAllStates(Integer pageNo, Integer pageSize, String sortBy) {
		Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
		Page<State> pageStatesEntities = stateDao.findAll(pageable);
		Page<StateDto> pageStatesDtoEntities = pageStatesEntities.map(obj -> {
			StateDto dto = new StateDto(obj.getId(), obj.getStateName());
			dto.setId(obj.getId());
			dto.setStateName(obj.getStateName());
			dto.setModifiedBy(obj.getModifiedBy());
			dto.setCreatedBy(obj.getCreatedBy());
			dto.setActive(obj.isActive());
			return dto;
		});
		return pageStatesDtoEntities;
	}


	public StateDto getState(Long id) {
		return stateDao.findById(id)
		.map(state -> new StateDto(state.getId(), state.getStateName()))
		.orElseThrow(() -> new CustomNotFoundException("State Not Found: " + id));
	}
	
	public State updateOrSave(StateDto stateDto, Long id) {
		State stateObject = stateDao.findById(id).orElseThrow(() -> new CustomNotFoundException("State Not Found : " + id));
		stateObject.setStateName(stateDto.getStateName());
		stateObject.setModifiedDate(new Date());
		return stateDao.save(stateObject);
	}
	
	public State save(State state) {
		state.setCreateDate(new Date());
		state.setModifiedDate(new Date());
		return stateDao.save(state);
	}
}
