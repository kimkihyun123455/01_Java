package edu.kh.generics;

public class Run {

	public static void main(String[] args) {
			
		//String 타입으로 Box 객체 생성
		Box<String> stringBox = new Box<>();
		//T가 String으로 대체됨
		//필드, getter setter 다 String 타입으로 대체
		stringBox.setItem("안녕 제네릭");
		System.out.println(stringBox.getItem());
		
		Box<Integer> intBox =new Box<>();
		//java7 이상에서는 우변 타입 생략 가능
		//다이아몬드 연산자 : 컴파일러가 좌변을 보고 우변 타입 추론
		
		intBox.setItem(123);
		System.out.println(intBox.getItem());
		
		//제네릭 안에는 객체(레퍼런스형)만 허용되며 기본자료형(primitive)은 거부한다
		//대신 Wrapper 클래스를 사용하는 것은 가능하다

		/*
		 * Wrapper 클래스란?
		 * 
		 * 기본 자료형을 다른 자료형인 것 처럼 한번 감싸는 것
		 * 
		 * byte     Byte
		 * short    Short
		 * int      Integer
		 * long     Long
		 * float    Float
		 * double   Double
		 * char     Character
		 * boolean  Boolean
		 * 
		 */
		
		int num=10;
		Integer num1 = num; //오토박싱 : 기본자료형에서 Wrapper 클래스로 자동변환
		
		int num2 = num1; //오토언박싱 : Wrapper 클래스에서 기본자료형으로 자동변환
		
		int number = Integer.parseInt("100"); //Interger클래스의 문자열 안의 수를 int형으로 변환 시켜주는 메서드
		
		
	}

}
