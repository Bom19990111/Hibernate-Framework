package com.thinh.spring.jpa.service;

import java.util.List;

import com.thinh.spring.jpa.entity.Customer;

public interface CustomerService {
	List<Customer> findAll();

	Customer findById(int id);

	void save(Customer customer);

	void remove(int id);
}
