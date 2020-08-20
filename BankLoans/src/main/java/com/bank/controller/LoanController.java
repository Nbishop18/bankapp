package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.Loans;
import com.bank.service.LoanService;

@CrossOrigin(origins = "*")
@RestController
public class LoanController {

	@Autowired
	private LoanService loanServ;
	
	
	
	@PostMapping("/loan")
	public Loans createLoginAccount(@RequestBody Loans loan) {
		loan.setLoanType("PERSONAL");
		loan.setLoanStatus("PENDING");
		return loanServ.createLoan(loan);
	}
	
	@GetMapping("/loans")
	public List<Loans> getAllLoans(){
		return loanServ.getAllLoans();
	}
	
	
}
