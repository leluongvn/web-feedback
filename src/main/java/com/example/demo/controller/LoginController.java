package com.example.demo.controller;

import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(){
		return "register";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginUser(@Param("username") String username, @Param("password") String pass){
		System.out.println(username + " : " + pass);
		return "home-student";
	}
}
