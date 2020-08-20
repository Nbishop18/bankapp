package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.Accounts;
import com.bank.service.AccountService;

@CrossOrigin(origins = "*")
@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountServ;
	
	@PostMapping("/account")
	public Accounts createLoginAccount(@RequestBody Accounts account) {
		account.setAccountType("CHECKING");
		account.setAccountStatus("PENDING");
		return accountServ.createAccount(account);
	}
	
	@GetMapping("/accounts")
	public List<Accounts> getAllAccounts(){
		return accountServ.getAllAccounts();
	}

}
