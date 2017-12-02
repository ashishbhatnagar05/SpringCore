package com.spring.io;

public class Address {
	private String street;
	private String postcode;

	public Address(String street, String postcode) {
		super();
		this.street = street;
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode + "]";
	}

	public void defaultOnCreate() {
		System.out.println("Default On create method ran");
	}

	public void defaultOnDestroy() {
		System.out.println("Default On destroy method ran");
	}
}
