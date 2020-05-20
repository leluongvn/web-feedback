package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SignUpController {
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup(final Model model) {
		model.addAttribute("messenger", "Tam pro 123");
		return "signup";
	}
}
