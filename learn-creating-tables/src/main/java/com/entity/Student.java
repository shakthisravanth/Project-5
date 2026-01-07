package com.entity;

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

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
