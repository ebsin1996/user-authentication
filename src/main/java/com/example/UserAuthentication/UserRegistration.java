package com.example.UserAuthentication;

public class UserRegistration {

	int id;
	String username;
	String passsword;
	
	//default constructor
	public UserRegistration() {	
		
	}

	public UserRegistration(String username, String passsword) {
		super();
		this.username = username;
		this.passsword = passsword;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasssword() {
		return passsword;
	}

	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}
	
	
}
