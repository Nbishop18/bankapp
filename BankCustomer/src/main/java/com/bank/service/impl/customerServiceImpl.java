package com.bank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.customerRepo;
import com.bank.model.customer;
import com.bank.service.customerService;

@Service
public class customerServiceImpl implements customerService{
	
	private customerRepo custRepo;
	
	@Autowired
	public customerServiceImpl(customerRepo custRepo) {
		this.custRepo = custRepo;
	}
	
	@Override
	public customer createCustomer(customer cust) {
		return custRepo.save(cust);
	}

	@Override
	public customer getCustomerById(int id) {
		return custRepo.findById(id).get();
	}

	@Override
	public List<customer> getAllCustomer() {
		return custRepo.findAll();
	}

	@Override
	public customer updateCustomer(customer cust) {
		return custRepo.save(cust);
	}

	@Override
	public void deleteCustomer(int id) {
		custRepo.deleteById(id);
	}

}
