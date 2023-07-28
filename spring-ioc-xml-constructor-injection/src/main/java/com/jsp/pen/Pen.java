package com.jsp.pen;

public class Pen {
	private String name;
	private String color;
	private double price;

	//constructor
	public Pen(String name,String color,double price) {
		this.name=name;
		this.color=color;
		this.price=price;
	}

	
	public void print() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
	}
}
