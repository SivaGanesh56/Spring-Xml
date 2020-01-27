package com.phenom.org;

import java.beans.ConstructorProperties;

import javax.management.ConstructorParameters;

public class product 
{
	private String Id;
	@Override
	public String toString() {
		return "product [Id=" + Id + ", name=" + name + ", desc=" + desc + "]";
	}
	@ConstructorProperties({"id","name","descrpt"})
	public product(String id, String name, String desc) {
		super();
		Id = id;
		this.name = name;
		this.desc = desc;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	private String name;
	private String desc;
	
}
