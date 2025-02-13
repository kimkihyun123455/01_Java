package edu.kh.variable.ex1;

public class VariableExample2 {
	
	public static void main(String[] args) {
		/*
		 * 자바 기본 자료형 8가지
		 * 
		 * 논리형 : boolean (1byte)
		 * 정수형 : byte (1byte), short (2byte), int (4byte), long (8byte)
		 * 실수형 : float (4byte), double (8byte)
		 * 문자형 : char (2byte)
		 * 
		 * 참조형 : 문자열의 String
		 * 
		 * 변수 선언 : 메모리(RAM)에 값을 저장할 공간을 할당하는 것
		 * 변수 값 대입 : 변수에 값을 집어 넣는 것
		 * 
		 * 
		 * */
		
		boolean booleanData; //변수의 선언
		// 메모리에 논리값을 저장할 공간을 1byte 할당하고
		// 할당된 공간의 이름을 booleanData 라고 부르겠다는 의미
		
		booleanData = true;
		
		
		System.out.println("booleanData : " + booleanData);
		
		
		byte byteNumber = 127; // 허용된 범위를 초과하는 순간 오류 발생 byte는 -128~127까지 가능 
		// 메모리에 정수값을 저장할 공간을 1byte 할당하고
		// 할당된 공간을 byteNumber 라고 부르겠다
		// 선언된 byteNumber 변수에 처음으로 초기값 127을 넣는다
		// 이 처럼 처음 변수에 값을 대입하는 것을 "초기화"라고 한다

		short shortNumber = 32767;
		
		int intNumber    =     2147483647;
	// 자료형 변수명 대입연산자 리터럴; 
	// 프로그래밍에서 대입되는 데이터를 리터럴이라고 표현한다
	
		//리터럴 : 변수에 대입되거나 작성되어지는 값 자체
		// 자료형에 따라 리터럴 표기법이 다름
		// 표기를 다르게 할 경우 인식을 제대로 하지 못한다
		
		long longNumber = 10000000000L; 
		//long 타입의 표기법은 뒤에 l을 추가하는 것이다
		
		float floatNumber = 1.2345f;
		// float 타입의 표기법은 뒤에 f를 추가하는 것이다
		
		double doubleNumber = 3.141592;
		// double 이 실수형의 기본형이라 리터럴 표기법 필요 없음
		
		//문자형 char 리터럴 표기법 : ' '
		char ch = 'A';
		char ch2 = 66;
		
		System.out.println("ch : " + ch);
		System.out.println("ch2 : " + ch2);
		// ch2를 숫자66로 대입시 ch2가 B로 출력되는 이유는
		// char는 유니코드를 따르기 때문에 유니코드에 66 = B 라고
		// 저장되어 있기 때문에 다음과 같은 결과가 나온다
		
	
		// 변수 명명 규칙
		
		// 1. 대소문자 구분, 길이제한 X
		int abcdefg123456789;
		int abcdefG123456789;
		// 2. 예약어는 사용 X ex) int int;, float double;
		// 3. 숫자로 시작 X
		// 4. 특수문자는 _, $ 만 사용 가능하다
		// 5. 카멜표기법을 따른다
		// 6. 변수명은 언어를 가리지 않는다
		int 정수1번=44;
		System.out.println(정수1번);
		double 실수2번=3.14;
		
		
		//상수란 변하지 않는 값을 의미하며 final 추가하여 선언할 수 있다
		
		final double PI_VALUE = 3.14;
		
		//PI_VALUE = 2.33; // 위에 fianl을 이용하여 선언한 상수로 인해 재대입이 불가
		/*
		 * 상수란
		 * - 변수의 한 종료
		 * - 한번 고정된 값이 변하지 않음
		 * - 자료형 앞에 final을 추가하는 것으로 작성한다
		 * - 상수 명명 규칙 : 모두 대문자, 여러 단어 사용시 _의 사용
		 * 
		 * 상수의 사용
		 * - 변하면 안되는 고정된 값을 저장할 경우
		 * - 특정한 값에 의미를 부여할 경우
		 * - 
		 * 
		 * 
		 * 
		 * 
		 * */
		final int MIN_AGE = 1;
		final int MAX_AGE = 100;
		final int LEFT_MOVE = -1;
		final int RIGHT_MOVE = 1;
		
		
		System.out.println(실수2번);
		
		
		System.out.println('A'+2);
	
	
	}
}
