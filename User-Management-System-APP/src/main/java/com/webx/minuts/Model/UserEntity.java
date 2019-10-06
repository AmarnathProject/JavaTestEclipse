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
	private String name;

	@Column(name = "PANCARD")
	private String panCard;

	@Column(name = "ADHAR")
	private String adhar;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PHONE")
	private Integer phone;

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
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getAdhar() {
		return adhar;
	}

	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Set<AddressEntity> getAddress() {
		return address;
	}

	public void setAddress(Set<AddressEntity> address) {
		this.address = address;
	}

}
