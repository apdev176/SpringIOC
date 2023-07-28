package com.jsp.car;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackages = "com.jsp.car")//all the classes of this package will be bean automatically
public class MyConfig {

}
