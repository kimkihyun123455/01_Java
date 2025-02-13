package edu.kh.variable.ex1;

public class VariableExample3 {

	public static void main(String[] args) {

		//형변환(Casting) : 값의 자료형을 변환하는 것 (boolean 제외)
		/*
		 * 형변환은 왜 필요한가?
		 *  - 컴퓨터는 같은 자료형 끼리만 연산이 가능하다
		 *  - 다른 자료형을 연산시키기 위해 형변환을 사용
		 *  - 자동/강제 형변환 존재
		 *
		 * 
		 * */
		int num1 = 10;
		double num2  = 3.5;
		
		System.out.println("자동 형변환 결과 : "+(num1 + num2));
		
		int i2 = 2100000000;
		long l2 = 10000000000l;
		
		long result = i2 + l2;
		
		System.out.println(result);
		
		// char -> int 형변환
		// char 자료형은 문자형이지만 실제 저장되는 값은
		// 유니코드에 의거한 0부터 6만5천번 사이에 있는 정수형 숫자이다
		
		char ch3 = 'V';
		int i3 = ch3;
		
		System.out.println(i3);
		
		char ch4 = '각';
		int i4 = ch4;
		
		System.out.println(i4);
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
