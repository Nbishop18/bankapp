package com.bank.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.model.Loans;

public interface LoanRepo extends JpaRepository<Loans, Integer>{
	public Optional<Loans> findByloanStatus(String loanStatus);
	public Optional<Loans> findBycustomerID(int customerID);

}
