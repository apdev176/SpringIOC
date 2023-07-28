package com.jsp.student;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    int id;
	String name;
	String email;
	
	
	
	public Student(@Value(value = "100")int id, @Value(value = "XYZ")String name, @Value(value = "xyz@mail.com") String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}



	public void print() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
	}
}
