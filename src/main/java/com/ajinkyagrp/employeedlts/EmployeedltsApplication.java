package com.ajinkyagrp.employeedlts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeedltsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeedltsApplication.class, args);
	}

	@Bean
	public EmployeeService employeeService() {
		// Create an instance of your EmployeeService implementation
		return new EmployeeServiceImpl();
	}

}
