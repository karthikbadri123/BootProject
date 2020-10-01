package com.service.boot;

public class Main {
	
	String name;
	int id;
	
	
	public Main(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
   
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
