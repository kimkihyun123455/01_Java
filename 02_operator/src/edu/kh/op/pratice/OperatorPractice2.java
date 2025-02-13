package edu.kh.op.pratice;

import java.util.Scanner;

public class OperatorPractice2 {

	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 나이는 ? :");
		int int1 = sc.nextInt();
		
		String str1 = int1 >= 20 ? "저는 성인입니다" : "저는 미성년입니다";
		System.out.println(str1);
		//boolean isTeenager = (age>=13) && (age<=19);
		//System.out.println("청소년입니까? " + isTeenager );
		//위와 같은 방식으로 변수를 지정해서 하는게 훗날 코드 짤 때 편하다
		System.out.println("청소년입니까? " + (int1 <=19 && int1 >=13) );
		System.out.println("노인이거나 어린이 입니까? " + (int1 <=12 || int1 >=65) );
		
		
		
				
				
				
	}


}
