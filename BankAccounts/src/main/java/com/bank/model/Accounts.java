package com.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNTS")
public class Accounts {
	
	@Id
	@Column(name = "ACCOUNTID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountID;
	
	@Column(name = "CUSTOMERID", nullable = false, unique = true)
	private int customerID;
	
	@Column(name = "ACCOUNT_TYPE", nullable = false)
	private String accountType;
	
	@Column(name = "BALANCE", nullable = false)
	private double balance;
	
	@Column(name = "ACCOUNT_STATUS", nullable = false)
	private String accountStatus;
	
	public Accounts() {
		// TODO Auto-generated constructor stub
	}

	public Accounts(int accountID, int customerID, String accountType, double balance, String accountStatus) {
		super();
		this.accountID = accountID;
		this.customerID = customerID;
		this.accountType = accountType;
		this.balance = balance;
		this.accountStatus = accountStatus;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	@Override
	public String toString() {
		return "Accounts [accountID=" + accountID + ", customerID=" + customerID + ", accountType=" + accountType
				+ ", balance=" + balance + ", accountStatus=" + accountStatus + "]";
	}
	
	

}
