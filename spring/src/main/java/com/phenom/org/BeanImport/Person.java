package com.phenom.org.BeanImport;

public class Person
{
	private String name;
	private Instrument instrument;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Instrument getInstrument() {
		return instrument;
	}
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", instrument=" + instrument + "]";
	}
	
}
