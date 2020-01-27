package com.phenom.org.FileSystem;

public class Song 
{
	private String name;
	private String singer;
	public Song(String name, String singer) {
		super();
		this.name = name;
		this.singer = singer;
	}
	@Override
	public String toString() {
		return "Song [name=" + name + ", singer=" + singer + "]";
	}
	
}
