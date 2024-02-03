package com.hibernate.SpringApplication;

public class Employee {

	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [city=" + city + "]";
	}

	public void getMessage(String name) {
		System.out.println("Hello, " + name + ", " + city);
	}

}
