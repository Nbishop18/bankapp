package com.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class customer {
	
	@Id
	@Column(name = "CUSTOMERID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bankid_generator")
	@SequenceGenerator(name="bankid_generator", sequenceName = "bankid_generator", initialValue = 1000, allocationSize=100)
	private int customerID;
	
	@Column(name = "FIRSTNAME", nullable = false)
	private String firstName;
	
	@Column(name = "LASTNAME", nullable = false)
	private String lastName;
	
	@Column(name = "EMAIL", nullable = false, unique = true)
	private String emailAddress;
	
	@Column(name = "CONTACT", nullable = false)
	private long contactNumber;

	
	public customer() {
		// TODO Auto-generated constructor stub
	}
	
	public customer(int customerID, String firstName, String lastName, String emailAddress, int contactNumber) {
		super();
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.contactNumber = contactNumber;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "customer [customerID=" + customerID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailAddress=" + emailAddress + ", contactNumber=" + contactNumber + "]";
	}

	
	
}
