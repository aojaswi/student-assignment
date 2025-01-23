package com.wissen.studentassignment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wissen.studentassignment.model.Student;
import com.wissen.studentassignment.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	StudentService studentService;

	
	/*
	 	1.) GET    /students                  : Should retrieve all the student records
		2.) GET    /student/8                 : Specific student with given rollno
		3.) POST   /student                   : Should be inserting a student object into collection object
		4.) GET    /student/result?pass=true  : All who score above 40%
	 */
	@GetMapping("/all")
	public List<Student> getStudents() {
		return studentService.getStudents();
	}
	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable int id) {
		return studentService.getStudent(id);
	}

	@PostMapping("/student/add")
	public void addStudent(@RequestBody Student student) {
		studentService.add(student);
	}

	@GetMapping("/student")
	public List<Student> getPassingStudents(@RequestParam("pass") String status) {
		return studentService.getPassingStudents(status);	
	}
}
