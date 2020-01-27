package com.phenom.org.BeanImport;

public class Instrument
{
	private String tag;
	private String item;
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "Instrument [tag=" + tag + ", item=" + item + "]";
	}
}
