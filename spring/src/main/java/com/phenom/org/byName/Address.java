package com.phenom.org.byName;

public class Address
{
	private String area;
	private int pin;
	public Address(String area, int pin) {
		super();
		this.area = area;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [area=" + area + ", pin=" + pin + "]";
	}
	
}
