package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exception.CustomerNotFoundException;
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
	// Accepts customer id as parameter
	// Return type: Customer
	// Throws CustomerNotFoundException if customer not found

	// Method to update customer by id
	// Accepts customer id and updated Customer object
	// Return type: Customer
	// Throws CustomerNotFoundException if customer not found

	// Method to delete customer by id
	// Accepts customer id as parameter
	// Return type: String (status message)
	// Throws CustomerNotFoundException if customer not found

}
