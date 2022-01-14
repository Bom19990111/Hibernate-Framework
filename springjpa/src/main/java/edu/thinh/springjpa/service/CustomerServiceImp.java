package edu.thinh.springjpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import edu.thinh.springjpa.model.Customer;
import edu.thinh.springjpa.repository.CustomerRepository;

@Service
@Component
public class CustomerServiceImp implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> findAll(Sort sort) {
		return (List<Customer>) customerRepository.findAll(sort);
	}

	@Override
	public Page<Customer> findAll(Pageable pageable) {
		return customerRepository.findAll(pageable);
	}

	@Override
	public List<Customer> saveAll(List<Customer> entities) {
		return (List<Customer>) customerRepository.saveAll(entities);
	}

	@Override
	public Optional<Customer> findById(Long id) {
		return customerRepository.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		return customerRepository.existsById(id);
	}

	@Override
	public List<Customer> findAll() {
		return (List<Customer>) customerRepository.findAll();
	}

	@Override
	public List<Customer> findAllById(List<Long> ids) {
		return (List<Customer>) customerRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return customerRepository.count();
	}

	@Override
	public void deleteById(Long id) {
		customerRepository.deleteById(id);
	}

	@Override
	public void delete(Customer entity) {
		customerRepository.delete(entity);
	}

	@Override
	public void deleteAllById(List<Long> ids) {
		customerRepository.deleteAllById(ids);
	}

	@Override
	public void deleteAll(List<Customer> entities) {
		customerRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		customerRepository.deleteAll();
	}

}
