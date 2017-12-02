package com.spring.io;

public class Person {
	private int id;
	private String name;
	private int textId;

	public int getTextId() {
		return textId;
	}

	//setter name is important.Bean should use the same convention.
	public void setTextId(int textId) {
		this.textId = textId;
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", textId=" + textId + "]";
	}

	public void speak() {
		System.out.println("Hello!, I am a person");
	}

}
