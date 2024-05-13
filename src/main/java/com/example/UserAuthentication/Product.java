package com.example.UserAuthentication;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="employeerecords")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String username;
	String password;
	public Product(String username,String password) {
		super();
		
		this.username = username;
		this.password=password;
	}
	
	public Product() {
		super();
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
