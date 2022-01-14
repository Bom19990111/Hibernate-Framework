package edu.thinh.springjpa.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import edu.thinh.springjpa.model.Customer;

@Repository("customerRepository")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

}
