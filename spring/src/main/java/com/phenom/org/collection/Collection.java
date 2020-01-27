package com.phenom.org.collection;

import java.util.*;

public class Collection 
{
	private List<players>myPlayers;
	
	private Properties properties;
	
	public List<String> getMyList() {
		return myList;
	}
	public void setMyList(List<String> myList) {
		this.myList = myList;
	}
	public Set<String> getMySet() {
		return mySet;
	}
	public void setMySet(Set<String> mySet) {
		this.mySet = mySet;
	}
	public Map<String, String> getMyMap() {
		return myMap;
	}
	public void setMyMap(Map<String, String> myMap) {
		this.myMap = myMap;
	}
	public List<players> getMyPlayers() {
		return myPlayers;
	}
	public void setMyPlayers(List<players> myPlayers) {
		this.myPlayers = myPlayers;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	private List<String> myList;
	private Set<String> mySet;
	private Map<String, String> myMap;
	
}
