package com.customer.spring.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.customer.spring.models.Customer;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

	private static final Map<Integer, Customer> customers;

	static {
		customers = new HashMap<Integer, Customer>();
		customers.put(1, new Customer(1, "Trần Nhật Thịnh", 24, "4 Bà Triệu"));
		customers.put(2, new Customer(2, "Nguyễn Nhật Nam", 19, "Nguyễn Huệ"));
		customers.put(3, new Customer(3, "Trần Đình Nam", 30, "13/64 Lâm Hoằng"));
		customers.put(4, new Customer(4, "Trương Đình Tuấn Kiệt", 19, "30 Lê Lợi"));
		customers.put(5, new Customer(5, "Trương Hoàng", 39, "30 Nguyễn Hoàng"));
	}

	public List<Customer> findAll() {
		return new ArrayList<Customer>(customers.values());
	}

	public Customer findById(int id) {
		Customer customer = customers.get(id);
		return customer;
	}

	public void save(Customer customer) {
		customers.put(customer.getId(), customer);
	}

	public void edit(Customer customer) {
		customers.replace(customer.getId(), customer);
	}

	public void remove(int id) {
		customers.remove(id);
	}

}
