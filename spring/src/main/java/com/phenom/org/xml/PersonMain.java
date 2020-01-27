package com.phenom.org.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) 
	{
		ApplicationContext api = new ClassPathXmlApplicationContext("applicationContext-Constructor.xml");
		System.out.println(api.getBean("Person",Person.class));
	}

}
