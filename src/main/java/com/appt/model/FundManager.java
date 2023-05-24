package com.appt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class FundManager {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long fundManagerId;
	private String fundManagerName;
	@OneToOne
	private User user;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getFundManagerId() {
		return fundManagerId;
	}
	public void setFundManagerId(long fundManagerId) {
		this.fundManagerId = fundManagerId;
	}
	public String getFundManagerName() {
		return fundManagerName;
	}
	public void setFundManagerName(String fundManagerName) {
		this.fundManagerName = fundManagerName;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public FundManager() {
		super();
	}
	public FundManager(long id, long fundManagerId, String fundManagerName, User user) {
		super();
		this.id = id;
		this.fundManagerId = fundManagerId;
		this.fundManagerName = fundManagerName;
		this.user = user;
	}
	@Override
	public String toString() {
		return "FundManager [id=" + id + ", fundManagerId=" + fundManagerId + ", fundManagerName=" + fundManagerName
				+ ", user=" + user + "]";
	}
	
}
