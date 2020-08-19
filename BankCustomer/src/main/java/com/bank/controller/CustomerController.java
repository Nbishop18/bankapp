package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.customer;
import com.bank.service.customerService;

@CrossOrigin
@RestController
public class CustomerController {
	
	@Autowired
	private customerService custServ;
	
	@PostMapping("/customer")
	public customer createCustomer(@RequestBody customer cust) {
		return custServ.createCustomer(cust);
	}
		
		
		
	
		
		
	@GetMapping("/customers")
	public List<customer> getAllCustomer(){
		return custServ.getAllCustomer();
	}
		
	

}
