package com.wissen.studentassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentAssignmentApplication.class, args);
		System.out.println("Runnin spring boot app from Jenkins");
	}

}
