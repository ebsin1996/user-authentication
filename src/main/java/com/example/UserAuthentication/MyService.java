package com.example.UserAuthentication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	@Autowired
	Repos repos;
	
	public Product showData(){
		List<Product> list= repos.findAll();
		return (Product) list;
	}
	
	//Add data
	public Product addData(Product product) {		 
		return  repos.save(product); 
	}
	
	//Get one data by ID
	public Product getDataById(long id) {		
		return repos.findById((int)id).get();
	}

	public void  deleteId(long id) {
		repos.deleteById((int) id);
	}
}
