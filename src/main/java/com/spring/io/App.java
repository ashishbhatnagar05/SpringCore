package com.spring.io;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		OffersDAO offersDAO = context.getBean("offersDAO", OffersDAO.class);
		List<Offers> offers = offersDAO.getOffers();
		for (Offers o : offers) {
			System.out.println(o);
		}
		((ClassPathXmlApplicationContext) context).close();
	}
}
