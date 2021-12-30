package com.thinh.spring.dao;

import java.util.List;

import com.thinh.spring.entity.User;

public interface UserDao {
	List<User> findAll();

	User findUserById(int id);

	boolean checkLogin(User user);

	void register(User user);
}
