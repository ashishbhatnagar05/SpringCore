package com.spring.io;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Robot robot = context.getBean("robot", Robot.class);
		System.out.println(robot);
		((ClassPathXmlApplicationContext) context).close();
	}
}
