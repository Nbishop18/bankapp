package com.bank.service;

import java.util.List;

import com.bank.model.Accounts;

public interface AccountService {

	// CREATE
	public Accounts createAccount(Accounts account);
	
	//READ
	public Accounts getAccountById(int id);
	public Accounts getAccountByStatus(String status);
	public Accounts getAccountByType(String status);
	public Accounts getAccountByCustomerID(int custID);
	public List<Accounts> getAllAccounts();
	
	//UPDATE
	public Accounts updateUserAccount(Accounts account);
	
	//DELETE
	public void deleteAccountById(int id);
	
}
