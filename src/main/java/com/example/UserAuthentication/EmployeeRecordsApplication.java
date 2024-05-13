package com.example.UserAuthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import configurations.AppConfig; 

@SpringBootApplication
@Import(AppConfig.class)
public class EmployeeRecordsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRecordsApplication.class, args);
	}

}
