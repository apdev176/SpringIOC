package com.jsp.pen;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class PenDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using BeanFactory
		ClassPathResource classPathResource = new ClassPathResource("MySpring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		Pen pen = (Pen) beanFactory.getBean("myPen");
		pen.write();

		// using ApplicationContext
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("MySpring.xml");
		Pen pen2 = (Pen) applicationContext.getBean("myPen");
		pen2.write();

	}

}
