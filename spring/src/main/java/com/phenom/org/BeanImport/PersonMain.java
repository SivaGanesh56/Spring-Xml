package com.phenom.org.BeanImport;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) 
	{
		//ApplicationContext api = new ClassPathXmlApplicationContext("appContext-Person.xml");    // import Bean
		ApplicationContext api = new ClassPathXmlApplicationContext("appContext-Person.xml");
		System.out.println(api.getBean("Person",Person.class));
	}

}
