package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.model.Student;
import com.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService service;

	// Save student to DB
	@PostMapping
	public Student addStudent(@RequestBody Student student) {
		return service.addStudent(student);
	}

	// Fetch all students from DB
	@GetMapping
	public List<Student> getAllStudents() {
		return service.getAllStudents();
	}
}
