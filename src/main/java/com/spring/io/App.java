package com.spring.io;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person person = context.getBean("person", Person.class);
		person.speak();
		System.out.println(person);
		((ClassPathXmlApplicationContext) context).close();
	}
}
