package com.hibernate.SpringApplication;

public class Test {

	private String name;
	private String age;
	private String city;

	public Test(String name, String age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Test [name=" + name + ", age=" + age + ", city=" + city + "]";
	}

}
