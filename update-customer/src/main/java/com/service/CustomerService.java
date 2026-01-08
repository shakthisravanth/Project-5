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

	public Customer getCustomerById(int id) {
		Optional<Customer> customer = repository.findById(id);

		if (customer.isPresent()) {
			return customer.get();
		} else {
			return null;
		}
	}
	
	// Method to update customer by id

	// Fetch existing customer using repository

	// Check if customer exists

	// Update customer name and email

	// Save updated customer and return it

	// Return null if customer not found


}