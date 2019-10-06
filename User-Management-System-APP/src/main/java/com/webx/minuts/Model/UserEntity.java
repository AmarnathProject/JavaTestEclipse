package com.webx.minuts.Model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USER_CALL")
public class UserEntity {

	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private int uid;

	@Column(name = "USER_NAME")
	private String Name;

	@Column(name = "PANCARD")
	private String PanCard_Number;

	@Column(name = "ADHAR")
	private String AdharCard_Number;

	@Column(name = "EMAIL")
	private String Email;

	@Column(name = "PHONE")
	private Integer Phone_Number;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<AddressEntity> address;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<UserQuilification> userQualification;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<BackGroundVerification> verification;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public Set<UserQuilification> getUserQualification() {
		return userQualification;
	}

	public void setUserQualification(Set<UserQuilification> userQualification) {
		this.userQualification = userQualification;
	}

	public Set<BackGroundVerification> getVerification() {
		return verification;
	}

	public void setVerification(Set<BackGroundVerification> verification) {
		this.verification = verification;
	}

	public int getId() {
		return uid;
	}

	public void setId(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPanCard_Number() {
		return PanCard_Number;
	}

	public void setPanCard_Number(String panCard_Number) {
		PanCard_Number = panCard_Number;
	}

	public String getAdharCard_Number() {
		return AdharCard_Number;
	}

	public void setAdharCard_Number(String adharCard_Number) {
		AdharCard_Number = adharCard_Number;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Integer getPhone_Number() {
		return Phone_Number;
	}

	public void setPhone_Number(Integer phone_Number) {
		Phone_Number = phone_Number;
	}

	public Set<AddressEntity> getAddress() {
		return address;
	}

	public void setAddress(Set<AddressEntity> address) {
		this.address = address;
	}

}
