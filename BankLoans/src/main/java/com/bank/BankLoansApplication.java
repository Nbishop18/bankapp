package com.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BankLoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankLoansApplication.class, args);
	}

}
