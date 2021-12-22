package com.customer.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.customer.spring.repository.CustomerRepository;
import com.customer.spring.repository.CustomerRepositoryImpl;
import com.customer.spring.repository.UserRepository;
import com.customer.spring.repository.UserRepositoryImpl;
import com.customer.spring.service.CustomerService;
import com.customer.spring.service.CustomerServiceImpl;
import com.customer.spring.service.UserService;
import com.customer.spring.service.UserServiceImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.customer.spring" })
public class AppConfig implements WebMvcConfigurer {

	@Bean
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Bean
	public CustomerService customerService() {
		return new CustomerServiceImpl();
	}

	@Bean
	public CustomerRepository customerRepository() {
		return new CustomerRepositoryImpl();
	}

	@Bean
	public UserService userService() {
		return new UserServiceImpl();
	}

	@Bean
	public UserRepository userRepository() {
		return new UserRepositoryImpl();
	}

}