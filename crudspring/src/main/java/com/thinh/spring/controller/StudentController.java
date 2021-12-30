package com.thinh.spring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.thinh.spring.entity.Student;
import com.thinh.spring.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping(value = "/list", produces = "application/x-ww-form-urlencoded; charset-UTF-8")
	public String listStudents(Model theModel) {
		List<Student> theStudents = studentService.getStudents();
		theModel.addAttribute("students", theStudents);
		return "list-students";
	}

	@GetMapping(value = "/showForm", produces = "application/x-ww-form-urlencoded; charset-UTF-8")
	public String showFormForAdd(Model theModel) {
		Student theStudent = new Student();
		theModel.addAttribute("student", theStudent);
		return "student-form";
	}

	@PostMapping("/saveStudent")
	public String saveStudent(@Valid @ModelAttribute("student") Student theStudent, BindingResult thebindingResult) {
		if (thebindingResult.hasErrors()) {
			return "student-form";
		} else {
			studentService.saveStudent(theStudent);
			return "redirect:/student/list";
		}
	}

	@GetMapping(value = "/updateForm", produces = "application/x-ww-form-urlencoded; charset-UTF-8")
	public String showFormForUpdate(@RequestParam("studentId") int Id, Model theModel) {
		Student theStudent = studentService.getStudent(Id);
		theModel.addAttribute("student", theStudent);
		return "student-form";
	}

	@GetMapping("/delete")
	public String deleteStudent(@RequestParam("studentId") int Id) {
		studentService.deleteStudent(Id);
		return "redirect:/student/list";
	}
}
