package com.spring.io;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		OffersDAO offersDAO = context.getBean("offersDAO", OffersDAO.class);
		try {
			List<Offers> offers = offersDAO.getOffers();
			for (Offers o : offers) {
				System.out.println(o);
			}
			System.out.println(offersDAO.getOffer("Mike"));
		} catch (DataAccessException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		((ClassPathXmlApplicationContext) context).close();
	}
}
