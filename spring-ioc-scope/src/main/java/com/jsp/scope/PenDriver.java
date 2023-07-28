package com.jsp.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PenDriver {

	public static void main(String[] args) {
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("MySpring.xml");
		Pen pen1=(Pen)applicationContext.getBean("myPen");
		pen1.setName("pen1");
		System.out.println(pen1.getName());
        Pen pen2=(Pen)applicationContext.getBean("myPen");
        System.out.println(pen2.getName());
	}

}
