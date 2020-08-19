package com.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Welcome to Spring Boot";
	}
}
