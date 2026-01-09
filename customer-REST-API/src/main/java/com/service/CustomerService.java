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
	
	// Injects CustomerRepository dependency using @Autowired

	// CustomerRepository reference variable

	// Method to add a new customer
	// Accepts Customer object as parameter
	// Saves customer to database
	// Return type: Customer

	// Method to fetch all customers
	// Retrieves all customer records from database
	// Return type: List<Customer>

	// Method to fetch customer by id
	// Accepts customer id as parameter
	// Throws CustomerNotFoundException if customer not found
	// Return type: Customer

	// Method to update customer details
	// Accepts customer id and updated Customer object
	// Updates name and email
	// Saves updated customer to database
	// Return type: Customer

	// Method to delete customer by id
	// Accepts customer id as parameter
	// Deletes customer from database
	// Return type: void

}
