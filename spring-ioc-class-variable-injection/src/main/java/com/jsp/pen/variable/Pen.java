package com.jsp.pen.variable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Pen {
	@Value(value = "rahul")
	 String name;
	@Value(value = "blue")
	 String color;
	@Value(value = "10")
	 double price;


	
	public void print() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
	}
}
