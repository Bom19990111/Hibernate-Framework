package com.thinh.spring.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinh.spring.jpa.entity.Customer;
import com.thinh.spring.jpa.reponsitory.CustomerReponsitory;

@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	private CustomerReponsitory customerReponsitory;

	@Override
	public List<Customer> findAll() {
		return customerReponsitory.findAll();
	}

	@Override
	public Customer findById(int id) {
		return customerReponsitory.findById(id);
	}

	@Override
	public void save(Customer customer) {
		customerReponsitory.save(customer);
	}

	@Override
	public void remove(int id) {
		customerReponsitory.remove(id);

	}

}
