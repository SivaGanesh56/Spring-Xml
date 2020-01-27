package com.phenom.org.merge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args) 
	{
		ApplicationContext api = new ClassPathXmlApplicationContext("appcontext-Merge.xml");
		System.out.println(api.getBean(EmailDeatils.class).getProperties());
	}
}
