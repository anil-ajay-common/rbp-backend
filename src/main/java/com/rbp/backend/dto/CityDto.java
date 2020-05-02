package com.rbp.backend.dto;

public class CityDto {

	private Long id;
	private String cityName;
	public CityDto(Long id, String cityName) {
		super();
		this.id = id;
		this.cityName = cityName;
	}
	public CityDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
}
