package com.customer.spring.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.customer.spring.models.User;

public class UserRepositoryImpl implements UserRepository {
	private static final Map<Integer, User> users;
	static {
		users = new HashMap<Integer, User>();
		users.put(1, new User("quanly", "@Quanly123", "@Quanly123"));
		users.put(2, new User("nhanvien", "@Nhanvien123", "@Nhanvien123"));
	}

	public List<User> findAll() {
		return new ArrayList<User>(users.values());
	}

	public User findUserById(int id) {
		User user = users.get(id);
		return user;
	}

	public boolean checkLogin(User user) {
		boolean isUser = false;
		for (User u : findAll()) {
			if (u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword())) {
				isUser = true;
				return isUser;
			}
		}
		return isUser;
	}

	public void register(User user) {
		int randomId = (int) (Math.random() * 2);
		users.put(randomId, user);

	}

}
