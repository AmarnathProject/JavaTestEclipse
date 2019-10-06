package com.webx.minuts.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS_CALL")
public class AddressEntity {

	@Id
	@GeneratedValue
	@Column(name = "ADDR_ID")
	private int addrID;

	@Column(name = "STREET_NAME")
	private String StreetNo;

	@Column(name = "CITY")
	private String City;

	@Column(name = "STATE")
	private String State;

	@Column(name = "COUNTRY")
	private String Country;

	@Column(name = "PINCODE")
	private Integer PinCode;

	@ManyToOne
	private UserEntity users;

	public int getAddrID() {
		return addrID;
	}

	public void setAddrID(int addrID) {
		this.addrID = addrID;
	}

	public String getStreetNo() {
		return StreetNo;
	}

	public void setStreetNo(String streetNo) {
		StreetNo = streetNo;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public Integer getPinCode() {
		return PinCode;
	}

	public void setPinCode(Integer pinCode) {
		PinCode = pinCode;
	}

	public UserEntity getUsers() {
		return users;
	}

	public void setUsers(UserEntity users) {
		this.users = users;
	}

}
