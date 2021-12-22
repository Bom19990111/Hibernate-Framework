package com.customer.spring.models;

import javax.validation.constraints.NotEmpty;

public class User {
//	@Size(min = 5, max = 10, message = "Tên đăng nhập phải từ 5 - 10 ký tự")
	@NotEmpty(message = "Tên tài khoản không được bỏ trống")
	private String username;

	@NotEmpty(message = "Mật khẩu không được bỏ trống")
	private String password;

	public User() {
	}

	public User(String username, String password, String repassword) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
