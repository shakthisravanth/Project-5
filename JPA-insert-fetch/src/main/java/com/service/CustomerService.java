package com.service;

import java.util.List;

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
}
