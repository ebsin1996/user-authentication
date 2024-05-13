package com.example.UserAuthentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class HarshPasswordService {

	private BCryptPasswordEncoder passwordEncoder;
	
	
	@Autowired
	public HarshPasswordService(BCryptPasswordEncoder passwordEncoder) {
	this.passwordEncoder = passwordEncoder;
	}
	
	public String harshPassword(String plainPassword){
		return  passwordEncoder.encode(plainPassword);
	}
	
	public boolean verifyPassword(String plainPassword,String harsPasswod) {
		
		return passwordEncoder.matches(plainPassword, harsPasswod);
	}
	

}
