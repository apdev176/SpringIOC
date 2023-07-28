package com.jsp.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.jsp.configuration.MyConfig;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
		Student student=(Student)applicationContext.getBean("student");
		student.print();
	}

}
