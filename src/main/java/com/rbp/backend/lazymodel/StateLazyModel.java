package com.rbp.backend.lazymodel;

import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;
import org.primefaces.model.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbp.backend.dto.StateDto;
import com.rbp.backend.service.StateService;

@Service
public class StateLazyModel extends LazyDataModel<StateDto> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private StateService stateService; 

	
	@Override
	public List<StateDto> load(int first, int pageSize, String sortField, SortOrder sortOrder,
			Map<String, Object> filters) {
		
		setRowCount(stateService.getStateCount());
		return stateService.getAllStates(first, pageSize, "id").getContent();
	}
	
}
