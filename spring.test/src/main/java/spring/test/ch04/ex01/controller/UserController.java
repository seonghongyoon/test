package spring.test.ch04.ex01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.test.ch04.ex01.domain.User;
import spring.test.ch04.ex01.service.UserService;

@Controller
public class UserController {
	@Autowired private UserService userService;
	
	@RequestMapping("/ch04/ex01/user")
	public User user(String userName, int age){
		return userService.getUser(userName, age);
	}
}
