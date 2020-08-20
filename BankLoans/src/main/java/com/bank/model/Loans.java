package com.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOANS")
public class Loans {

	@Id
	@Column(name = "LOANID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanID;
	
	@Column(name = "CUSTOMERID", nullable = false, unique = true)
	private int customerID;

	@Column(name = "INCOME", nullable = false)
	private double income;
	
	@Column(name = "LOAN_AMOUNT", nullable = false)
	private double loanAmount;
	
	@Column(name = "LOAN_TYPE", nullable = false)
	private String loanType;
	
	@Column(name = "LOAN_STATUS", nullable = false)
	private String loanStatus;
	
	public Loans() {
		// TODO Auto-generated constructor stub
	}

	public Loans(int loanID, int customerID, double income, double loanAmount, String loanType, String loanStatus) {
		super();
		this.loanID = loanID;
		this.customerID = customerID;
		this.income = income;
		this.loanAmount = loanAmount;
		this.loanType = loanType;
		this.loanStatus = loanStatus;
	}

	public int getLoanID() {
		return loanID;
	}

	public void setLoanID(int loanID) {
		this.loanID = loanID;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	@Override
	public String toString() {
		return "Loans [loanID=" + loanID + ", customerID=" + customerID + ", income=" + income + ", loanAmount="
				+ loanAmount + ", loanType=" + loanType + ", loanStatus=" + loanStatus + "]";
	}
	
	
	
}
