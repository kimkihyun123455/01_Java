package edu.kh.exception.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
//java.lang은 기본적으로 java 프로그램에 포함되어 있기 때문에 import 해주지 않아도 된다
public class ExceptionService {

	//예외(Exception) : 소수코드의 수정으로 해결 가능한 오류
	
	//예외는 두 종료로 구분이 가능하다
	//1) Unchecked Exception : 선택적으로 예외 처리 ex) Runtime Exception
	//2) Checked Exception : 필수적으로 예외 처리 ex) IOException
	
	private Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		//두 정수를 입력 받아 몫을 출력하지
		System.out.print("첫번째 정수를 입력하세요 : ");//INputMismatchException
		int input1 = sc.nextInt();
		//int형이 아닌 다른 자료형을 대입했을 때
		
		System.out.print("두번째 정수를 입력하세요 : ");//INputMismatchException
		int input2 = sc.nextInt();
		//int형이 아닌 다른 자료형을 대입했을 때
		//input2에 0이 들어왔을 때 0으로 나눌 수 없다 : 산술적 예외 발생
		
		String str=null;
		System.out.println(str.charAt(0));
		
		if(input2!=0) {
			System.out.println("결과 : "+input1/input2);//ArithmeticException
			
		}else {
			System.out.println("Infinity");
		}
		
		try {
			//예외가 발생할 것 같은 코드
			System.out.println("결과 : "+input1/input2);
			
		}catch(ArithmeticException e) {
			//try에서 던져지 ㄴ예외를 catch문의 매개변수 e로 잡았다
			//e를 사용하여 예외 추적 코드 작성할 수도 있음
			System.out.println("Infinity");
			
			e.printStackTrace();//발생한 예외에 대한 메서드에 대한 내용을 출력
			
		}
		
		//발생하는 예외 중 일부 예외는 try~catch 사용 안해도 if else로 방지 가능
		//일부 예외 == 대부분 Unchecked Exception
		
		
		
		
	}
	
	public void ex2() {
		//여러가지 예외에 대한 처리 방법
		
		try {
			
			System.out.print("첫번째 정수를 입력하세요 : ");//InputMismatchException
			int input1 = sc.nextInt();
			
			System.out.print("두번째 정수를 입력하세요 : ");
			int input2 = sc.nextInt();
			
			System.out.println("결과 : "+input1/input2);//ArithmeticException
			
			String str=null;
			System.out.println(str.charAt(0));
			//INputMismatchException, ArithmeticException 둘다 RuntimeException 후손
			//RuntimeException은 Exception의 후손
			
		//}catch(RuntimeException r) { 부모 클래스가 먼저 처리할 경우 자식 클래스는 받을수 없다
		}catch(InputMismatchException e) {
			System.out.println("타입에 맞는 값만 입력하세요");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}catch(Exception e) {
			System.out.println("다른 예외는 이 너굴맨이 처리했다구");
			//Exception 클래스 : 모든 예외의 최상위 부모
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	public void ex3() {
		
		try {
			System.out.print("첫번째 정수를 입력하세요 : ");//InputMismatchException
			int input1 = sc.nextInt();
			
			System.out.print("두번째 정수를 입력하세요 : ");
			int input2 = sc.nextInt();
			
			System.out.println("결과 : "+input1/input2);//ArithmeticException
			
		}catch(ArithmeticException e) {
			System.out.println("산숙적 예외 처리가 됨");
			
			//매개변수 e : 예외 관련된 정보 + 예외 관련 기능
			System.out.println(e.getClass());//어떤 예외 클래스인지 가져와
			// class java.lang.ArithmeticException
			
			System.out.println(e.getMessage());//예외 발생시 내용을 출력
			
			System.out.println(e);//e.toString
			
			e.printStackTrace();
		}catch(InputMismatchException e) {
			System.out.println("숫자만 넣어라..");
		}finally {
			System.out.println("무조건 수행");
			sc.close();//스캐너 통로 닫기. 메모리 누수 방지
			
		}
		
	}
	
	public void ex4() {
		
		try {
			methodA();
			
		}catch(IOException e) {
			System.out.println("methodC에서 발생한거 짬 맞음");
		}
		
		
		
	}

	public void methodA() throws IOException{
		methodB();
	}
	
	public void methodB() throws IOException{
		methodC();
	}
	
	public void methodC() throws IOException{
		//throws : 호출한 메서드에게 예외처리를 위임한다
		
		//throw : 예외 강제 발생
		throw new FileNotFoundException();
	}
		
	public void ex5() throws UserException{
		//사용자 정의 예외 클래스인 UserException 사용하여 강제 예외 발생
		
		throw new UserException("사용자 정의 예외 발생");
		
		
	}
	
	
}
