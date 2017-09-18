package com.bank.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Token {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String tokenNo;
	private Date tokenDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTokenNo() {
		return tokenNo;
	}
	public void setTokenNo(String tokenNo) {
		this.tokenNo = tokenNo;
	}
	public Date getTokenDate() {
		return tokenDate;
	}
	public void setTokenDate(Date tokenDate) {
		this.tokenDate = tokenDate;
	}
	
}
