package com.thinh.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "fullname")
	private String fullName;

	@Column(name = "age")
	private int age;

	@Column(name = "address")
	private String address;

	@Column(name = "class_name")
	private String className;

	public Student(int id, String fullName, int age, String address, String className) {
		this.id = id;
		this.fullName = fullName;
		this.age = age;
		this.address = address;
		this.className = className;
	}

	public Student() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", age=" + age + ", address=" + address + ", className="
				+ className + "]";
	}

}
