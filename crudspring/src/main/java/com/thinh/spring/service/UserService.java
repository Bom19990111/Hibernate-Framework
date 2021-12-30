package com.thinh.spring.service;

import java.util.List;

import com.thinh.spring.entity.User;

public interface UserService {
	List<User> findAll();

	User findUserById(int id);

	boolean checkLogin(User user);

	void register(User user);
}
