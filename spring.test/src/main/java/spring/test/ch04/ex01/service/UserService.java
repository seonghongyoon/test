package spring.test.ch04.ex01.service;

import spring.test.ch04.ex01.domain.User;

public interface UserService {
	User getUser(String userName, int age);
}
