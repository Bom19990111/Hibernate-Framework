package edu.phuxuan.k17.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.phuxuan.k17.springdemo.model.Student;

@Controller
public class HomeController {
	@RequestMapping("/hello")
	public String hello(Model model) {
		Student student = new Student();
		student.setFullname("Lê Trương Hoàng Nhân");
		model.addAttribute("nameStudent", student);
		return "hello";
	}

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/home")
	public String index() {
		return "home";
	}
}
