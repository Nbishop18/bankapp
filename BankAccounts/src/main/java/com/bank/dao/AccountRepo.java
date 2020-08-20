package com.bank.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.model.Accounts;

public interface AccountRepo extends JpaRepository<Accounts, Integer>{
	public Optional<Accounts> findByaccountType(String accountType);
	public Optional<Accounts> findByaccountStatus(String accountStatus);
	public Optional<Accounts> findBycustomerID(int customerID);
}
