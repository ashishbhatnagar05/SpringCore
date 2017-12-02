package com.spring.io;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {

	private String id = "Default robot";
	private String speech = "hello";

	public void speak() {
		System.out.println(id + ": " + speech);
	}

	@Autowired
	public void setId(@Value("${id}")String id) {
		this.id = id;
	}

	@Autowired
	public void setSpeech(@Value("${speech}")String speech) {
		this.speech = speech;
	}

	@Override
	public String toString() {
		return "Robot [id=" + id + ", speech=" + speech + "]";
	}
}
