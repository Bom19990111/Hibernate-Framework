package com.customer.spring.service;

import java.util.List;

import com.customer.spring.models.User;

public interface UserService {

	List<User> findAll();

	User findUserById(int id);

	boolean checkLogin(User user);

	void register(User user);
}
