package com.thinh.spring.service;

import java.util.List;

import com.thinh.spring.entity.Student;

public interface StudentService {
	public List<Student> getStudents();

	public void saveStudent(Student theStudent);

	public Student getStudent(int theId);

	public void deleteStudent(int theId);
}
