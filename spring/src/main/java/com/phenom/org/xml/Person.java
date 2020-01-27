package com.phenom.org.xml;

import java.beans.ConstructorProperties;

public class Person 
{
	private int id;
	private String firstName;
	private String lastName;
	@ConstructorProperties({"id","firstname","lastname"})
	public Person(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
}
