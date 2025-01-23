package com.wissen.studentassignment.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.wissen.studentassignment.model.Student;

@Service
public class StudentService {
	List<Student> students = new LinkedList();
	
	public List<Student> getStudents() {
		return students;
	}
	
	public Student getStudent(int id) {
		Optional<Student> s=students.stream().filter(student -> student.getRollNo() == id).findFirst();
		if(s.isEmpty())
			return new Student();
		return s.get();
	}
	
	public void add(Student student) {
		if(!students.contains(student))
			students.add(student);
	}
	
	public List<Student> getPassingStudents(String status) {
		if(status.equals("true"))
			return students.stream().filter(student -> student.getPercentage()>40).collect(Collectors.toList());
		return students;
	}
}
