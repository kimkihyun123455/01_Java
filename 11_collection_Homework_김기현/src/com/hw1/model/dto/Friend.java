package com.hw1.model.dto;

public class Friend {

	private String name;
	
	public Friend() {}

	public Friend(String name) {
		super();
		this.name = name;
	}
	
	public void pickLeader() {
		System.out.println(name+"가 떡잎방범대 대장이다");
	}
	
}
