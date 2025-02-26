package edu.kh.poly.ex2.model.service;

public interface TestInterface {

	int plus(int num1, int num2);
	
	public abstract String test();
	
	//Java8 이후에는 interface에 디폴트 메서드가 추가가능해짐
	default void display() {
		System.out.println("TestInterface의 display");
	}
	
	
}
