package com.jsp.scope;

public class Pen {
private String name;

public Pen() {
	System.out.println("pen object is created..");
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
}
