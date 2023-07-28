package com.jsp.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver {
	public static void main(String[] args) {
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("MySpring.xml");
		Car car1=(Car) applicationContext.getBean("myCar");
		car1.setName("tata");
		System.out.println(car1.getName());
		Car car2=(Car) applicationContext.getBean("myCar");
		System.out.println(car2.getName());
	}
	
     
}
