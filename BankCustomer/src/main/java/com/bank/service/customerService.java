package com.bank.service;

import java.util.List;

import com.bank.model.customer;

public interface customerService {
	
	// CREATE new customer
	public customer createCustomer(customer cust);
	
	// READ customer data
	public customer getCustomerById(int id);
	public List<customer> getAllCustomer();
	
	// UPDATE customer data
	public customer updateCustomer(customer cust);
	
	// DELETE customer data
	public void deleteCustomer(int id);
}
