package com.rbp.backend.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbp.backend.Entity.State;
import com.rbp.backend.dao.IStateDao;

@Service
public class StateService {
	
	@Autowired
	private IStateDao stateDao;
	public State updateState(String state) {
		
		return null;
	}
	

}
