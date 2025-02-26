package edu.kh.poly.ex2.model.service;

public class KKHCalculator implements Calculator, TestInterface{

	//extends : 확장 implements : 구현
	//(부)클래스 - (자)클래스 : extends 사용
	//(부)인터페이스 - (자)인터페이스 : extends 사용
	//(부)인터페이스 - (자)클래스 : implements 사용
	//(부)클래스 - (자)인터페이스 : 상속 불가
	
	@Override
	public int plus(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int minus(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int multiple(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1/num2;
	}

	@Override
	public String test() {
		return null;
	}
	
	//다중 상속 중인 인터페이스들에 같은 default 메서드가 겹치면 오류가 발생한다
	//상속 받아 구현하는 클래스에서 Override를 반드시 해야한다
	@Override
	public void display() {
		Calculator.super.display();
	}
	
	
	
	
}
