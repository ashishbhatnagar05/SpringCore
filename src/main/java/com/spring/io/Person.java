package com.spring.io;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	private int id;
	private String name;
	@Autowired
	private Address address;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public void speak() {
		System.out.println("Hello!, I am a person");
	}

	public int getNumber() {
		Random random = new Random();
		return random.nextInt(100);
	}
}
