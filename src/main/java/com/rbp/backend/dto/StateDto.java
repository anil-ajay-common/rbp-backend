package com.rbp.backend.dto;

import java.util.Date;

public class StateDto {
	private Long id;
	private String stateName;
	
	public StateDto(Long id, String stateName) {
		super();
		this.id = id;
		this.stateName = stateName;
	}
	
	public StateDto() {}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}	
}
