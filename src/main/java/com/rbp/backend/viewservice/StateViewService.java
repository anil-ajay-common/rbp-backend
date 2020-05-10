package com.rbp.backend.viewservice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.rbp.backend.dto.StateDto;
import com.rbp.backend.service.StateService;

@Component("state")
@Scope("session")
public class StateViewService implements Serializable {

	@Autowired
	private StateService stateService;
	
	public StateViewService() {
	}
	
	public List<StateDto> getStates() {
		Page<StateDto> pages = stateService.getAllStates(0, 10, "id");
		return pages.getContent();
	}
}
