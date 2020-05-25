package com.rbp.backend.viewservice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.rbp.backend.dto.StateDto;
import com.rbp.backend.lazymodel.StateLazyModel;

@Component("state")
@Scope("session")
public class StateViewService implements Serializable {

	private List<StateDto> dataList;
	
	
	
	@Autowired
	private StateLazyModel stateLazyModel;
	
	@PostConstruct
	public void init() {
		dataList = new ArrayList<StateDto>();
		dataList.add(new StateDto(101L,"Hariyana"));
		dataList.add(new StateDto(101L,"Hariyana"));

		dataList.add(new StateDto(101L,"Hariyana"));

		dataList.add(new StateDto(101L,"Hariyana"));

		dataList.add(new StateDto(101L,"Hariyana"));

		dataList.add(new StateDto(101L,"Hariyana"));

		dataList.add(new StateDto(101L,"Hariyana"));

		dataList.add(new StateDto(101L,"Hariyana"));

		dataList.add(new StateDto(101L,"Hariyana"));

		dataList.add(new StateDto(101L,"Hariyana"));

		dataList.add(new StateDto(101L,"Hariyana"));

		dataList.add(new StateDto(101L,"Hariyana"));
		dataList.add(new StateDto(101L,"Hariyana"));

		dataList.add(new StateDto(101L,"Hariyana"));

		dataList.add(new StateDto(101L,"Hariyana"));

		dataList.add(new StateDto(101L,"Hariyana"));

		dataList.add(new StateDto(101L,"Hariyana"));

		dataList.add(new StateDto(101L,"Hariyana"));

		dataList.add(new StateDto(101L,"Hariyana"));

		dataList.add(new StateDto(101L,"Hariyana"));

		dataList.add(new StateDto(103L,"Rajasthan"));

	}
	public StateViewService() {
	}

	public StateLazyModel getStateLazyModel() {
		return stateLazyModel;
	}

	public void setStateLazyModel(StateLazyModel stateLazyModel) {
		this.stateLazyModel = stateLazyModel;
	}

	public List<StateDto> getDataList() {
		return dataList;
	}

	public void setDataList(List<StateDto> dataList) {
		this.dataList = dataList;
	}
	
	
	
	
}
