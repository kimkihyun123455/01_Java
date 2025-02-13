package edu.kh.op.pratice;

import java.util.Scanner;

public class OperatorPractice3 {
	
	public void practice1() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("가격을 입력 하세요 : ");
	int int1 = sc.nextInt();
	System.out.println("멤버십 있으세요?");
	boolean str1 = sc.nextBoolean();
	
	double str2 = str1 ? int1*0.9 : int1*0.95;
	
	System.out.println("할인을 포함한 최종금액 : " + str2);
	
	
	}
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출급할 급액 입력 : ");
		int int1 = sc.nextInt();
		/*
		 * int fiftyTh = int1 / 50000;
		 * int1 = int1 % 50000; 이는 int1을 50000원으로 나누고 남은 나머지를
		 * int1에 재대입하여 코드를 간략화 하기 위한 것이다
		 * int1 %= 50000; 이 코드는 위의 int1 = int1 & 50000; 과 동일하다
		 * 
		 * int tenTh = int1 / 10000;
		 * int1 %= 10000;
		 * 
		 * int fiveTh = int1 / 5000;
		 * int1 %= 5000;
		 * 
		 * int oneTh = int1 / 1000;
		 * 
		 * System.out.println("50000원 : " + fiftyTh);
		 * System.out.println("10000원 : " + tenTh);
		 * System.out.println("5000원 : " + fiveTh);
		 * System.out.println("1000원 : " + oneTh);
		 * 
		 * 
		 * */
		System.out.println("50000원 : " + int1/50000 );
		System.out.println("10000원 : " + int1%50000/10000 );
		System.out.println("5000원 : " + int1%10000/5000 );
		System.out.println("1000원 : " + int1%5000/1000 );
		
	}
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수 : ");
		int int1 = sc.nextInt();
		System.out.println("두번째 수 : ");
		int int2 = sc.nextInt();
		
		String int3 = int1%int2 == 0 ? "배수입니다" : "배수가 아닙니다";
		
		System.out.println(int3);
		
	}
	
}
