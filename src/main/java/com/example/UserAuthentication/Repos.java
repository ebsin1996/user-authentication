package com.example.UserAuthentication;


import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Repos extends JpaRepository<Product,Integer>{

	User findByUsername(String username);

	

	
}
