package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.model.Customer;
import com.service.CustomerService;

// Marks this class as a REST controller
// Maps all requests starting with "/customers" to this controller
public class CustomerController {

	// Injects CustomerService dependency using @Autowired

	// Handle POST request to add a new customer
	// Reads customer data from request body
	// Return type: Customer

	// Handle GET request to fetch all customers
	// Return type: List<Customer>

	// Handle GET request to fetch customer by id
	// Reads customer id from URL path
	// Return type: Customer

	// Handle PUT request to update customer by id
	// Reads customer id from URL path
	// Reads updated customer data from request body
	// Return type: Customer

	// Handle DELETE request to delete customer by id
	// Reads customer id from URL path
	// Return type: String (status message)

}