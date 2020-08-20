package com.bank.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.LoginRepo;
import com.bank.model.Login;
import com.bank.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
	
	//REPO INJECTION
	private LoginRepo lRepo;
	
	@Autowired
	public LoginServiceImpl(LoginRepo lRepo) {
		this.lRepo = lRepo;
	}

	
	// CRUD
	@Override
	public Login createLogin(Login log) {
		return lRepo.save(log);
	}

	@Override
	public Login getUserById(int id) {
		return lRepo.findById(id).get();
	}

	@Override
	public Login getUserByUsername(String uname) {
		return lRepo.findByuserName(uname).get();
	}

	@Override
	public List<Login> getAllLoginAcc() {
		return lRepo.findAll();
	}

	@Override
	public Login updateUserAccount(Login log) {
		return lRepo.save(log);
	}

	@Override
	public void deleteAccountById(int id) {
		lRepo.deleteById(id);
	}

}
