package com.jsp.car;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackages = "com.jsp.car")//or com.jsp
public class MyConfig {

}
