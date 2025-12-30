package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Student;
import com.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	// Save student to DB
	public Student addStudent(Student student) {
		return repository.save(student);
	}

	// Fetch all students from DB
	public List<Student> getAllStudents() {
		return repository.findAll();
	}
}
