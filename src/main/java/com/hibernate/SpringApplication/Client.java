package com.hibernate.SpringApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Client {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
//		Student student = (Student) context.getBean("s");
//		System.out.println("Student data - " + student);

		/*
		 * Employee employee = (Employee) context.getBean("s");
		 * System.out.println("Employee data - " + employee);
		 * employee.getMessage("Ganesh Jirage");
		 */

		/*
		 * Test test = (Test) context.getBean("s"); System.out.println("Test data - " +
		 * test);
		 */
		Employer employer = (Employer) context.getBean("e");
		employer.getAllEmployer();

	}
}
