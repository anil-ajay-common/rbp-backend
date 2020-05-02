package com.rbp.backend.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
public class State {

	@Id
	private Long id;
	
	@NotEmpty(message="Please Provide Book Name")
	private String stateName;
	
	@NotNull
	private Date createDate;
	
	@NotEmpty(message = "Please Provide Creator")
	private String createdBy;
	
	@NotEmpty(message = "Please Provide Modifier")
	private String modifiedBy;
	
	@NotNull
	private Date modifiedDate;
	
	private boolean active;
	
	@OneToMany(mappedBy = "state", fetch = FetchType.LAZY,
				cascade = CascadeType.ALL)
	private List<City> cities;
	
	public State() {
		super();
	}
	
	public State(Long id, String stateName, Date createDate, String createdBy, String modifiedBy, Date modifiedDate,
			boolean active, List<City> cities) {
		super();
		this.id = id;
		this.stateName = stateName;
		this.createDate = createDate;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.active = active;
		this.cities = cities;
	}

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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
	
}
