package com.bank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.LoanRepo;
import com.bank.model.Loans;
import com.bank.service.LoanService;

@Service
public class LoanServiceImpl implements LoanService{

	//REPO INJECTION
	private LoanRepo lRepo;
	
	@Autowired
	public LoanServiceImpl(LoanRepo lRepo) {
		this.lRepo = lRepo;
	}

	// CRUD
	@Override
	public Loans createLoan(Loans loan) {
		return lRepo.save(loan);
	}

	@Override
	public Loans getLoanById(int id) {
		return lRepo.findById(id).get();
	}

	@Override
	public Loans getLoanByStatus(String status) {
		return lRepo.findByloanStatus(status).get();
	}

	@Override
	public Loans getLoanByCustomerID(int custID) {
		return lRepo.findBycustomerID(custID).get();
	}

	@Override
	public List<Loans> getAllLoans() {
		return lRepo.findAll();
	}

	@Override
	public Loans updateUserLoan(Loans loan) {
		return lRepo.save(loan);
	}

	@Override
	public void deleteLoanById(int id) {
		lRepo.deleteById(id);
		
	}

}
