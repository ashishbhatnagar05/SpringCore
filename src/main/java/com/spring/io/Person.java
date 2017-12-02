package com.spring.io;

public class Person {
	private int id;
	private String name;
	private int textId;
	private Address address;

	// setter name is important.Bean should use the same convention.
	public void setTextId(int textId) {
		this.textId = textId;
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", textId=" + textId + ", address=" + address + "]";
	}

	public void speak() {
		System.out.println("Hello!, I am a person");
	}

}
