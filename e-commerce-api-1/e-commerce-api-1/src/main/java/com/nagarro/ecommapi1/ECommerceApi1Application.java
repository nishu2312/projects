package com.nagarro.ecommapi1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ECommerceApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApi1Application.class, args);
	}

}