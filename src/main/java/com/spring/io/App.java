package com.spring.io;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context =
				// new FileSystemXmlApplicationContext("/src/main/resources/beans.xml");
				new ClassPathXmlApplicationContext("beans.xml");
		Person person = context.getBean("person", Person.class);
		person.speak();
		System.out.println(person);
		((ClassPathXmlApplicationContext) context).close();// to make sure context got destroyed. ApplicationContext
															// doesn't have close method, so we did casting
	}
}
