package com.customer.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.customer.spring.models.User;
import com.customer.spring.service.UserService;

@Controller
public class UserController {

	@Autowired
	public UserService userService;

	@GetMapping("/")
	public ModelAndView loginViewHome() {
		ModelAndView modelAndView = new ModelAndView("user/login");
		modelAndView.addObject("user", new User());
		return modelAndView;
	}

	@GetMapping("/login")
	public ModelAndView loginView() {
		ModelAndView modelAndView = new ModelAndView("user/login");
		modelAndView.addObject("user", new User());
		return modelAndView;
	}

	@GetMapping("/register")
	public ModelAndView registerView() {
		ModelAndView modelAndView = new ModelAndView("user/register");
		modelAndView.addObject("user", new User());
		return modelAndView;
	}

	@PostMapping("/login")
	public ModelAndView Login(@Valid @ModelAttribute("user") User user, Model model, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView("redirect:/customers");
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("user/login");
			return modelAndView;
		} else if (userService.checkLogin(user) == true) {
			return modelAndView;
		} else {
			modelAndView.setViewName("user/login");
			modelAndView.addObject("message", "Tài khoản hoặc mật khẩu không đúng!");
			return modelAndView;
		}

	}

	@PostMapping("/register")
	public ModelAndView Register(@Valid @ModelAttribute("user") User user, BindingResult bindingResult,
			@RequestParam String repassword) {
		ModelAndView modelAndView = new ModelAndView("redirect:/login");
		modelAndView.addObject("user", new User());
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("user/register");
			return modelAndView;
		} else if (user.getPassword().equals(repassword)) {
			userService.register(user);
			modelAndView.addObject("message", "Đăng kí thành công!");
			return modelAndView;
		} else {
			modelAndView.setViewName("user/register");
			modelAndView.addObject("message", "Mật khẩu nhập lại không khớp!");
			return modelAndView;
		}
	}
}
