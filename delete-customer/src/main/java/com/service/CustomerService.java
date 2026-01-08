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
	
	public Customer updateCustomer(int id, Customer updatedCustomer) {

	    Optional<Customer> existingCustomer = repository.findById(id);

	    if (existingCustomer.isPresent()) {
	        Customer customer = existingCustomer.get();
	        customer.setName(updatedCustomer.getName());
	        customer.setEmail(updatedCustomer.getEmail());
	        return repository.save(customer);
	    } else {
	        return null;
	    }
	}
	
	// Method to delete customer by id

	// Fetch customer using repository

	// Check if customer exists

	// Delete customer if present

	// Return success message

	// Return not found message if customer does not exist

}