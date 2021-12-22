package com.customer.spring.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class Customer {
	private int id;
	@NotEmpty(message = "Vui lòng nhập tên!")
	private String name;
	@Min(value = 16, message = "Tuổi phải từ 16 tuổi trở lên")
	private int age;
	@NotEmpty(message = "Vui lòng nhập địa chỉ!")
	private String address;

	public Customer(int id, String name, int age, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Customer() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}