package edu.kh.control.practice;

import java.util.Scanner;

public class WhileExample {

	Scanner sc= new Scanner(System.in);
	
	
	public void ex1() {
		/*while문
		 * 
		 * 별도의 초기식 증감식이 존재하지 않고
		 * 반복 종료 조건을 자유롭게 설정하는 반복문
		 */
		int input =9;
		
		while(input !=0) {//intput이 0이 아니면 무한반복
			
			System.out.println("-----메뉴선택-----");
			System.out.println("1. 떡볶이");
			System.out.println("2. 쫄면");
			System.out.println("3. 김밥");
			System.out.println("0. 종료");
			
			System.out.print("메뉴 선택 >>");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println("떡볶이를 주문했다.");break;
			case 2 : System.out.println("쫄면을 주문했다.");break;
			case 3 : System.out.println("김밥을 주문했다.");break;
			case 0 : System.out.println("프로그램을 종료합니다.");break;
			default : System.out.println("번호를 잘못 입력하셨습니다.");
			}
			
			
		}
	}
	public void ex2() {
		
		//입력되는 모든 정수의 합 구하기
		//단, 0이 입력되면 반복 종류 후 결과 출력
		
		int input=0;
		int sum =0;
		
		//do while 문을 쓰는 이유는 input에 0을 대입했기 때문에 while(input!=0)
		//이라는 조건식을 바로 충족하여 내부 코드가 실행하기 때문에 이를 피하기 위한 것이다
		do{
			System.out.print("정수를 입력하세요 :");
			input=sc.nextInt();
			
			sum+=input;
			
			
		}while(input!=0);
		System.out.println(sum);
		
		
		
	}
	
	
	
	
	
	
	
}
