package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Customer;
import com.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repository;

	public Customer addCustomer(Customer customer) {
		return repository.save(customer);
	}

	public List<Customer> getAllCustomers() {
		return repository.findAll();
	}
	
	// Method to get customer by id

	// Fetch customer using repository

	// Check if customer exists

	// Return customer if present

	// Return null if customer not found

}