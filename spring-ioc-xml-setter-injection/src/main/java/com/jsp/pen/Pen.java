package com.jsp.pen;

public class Pen {
	private String name;
	private String color;
	private String price;

	public Pen() {
		// TODO Auto-generated constructor stub
		System.out.println("Pen Object created..");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void print() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
	}
}
