package com.hibernate.SpringApplication;

public class Employer {

	private String firstName;
	private Address address;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employer [firstName=" + firstName + ", address=" + address + "]";
	}

	public void getAllEmployer() {
		System.out.println("First Name - " + firstName);
		System.out.println("Address - " + address.getAddressLine());
	}

}
