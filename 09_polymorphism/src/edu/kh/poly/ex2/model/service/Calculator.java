package edu.kh.poly.ex2.model.service;

//계산기 인터페이스
//모든 계산기에 대한 공통적인 필드와 기능명을 제공하는 접점으로의 용도
public interface Calculator {

	//인터페이스 : 추상클래스의 변형체
	//추상클래스는 일반메서드도 사용이 가능하지만 인터페이스에서는 추상메서드만 사용 가능하다
	
	//속성
	//필드는 묵시적으로 public static final(상수)로 고정이기 때문에 조금 생략해도 알아서 이해한다
	public static final double PI = 3.14;
	static final int MAX_NUM = 100000;
	public int MIN_NUM = -100000;
	int ZERO = 0;
	
	
	//기능
	//메서드는 묵시적으로 public abstract
	public abstract int plus(int num1, int num2);
	
	int minus(int num1, int num2);
	
	public int multiple(int num1, int num2);
	
	public abstract int divide(int num1, int num2);
	
	default void display() {
		System.out.println("Calculator의 display");
	}
	
}
