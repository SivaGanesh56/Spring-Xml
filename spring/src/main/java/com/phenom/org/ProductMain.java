package com.phenom.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		product p1= (product)applicationContext.getBean("product2",product.class);
		System.out.println(p1);
	}
}
