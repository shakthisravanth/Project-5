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

	public Customer getCustomerById(int id) {
		Optional<Customer> customer = repository.findById(id);

		if (customer.isPresent()) {
			return customer.get();
		} else {
			throw new CustomerNotFoundException("Customer not found with id: " + id);
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
			throw new CustomerNotFoundException("Customer not found with id: " + id);
		}
	}

	public String deleteCustomer(int id) {

		Optional<Customer> customer = repository.findById(id);

		if (customer.isPresent()) {
			repository.deleteById(id);
			return "Customer deleted successfully";
		} else {
			throw new CustomerNotFoundException("Customer not found with id: " + id);
		}
	}
}
