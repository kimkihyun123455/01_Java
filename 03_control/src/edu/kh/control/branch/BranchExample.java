package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {

	Scanner sc= new Scanner(System.in);
	
	public void ex1() {
		//1부터 10까지 1씩 증가하며 출력하는 반복문
		//5를 출력하면 반복문 종료
		
		
		for(int i=1;i<=10;i++) {
			
			System.out.print(i+" ");
			if(i==5) {
				break;
			}
		}
		
		
	}
	public void ex2() {
		//입력 받은 모든 문자열을 누적
		//단, "exit@"입력시 문자열 누적을 종료하고 결과 출력
		
		String str="";
		
		while(true) {//while(true)는 무한반복을 뜻한다
			System.out.print("문자를 입력 하세요 : ");
			String input=sc.nextLine();
			//next(); : 공백 포함 안 되는 다음 한 단어
			//nextLine(); : 공백 포함 되는 다음 한 줄
			
			//자바에서 String(문자열)비교에서 == 사용이 불가능하다
			//비교 연산자는 기본 자료형끼리 사용이 가능하며 String은 참조형이다.
			
			//문자열1.equals(문자열2)
			//문자열1과 문자열2가 같으면 true 다르면 false를 반환하는 메서드
			if(input.equals("exit@")){
				break;
			}
			str+=input+" ";//위에 있으면 exit@도 입력해 버린다
			
		}System.out.println(str);
		
		
	}
	public void ex3() {
		//continue
		
		//1~10까지 1씩 증가하며 출력
		//단, 3의 배수 제외
		
		//1 2 4 5 7 8 10
		
		for(int i=1;i<=10;i++) {
			
			if(i%3==0) {
				continue;
			}
			System.out.print(i+" ");
			//구문의 위치에 따른 코드의 변화를 잘 생각해보자
			//이번 print구문이 위에 있을 경우 3의 배수도 같이 출력한다
		}
	}
	
	
	
}
