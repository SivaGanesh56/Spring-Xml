package com.phenom.org.bean.collab;

public class Address
{
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", street=" + street + ", town=" + town + "]";
	}
	private int pin;
	private String street;
	private String town;
	
}
