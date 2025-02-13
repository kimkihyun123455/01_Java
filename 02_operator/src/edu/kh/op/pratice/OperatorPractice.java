package edu.kh.op.pratice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원수를 입력하시오 : ");
		int input1 = sc.nextInt();
		System.out.println("사탕 개수를 입력하시오 : ");
		int input2 = sc.nextInt();
		System.out.print("1인당 사탕 개수 : ");
		System.out.println(input2/input1);
		System.out.print("남은 사탕 개수 : ");
		System.out.println(input2%input1);
		
		
	}
	public void practice2() {
	
	Scanner sc = new Scanner(System.in);	
		
	System.out.println("이름 : ");	
	String name1 = sc.nextLine();
	
	System.out.println("학년 : ");	
	int int1 = sc.nextInt();
	
	System.out.println("반 : ");	
	int int2 = sc.nextInt();
	
	System.out.println("번호 : ");	
	int int3 = sc.nextInt();
	
	sc.nextLine();
	
	System.out.println("성별 : ");
	String sex1 = sc.nextLine();
	
	System.out.println("성적 : ");
	float flo1 = sc.nextFloat();
	
	System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", int1, int2, int3, name1, sex1, flo1 );
		
		
		
		
		
	}
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하시오 : ");
		int wtf1 = sc.nextInt();
		
		System.out.print("영어 점수를 입력하시오 : ");
		int wtf2 = sc.nextInt();
		
		System.out.print("수학 점수를 입력하시오 : ");
		int wtf3 = sc.nextInt();
		
		System.out.println("합계 : " + (wtf1 + wtf2 + wtf3));
		System.out.println("평균 : " + (double)(wtf1 + wtf2 + wtf3)/3);
		
		//각 과목이 40점 이상이고 평균 60점 이상이어야 합격
		//그 외 불합격 출력
		
		boolean result = (wtf1>=40) && wtf2>=40 && wtf3>=40 &&((wtf1+wtf2+wtf3)/3)>=60;
		System.out.println(result ? "합격" : "불합격");
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
