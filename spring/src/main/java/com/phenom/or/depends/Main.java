package com.phenom.or.depends;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext api = new ClassPathXmlApplicationContext("appContextDepends-on.xml");
		api.getBean("initDepends",initDepends.class).print();
	}
}
