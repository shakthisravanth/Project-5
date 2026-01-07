package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.model.Student;
import com.repository.StudentRepository;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private StudentRepository repository;

	@Override
	public void run(String... args) throws Exception {

		Student s1 = new Student(1, "Rahul", 22);
		Student s2 = new Student(2, "Anita", 21);

		repository.save(s1);
		repository.save(s2);

		List<Student> students = repository.findAll();

		System.out.println("Students in Database:");

		for (Student s : students) {

			System.out.println(s.getId() + " " + s.getName() + " " + s.getAge());

		}
	}
}
