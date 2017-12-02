package com.spring.io;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Person {
	private int id;
	private String name;
	@Autowired
	private Address address;

	@Autowired
	public void setId(@Value("222") int id) {
		this.id = id;
	}
	@Autowired
	public void setName(@Value("Ashish") String name) {
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

}
