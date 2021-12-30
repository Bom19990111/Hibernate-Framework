package com.thinh.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinh.spring.dao.UserDao;
import com.thinh.spring.entity.User;

@Service
public class UserServiceImp implements UserService {
	@Autowired
	public UserDao userDao;

	@Override
	public List<User> findAll() {
		return this.userDao.findAll();
	}

	@Override
	public User findUserById(int id) {
		return this.findUserById(id);
	}

	@Override
	public boolean checkLogin(User user) {
		return this.userDao.checkLogin(user);
	}

	@Override
	public void register(User user) {
		this.userDao.register(user);
	}

}
