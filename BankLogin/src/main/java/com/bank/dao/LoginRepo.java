package com.bank.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.Login;

@Repository
public interface LoginRepo extends JpaRepository<Login, Integer>{
	public Optional<Login> findByuserName(String userName);


}
