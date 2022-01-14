package edu.thinh.springjpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import edu.thinh.springjpa.model.Customer;

public interface CustomerService {

	void deleteAll();

	void deleteAll(List<Customer> entities);

	void deleteAllById(List<Long> ids);

	void delete(Customer entity);

	void deleteById(Long id);

	long count();

	List<Customer> findAllById(List<Long> ids);

	List<Customer> findAll();

	boolean existsById(Long id);

	Optional<Customer> findById(Long id);

	List<Customer> saveAll(List<Customer> entities);

	Page<Customer> findAll(Pageable pageable);

	List<Customer> findAll(Sort sort);

	Customer save(Customer customer);

}
