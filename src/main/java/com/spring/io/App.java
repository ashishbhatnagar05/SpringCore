package com.spring.io;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		OffersDAO offersDAO = context.getBean("offersDAO", OffersDAO.class);
		// Offer o1 = new Offer(8, "ashish", "@", "yoyoyo");
		// Offer o2 = new Offer(9, "ashish", "@", "yoyoyo");
		// List<Offer> offerslist = new ArrayList<Offer>();
		// offerslist.add(o1);
		// offerslist.add(o2);
		try {
			// offersDAO.create(offerslist);
			// offersDAO.delete(3);
			List<Offer> offers = offersDAO.getOffers();
			for (Offer o : offers) {
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
