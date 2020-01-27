package com.phenom.org.byConstrutor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext api = new ClassPathXmlApplicationContext("appcontextbyConstructor.xml");
		System.out.println(api.getBean("person"));
	}

}
