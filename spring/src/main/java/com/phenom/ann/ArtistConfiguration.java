package com.phenom.ann;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArtistConfiguration 
{
	@Bean(name="artistname")
	public Artist artist()                 // Method
	{
		return new Artist("Siva", "Ganesh");
	}
}
