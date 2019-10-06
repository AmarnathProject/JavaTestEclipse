package com.webx.minuts.Model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "QUALIFICATION")
public class UserQuilification {

	@Id
	@GeneratedValue
	@Column(name = "QUA_ID")
	private int qid;

	@Column(name = "NAME")
	private String nameoftheperson;

	@OneToOne
	@JoinColumn(name = "qid")
	private Set<Matrics> matrics;

	@OneToOne
	@JoinColumn(name = "qid")
	private Set<Secoundry_Education> secoundry;

	@OneToOne
	@JoinColumn(name = "qid")
	private Set<Graduation> graduation;

	@ManyToOne
	private UserEntity users;

	public UserEntity getUsers() {
		return users;
	}

	public void setUsers(UserEntity users) {
		this.users = users;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getNameoftheperson() {
		return nameoftheperson;
	}

	public void setNameoftheperson(String nameoftheperson) {
		this.nameoftheperson = nameoftheperson;
	}

	public Set<Matrics> getMatrics() {
		return matrics;
	}

	public void setMatrics(Set<Matrics> matrics) {
		this.matrics = matrics;
	}

	public Set<Secoundry_Education> getSecoundry() {
		return secoundry;
	}

	public void setSecoundry(Set<Secoundry_Education> secoundry) {
		this.secoundry = secoundry;
	}

	public Set<Graduation> getGraduation() {
		return graduation;
	}

	public void setGraduation(Set<Graduation> graduation) {
		this.graduation = graduation;
	}

}
