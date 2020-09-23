package com.capgemini.pecunia.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//declaring the required entities
@Entity                            //defines a class can be mapped to table
@Table(name="SlipTransactions")    //details of table
public class SlipTransactions {
	@Id                            //specification of primary key
	@Column(length = 8)            //details of column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int transactionID;
	@Column(length = 10)
	private Date transactionDate;
	@Column(length = 10)
	private String transactionType;
	@Column(length = 12)
	private String accountNo;
	@Column(length=12)
	private double amount;
	
//generation of getters and setters
	public int getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
