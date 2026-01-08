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

	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable int id) {
		return service.getCustomerById(id);
	}

	@PutMapping("/update/{id}")
	public Customer updateCustomer(@PathVariable int id, @RequestBody Customer customer) {

		return service.updateCustomer(id, customer);
	}

	// Handle HTTP DELETE request to remove customer

	// Read customer id from URL path

	// Call service layer to delete customer

	// Return status message

}