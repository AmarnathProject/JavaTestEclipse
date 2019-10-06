package com.webx.minuts.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BACKGROUND")
public class BackGroundVerification {

	@Id
	@GeneratedValue
	@Column(name = "BID")
	private int bid;

	@Column(name = "DOCUMENTS_DETAILS")
	private String Documents_Details;

	@Column(name = "CRIMINALS_RECORD")
	private boolean Criminals_record;

	@Column(name = "STATUS")
	private boolean StatusOfVeification;

	@Column(name = "CHECK")
	private boolean DocumentsCheck;

	@ManyToOne
	private UserEntity users;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getDocuments_Details() {
		return Documents_Details;
	}

	public void setDocuments_Details(String documents_Details) {
		Documents_Details = documents_Details;
	}

	public boolean isCriminals_record() {
		return Criminals_record;
	}

	public void setCriminals_record(boolean criminals_record) {
		Criminals_record = criminals_record;
	}

	public boolean isStatusOfVeification() {
		return StatusOfVeification;
	}

	public void setStatusOfVeification(boolean statusOfVeification) {
		StatusOfVeification = statusOfVeification;
	}

	public boolean isDocumentsCheck() {
		return DocumentsCheck;
	}

	public void setDocumentsCheck(boolean documentsCheck) {
		DocumentsCheck = documentsCheck;
	}

	public UserEntity getUsers() {
		return users;
	}

	public void setUsers(UserEntity users) {
		this.users = users;
	}

}
