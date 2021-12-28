package com.thinh.spring.dao;

import java.util.List;

import com.thinh.spring.entity.Student;

public interface StudentDao {

	public List<Student> getStudents();

	public void saveStudent(Student theStudent);

	public Student getStudents(int theId);

	public void deleteStudent(int theId);
}
