package com.capgemini.pecunia.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
//declaring the required entities
@Entity                         //defines class can be mapped to table
@Table(name="Transactions")     //details of table
@SequenceGenerator(name="seq", initialValue=10000, allocationSize=1)  //Defines a primary key generator that may be referenced by name when a generator element is specified for the GeneratedValue annotation
//declaring the required entities 
public class Transactions {
	@Id                          //defines a class can be mapped to table
	@Column(length=8)            //details of column
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")    //auto generation of values for the feild
	
	private int transId;
	@Column(length=8)
	private String transType;
	@Column(length=8)
	private Double transAmount;
	@Column(length = 20)
	private Date transDate;
	@Column(length=12)
	private String transFrom;
	@Column(length=12)
	private String transTo;
	@Column(length = 12)
	private String accountId;
	
	
	// generation of getters and setters

	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public Double getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(Double transAmount) {
		this.transAmount = transAmount;
	}
	public Date getTransDate() {
		return transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	public String getTransFrom() {
		return transFrom;
	}
	public void setTransFrom(String transFrom) {
		this.transFrom = transFrom;
	}
	public String getTransTo() {
		return transTo;
	}
	public void setTransTo(String transTo) {
		this.transTo = transTo;
	}
	public int getTransId() {
		return transId;
	}

	public void setTransId(int transId) {
		this.transId = transId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Transactions() {
		super();	
	}
	
	
	
	
}
	
