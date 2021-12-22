package com.customer.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.spring.models.Customer;
import com.customer.spring.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> findAll() {
		return this.customerRepository.findAll();
	}

	public Customer findById(int id) {
		return this.customerRepository.findById(id);
	}

	public void save(Customer customer) {
		this.customerRepository.save(customer);
	}

	public void edit(Customer customer) {
		this.customerRepository.edit(customer);
	}

	public void remove(int id) {
		this.customerRepository.remove(id);
	}
}
