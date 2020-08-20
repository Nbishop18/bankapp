package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.Login;
import com.bank.service.LoginService;

@CrossOrigin(origins = "*")
@RestController
public class LoginController {
	
	@Autowired
	private LoginService logServ;
	
	
	
	
	@PostMapping("/user")
	public Login createLoginAccount(@RequestBody Login log) {
		log.setAccessLevel("CUSTOMER");
		log.setAccountStatus("PENDING");
		return logServ.createLogin(log);
		
	}
	
	@GetMapping("/users")
	public List<Login> getAllLoginAccount(){
		return logServ.getAllLoginAcc();
	}

}
