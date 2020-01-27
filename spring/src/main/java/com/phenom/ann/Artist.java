package com.phenom.ann;

public class Artist
{
	public Artist(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Artist [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	private String firstName;
	private String lastName;
	
}
