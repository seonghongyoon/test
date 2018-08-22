package spring.test.ch04.ex01.service;

import org.springframework.stereotype.Service;

import spring.test.ch04.ex01.domain.User;

@Service
public class UserServiceImpl {
	public User getUser(String userName, int age){
		return new User(userName, age);
	}
}
