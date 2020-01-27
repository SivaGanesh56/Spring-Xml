package com.phenom.org.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext api = new ClassPathXmlApplicationContext("applicationContex-Collection.xml");
		System.out.println(api.getBean("collection",Collection.class).getMyList());
		System.out.println(api.getBean("collection",Collection.class).getMyPlayers());
		System.out.println(api.getBean("collection",Collection.class).getProperties());
	}

}
