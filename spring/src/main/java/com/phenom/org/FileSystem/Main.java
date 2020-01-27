package com.phenom.org.FileSystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String path ="file:////home/siva_ganesh/Downloads/spring-tool-suite-4-4.5.1.RELEASE-e4.14.0-linux.gtk.x86_64/"
				+ "sts-4.5.1.RELEASE/spring/src/main/resources/";
		ApplicationContext api = new FileSystemXmlApplicationContext(path+"appContextAlbum.xml",
				path+"appContextSong");
		
		System.out.println(api.getBean("album"));
		System.out.println(api.getBean("song"));
	}
}
