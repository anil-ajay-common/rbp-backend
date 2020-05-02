package com.rbp.backend.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbp.backend.Entity.State;
import com.rbp.backend.dao.IStateDao;
import com.rbp.backend.dto.StateDto;
import com.rbp.backend.error.CustomNotFoundException;

@Service
public class StateService {
	
	@Autowired
	private IStateDao stateDao;
	
	public List<StateDto> getAllStates() {
		List<StateDto> list = new ArrayList<>();
		stateDao.findAll().stream().forEach(state -> {
			list.add(new StateDto(state.getId(), state.getStateName()));
		});
		return list;
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
