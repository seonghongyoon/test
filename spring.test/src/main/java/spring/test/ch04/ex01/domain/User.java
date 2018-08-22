package spring.test.ch04.ex01.domain;

public class User {
	private String userName;
	private int age;
	
	public User(){}
	
	public User(String userName, int age){
		this.userName = userName;
		this.age = age;
	}

	public String getUserName() {
		return userName;
	}

	public int getAge() {
		return age;
	}	
}
