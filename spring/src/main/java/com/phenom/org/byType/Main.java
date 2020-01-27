package com.phenom.org.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext api = new ClassPathXmlApplicationContext("appcontextbyType.xml");
		System.out.println(api.getBean("person"));
	}

}
