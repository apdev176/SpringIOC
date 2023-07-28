package com.jsp.scope;

public class Car {

	private String name;
	
	public Car() {
		System.out.println("car object created...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
