package com.thinh.spring.jpa.reponsitory;

import java.util.List;

import com.thinh.spring.jpa.entity.Customer;

public interface CustomerReponsitory {
	List<Customer> findAll();

	Customer findById(int id);

	void save(Customer customer);

	void remove(int id);
}
