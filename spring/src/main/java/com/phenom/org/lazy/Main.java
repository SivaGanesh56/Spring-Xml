package com.phenom.org.lazy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext api = new ClassPathXmlApplicationContext("appContextLazy.xml");
		api.getBean("lazy",Lazy.class).print();
		System.out.println("Wait something happens <- <- <-");

	}

}
