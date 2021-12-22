package com.customer.spring.service;

import java.util.List;

import com.customer.spring.models.Customer;

public interface CustomerService {
	List<Customer> findAll();

	Customer findById(int id);

	void save(Customer customer);

	void edit(Customer customer);

	void remove(int id);
}
