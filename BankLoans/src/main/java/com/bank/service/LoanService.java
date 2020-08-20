package com.bank.service;

import java.util.List;

import com.bank.model.Loans;

public interface LoanService {
	
	// CREATE
	public Loans createLoan(Loans loan);
	
	//READ
	public Loans getLoanById(int id);
	public Loans getLoanByStatus(String status);
	public Loans getLoanByCustomerID(int custID);
	public List<Loans> getAllLoans();
	
	//UPDATE
	public Loans updateUserLoan(Loans loan);
	
	//DELETE
	public void deleteLoanById(int id);

}
