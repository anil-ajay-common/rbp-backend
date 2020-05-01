package com.rbp.backend.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbp.backend.Entity.State;
import com.rbp.backend.dao.IStateDao;
import com.rbp.backend.dto.StateDto;

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
		State state=stateDao.findById(id).get(); ;
		return  new StateDto(state.getId(),state.getStateName());
	}
}
