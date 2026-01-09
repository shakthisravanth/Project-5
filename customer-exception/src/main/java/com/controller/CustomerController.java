package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.model.Customer;
import com.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	// Injects CustomerService dependency using @Autowired

	// CustomerService reference variable

	// Handle POST request to add a new customer
	// Reads customer data from request body
	// Return type: Customer

	// Handle GET request to fetch all customers
	// Return type: List<Customer>

	// Handle GET request to fetch customer by id
	// Reads id from URL path
	// Return type: Customer

	// Handle PUT request to update customer by id
	// Reads id from URL path and updated customer data from request body
	// Return type: Customer

	// Handle DELETE request to delete customer by id
	// Reads id from URL path
	// Return type: String (status message)

}
