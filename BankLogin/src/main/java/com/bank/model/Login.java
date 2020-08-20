package com.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOGIN_ACCESS")
public class Login {

	@Id
	@Column(name = "LOGINID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loginID;
	
	@Column(name = "CUSTOMERID", nullable = false, unique = true)
	private int customerID;

	@Column(name = "USERNAME", nullable = false, unique = true)
	private String userName;
	
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	
	@Column(name = "ACCESS_LEVEL", nullable = false)
	private String accessLevel;
	
	@Column(name = "ACCOUNT_STATUS", nullable = false)
	private String accountStatus;
	
	public Login() {
		// TODO Auto-generated constructor stub
	}

	public Login(int loginID, int customerID, String userName, String password, String accessLevel,
			String accountStatus) {
		super();
		this.loginID = loginID;
		this.customerID = customerID;
		this.userName = userName;
		this.password = password;
		this.accessLevel = accessLevel;
		this.accountStatus = accountStatus;
	}

	public int getLoginID() {
		return loginID;
	}

	public void setLoginID(int loginID) {
		this.loginID = loginID;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	@Override
	public String toString() {
		return "Login [loginID=" + loginID + ", customerID=" + customerID + ", userName=" + userName + ", password="
				+ password + ", accessLevel=" + accessLevel + ", accountStatus=" + accountStatus + "]";
	}

	
	
	
	
	
}
