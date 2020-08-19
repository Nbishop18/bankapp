package com.bank.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.customer;

@Repository
public interface customerRepo extends JpaRepository<customer, Integer>{
	public Optional<customer> findByLastName(String lname);

}
