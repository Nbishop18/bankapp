package com.bank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.AccountRepo;
import com.bank.model.Accounts;
import com.bank.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	//REPO INJECTION
	private AccountRepo aRepo;
	
	@Autowired
	public AccountServiceImpl(AccountRepo aRepo) {
		this.aRepo = aRepo;
	}
	
	//CRUD
	@Override
	public Accounts createAccount(Accounts account) {
		return aRepo.save(account);
	}

	@Override
	public Accounts getAccountById(int id) {
		return aRepo.findById(id).get();
	}

	@Override
	public Accounts getAccountByStatus(String status) {
		return aRepo.findByaccountStatus(status).get();
	}

	@Override
	public Accounts getAccountByType(String status) {
		return aRepo.findByaccountType(status).get();
	}

	@Override
	public Accounts getAccountByCustomerID(int custID) {
		return aRepo.findBycustomerID(custID).get();
	}

	@Override
	public List<Accounts> getAllAccounts() {
		return aRepo.findAll();
	}

	@Override
	public Accounts updateUserAccount(Accounts account) {
		return aRepo.save(account);
	}

	@Override
	public void deleteAccountById(int id) {
		aRepo.deleteById(id);
	}

}
