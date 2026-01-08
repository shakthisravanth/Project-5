package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.model.Customer;
import com.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService service;

	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}

	@GetMapping("/all")
	public List<Customer> getAllCustomers() {
		return service.getAllCustomers();
	}

	// Handle GET request to fetch customer by id

	// Read customer id from URL path

	// Call service layer to get customer by id

	// Return type: Customer

}