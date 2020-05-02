package com.rbp.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbp.backend.dao.ICityDao;
import com.rbp.backend.dto.CityDto;

@Service
public class CityService {

	 @Autowired
	 ICityDao cityDao;
	 
	 public List<CityDto> getAllCities(){
		 List<CityDto> cityList = new ArrayList<CityDto>();
		 cityDao.findAll().stream().forEach(city ->{
			 cityList.add(new CityDto(city.getId(),city.getCityName()));
		 });
		 return cityList;
	 }
}
