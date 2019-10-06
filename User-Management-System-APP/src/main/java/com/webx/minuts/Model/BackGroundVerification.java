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
	private String documents_details;

	@Column(name = "CRIMINALS_RECORD")
	private boolean criminals_record;

	@Column(name = "STATUS")
	private boolean statusofverification;

	@Column(name = "DOCUMENT_CHECK")
	private String documentcheck;

	@ManyToOne
	private User users;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getDocuments_details() {
		return documents_details;
	}

	public void setDocuments_details(String documents_details) {
		this.documents_details = documents_details;
	}

	public boolean isCriminals_record() {
		return criminals_record;
	}

	public void setCriminals_record(boolean criminals_record) {
		this.criminals_record = criminals_record;
	}

	public boolean isStatusofverification() {
		return statusofverification;
	}

	public void setStatusofverification(boolean statusofverification) {
		this.statusofverification = statusofverification;
	}

	public String getDocumentcheck() {
		return documentcheck;
	}

	public void setDocumentcheck(String documentcheck) {
		this.documentcheck = documentcheck;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

}
