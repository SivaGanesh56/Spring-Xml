package com.phenom.org.bean.collab;

public class Person 
{
	public Person(int id, String name, Address address) {
		super();
		this.id = id;                 
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	private int id;
	private String name;
	private Address address;
	
	
	
	/// you can also done by this using setter methods but with small change in .xml file
}
