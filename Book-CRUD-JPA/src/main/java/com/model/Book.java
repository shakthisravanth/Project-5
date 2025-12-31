package com.model;

import jakarta.persistence.*;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private double price;
	private boolean available;

	public Book() {
	}

	public Book(String name, double price, boolean available) {
		this.name = name;
		this.price = price;
		this.available = available;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}
