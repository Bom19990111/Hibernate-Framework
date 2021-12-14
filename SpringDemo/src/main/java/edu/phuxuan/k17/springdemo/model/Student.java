package edu.phuxuan.k17.springdemo.model;

public class Student {
	public String fullname;

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Student() {
		super();
	}

	public Student(String fullname) {
		super();
		this.fullname = fullname;
	}

}
