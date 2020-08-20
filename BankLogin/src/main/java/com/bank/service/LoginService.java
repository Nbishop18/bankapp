package com.bank.service;

import java.util.List;

import com.bank.model.Login;

public interface LoginService {

	// CREATE
	public Login createLogin(Login log);
	
	//READ
	public Login getUserById(int id);
	public Login getUserByUsername(String uname);
	public List<Login> getAllLoginAcc();
	
	//UPDATE
	public Login updateUserAccount(Login log);
	
	//DELETE
	public void deleteAccountById(int id);
}
