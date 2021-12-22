package com.customer.spring.repository;

import java.util.List;

import com.customer.spring.models.Customer;

public interface CustomerRepository {
	List<Customer> findAll();

	Customer findById(int id);

	void save(Customer customer);

	void edit(Customer customer);

	void remove(int id);

}
