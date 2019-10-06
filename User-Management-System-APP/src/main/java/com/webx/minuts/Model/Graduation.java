package com.webx.minuts.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GRADUATION")
public class Graduation {

	@Id
	@GeneratedValue
	@Column(name = "GID")
	private int gid;

	@Column(name = "COL_NAME")
	private String name;

	@Column(name = "SCHOOL")
	private String School;

	@Column(name = "UNIVERSITY")
	private String University;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String State;
	
	@Column(name = "PINCODE")
	private Integer PinCode;

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return School;
	}

	public void setSchool(String school) {
		School = school;
	}

	public String getUniversity() {
		return University;
	}

	public void setUniversity(String university) {
		University = university;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public Integer getPinCode() {
		return PinCode;
	}

	public void setPinCode(Integer pinCode) {
		PinCode = pinCode;
	}

	
}
