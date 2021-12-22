package com.customer.spring.repository;

import java.util.List;

import com.customer.spring.models.User;

public interface UserRepository {

	List<User> findAll();

	User findUserById(int id);

	boolean checkLogin(User user);

	void register(User user);
}
