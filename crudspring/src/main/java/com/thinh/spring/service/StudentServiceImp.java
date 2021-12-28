package com.thinh.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinh.spring.dao.StudentDao;
import com.thinh.spring.entity.Student;

@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	private StudentDao studentDao;

	@Override
	@Transactional
	public List<Student> getStudents() {
		return studentDao.getStudents();
	}

	@Override
	@Transactional
	public void saveStudent(Student theStudent) {
		studentDao.saveStudent(theStudent);

	}

	@Override
	@Transactional
	public Student getStudent(int theId) {
		return studentDao.getStudents(theId);
	}

	@Override
	@Transactional
	public void deleteStudent(int theId) {
		studentDao.deleteStudent(theId);

	}

}
