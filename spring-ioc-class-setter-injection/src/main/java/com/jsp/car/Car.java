package com.jsp.car;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private String brand;
	private String color;
	private String price;
	public String getBrand() {
		return brand;
	}
	
	@Value(value = "TATA")
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	
	@Value(value = "Red")
	public void setColor(String color) {
		this.color = color;
	}
	public String getPrice() {
		return price;
	}
	
	@Value(value = "750000")
	public void setPrice(String price) {
		this.price = price;
	}
	
	public void print() {
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
	}
}
