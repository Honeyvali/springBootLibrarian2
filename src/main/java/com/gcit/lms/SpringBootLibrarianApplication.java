package com.gcit.lms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLibrarianApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibrarianApplication.class, args);
		
		System.out.println("Librarian is running");
	}
}
