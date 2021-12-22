package com.customer.spring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.customer.spring.models.Customer;
import com.customer.spring.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	public CustomerService customerService;

	@GetMapping(value = "/customers", produces = "application/x-ww-form-urlencoded; charset-UTF-8")
	public ModelAndView list() {
		List<Customer> customers = this.customerService.findAll();
		ModelAndView modelAndView = new ModelAndView("customer/list");
		modelAndView.addObject("customers", customers);
		return modelAndView;
	}

	@GetMapping("/view")
	public ModelAndView view(@RequestParam("id") Integer customerId) {
		Customer customer = this.customerService.findById(customerId);
		ModelAndView modelAndView = new ModelAndView("customer/view");
		modelAndView.addObject("customer", customer);
		return modelAndView;
	}

	@GetMapping("/new")
	public ModelAndView showCreateForm() {
		ModelAndView modelAndView = new ModelAndView("customer/create");
		modelAndView.addObject("customer", new Customer());
		return modelAndView;
	}

	@PostMapping(value = "/new", produces = "application/x-ww-form-urlencoded; charset-UTF-8")
	public ModelAndView createcustomer(@Valid @ModelAttribute("customer") Customer customer,
			BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView("customer/create");
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("customer/create");
			return modelAndView;
		} else {
			int randomId = (int) (Math.random() * 10000);
			customer.setId(randomId);
			this.customerService.save(customer);
			modelAndView.addObject("customer", new Customer());
			modelAndView.addObject("message", "Khách hàng đã được thêm!");
			return modelAndView;
		}

	}

	@GetMapping("/edit")
	public ModelAndView edit(@Valid @RequestParam("id") Integer customerId) {
		Customer customer = this.customerService.findById(customerId);
		ModelAndView modelAndView = new ModelAndView("customer/edit");
		modelAndView.addObject("customer", customer);
		return modelAndView;
	}

	@PostMapping("/edit")
	public ModelAndView edit(@Valid @RequestParam("id") Integer customerId,
			@ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView("customer/edit");
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("customer/edit");
			return modelAndView;
		} else if (!bindingResult.hasErrors()) {
			Customer ctm = this.customerService.findById(customerId);
			ctm.setId(customerId);
			ctm.setName(customer.getName());
			ctm.setAge(customer.getAge());
			ctm.setAddress(customer.getAddress());
			this.customerService.edit(ctm);
			modelAndView.addObject("message", "Khách hàng đã được cập nhật!");
			return modelAndView;
		}
		return modelAndView;
	}

	@GetMapping("/remove")
	public ModelAndView remove(@Valid @RequestParam("id") Integer customerId) {
		Customer customer = this.customerService.findById(customerId);
		ModelAndView modelAndView = new ModelAndView("customer/remove");
		modelAndView.addObject("customer", customer);
		return modelAndView;
	}

	@PostMapping("/remove")
	public ModelAndView remove(@Valid @RequestParam("id") Integer customerId,
			@ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView("customer/remove");
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("customer/remove");
			return modelAndView;
		} else if (!bindingResult.hasErrors()) {
			this.customerService.remove(customerId);
			modelAndView.addObject("message", "Khách hàng đã được xóa!");
			return modelAndView;
		}
		return modelAndView;
	}
}