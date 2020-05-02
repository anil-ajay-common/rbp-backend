package com.rbp.backend.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class State {

	@Id
	private Long id;
	private String stateName;
	private Date createDate;
	private String createdBy;
	private String modifiedBy;
	private Date modifiedDate;
	private boolean active;
	
	@OneToMany(mappedBy = "state", fetch = FetchType.LAZY,
				cascade = CascadeType.ALL)
	private List<City> cities;
	
	
	
	public State() {
		super();
		// TODO Auto-generated constructor stub
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
		createdBy = createdBy;
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
	
	
	public List<City> getCities() {
		return cities;
	}
	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "State [id=" + id + ", stateName=" + stateName + ", createDate=" + createDate + ", createdBy="
				+ createdBy + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + ", active=" + active
				+ ", cities=" + cities + "]";
	}
	
	
	
	
}
