package phenom.org.xml.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArtistMain {

	public static void main(String[] args) 
	{
		ApplicationContext api = new ClassPathXmlApplicationContext("applicationContext-Setter.xml");
		System.out.println(api.getBean("Artist",Artist.class));
	}
}
