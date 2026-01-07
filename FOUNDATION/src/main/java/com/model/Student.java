package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// Marks the class as a JPA entity
public class Student {

	// Marks the field as the primary key
	private int id;

	private String name;
	private int age;

	public Student() {
	}

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// setter and getter methods
	
}
