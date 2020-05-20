package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/")
	public String home(HttpSession session, Model model) {
		if(session.getAttribute("user") == null) {
			session.setAttribute("user", "Tam vip pro");
			model.addAttribute("messenger", session);
		} else {
			model.addAttribute("messenger", "Chao tam");
		}
		
		return "home-student";
	}
}