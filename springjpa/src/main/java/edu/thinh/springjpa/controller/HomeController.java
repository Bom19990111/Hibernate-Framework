package edu.thinh.springjpa.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.thinh.springjpa.model.Customer;
import edu.thinh.springjpa.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class HomeController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/home")
	public String listcustomer(Model theModel, @RequestParam("s") Optional<String> s,
			@RequestParam("p") Optional<Integer> p) {
		Sort sort;
		Page<Customer> aCustomers;
		Pageable pageable;
		if (s.isPresent()) {
			sort = Sort.by(Direction.ASC, s.orElse("name"));
			pageable = PageRequest.of(p.orElse(0), 3, sort);
			aCustomers = customerService.findAll(pageable);
			theModel.addAttribute("a", aCustomers);
		} else {
			pageable = PageRequest.of(p.orElse(0), 3);
			aCustomers = customerService.findAll(pageable);
			theModel.addAttribute("a", aCustomers);
		}
		return "test";
	}
}
