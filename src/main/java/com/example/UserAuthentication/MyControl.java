package com.example.UserAuthentication;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyControl {
		
		
		Repos repos;
		HarshPasswordService harsh;
		
		
		@Autowired
		public MyControl(Repos repos, HarshPasswordService harsh) {
			super();
			this.repos = repos;
			this.harsh = harsh;
		}
		@GetMapping("/users")
		public List<Product> showUsers(){
			List<Product> prod=repos.findAll();
			return prod;
		} 
		@GetMapping("/users/{id}")
		public Product getDatabyId(@PathVariable int id) {
			return repos.findById(id).get();
//			Product prod=employeeService.getId(id);
		}
		@PostMapping("/users/register")
		public ResponseEntity<String> addUser(@RequestBody UserRegistration request) {
			String harshedPass=harsh.harshPassword(request.getPasssword());			
			Product product=new Product(request.getUsername(),harshedPass);
			repos.save(product);
			return ResponseEntity.ok("Registration Successful");
				}
		@PostMapping("/users/login")
		public ResponseEntity<String> loginUser(@RequestBody Product request){
			//get password from database
			User user=repos.findByUsername(request.getUsername());
			String harsh1=request.getPassword();
			boolean validatePassword=harsh.verifyPassword(harsh1,user.getPassword());
			if (validatePassword) {
				return ResponseEntity.ok("login succesful");
			}
			else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Incorrect username or password");
			}
			
		};
		
		@DeleteMapping("/users/{id}")
		public ResponseEntity<String> deleteUser(@PathVariable int id) {		
			repos.deleteById(id);
			
			String message= "Login data with id "+ id +" deleted successfully";
			
			String jsonmessage= "{\"status\": \"success\": \"message\":\"" + message +"\"}"; 
			return ResponseEntity.ok(jsonmessage);
		}
		

}
