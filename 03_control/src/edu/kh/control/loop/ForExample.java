package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	Scanner sc = new Scanner(System.in);
	public void ex1() {
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
	}
	public void ex2() {
		//영어 알파벳 A부터 Z까지 한줄로 출력
		
		for(int i ='A'; i<='Z'; i++ ) {
			System.out.print((char)i);
		}
		
		System.out.println("\n==========================");
		
		for(char i =65; i<=90; i++ ) {
			System.out.print(i);
		}
		
		
	}
	public void ex3() {
		
		System.out.println("정수를 입력하세요 : ");
		int int1 = sc.nextInt();
		for(int i =1; i<=int1; i++) {
			if(i<int1)
			System.out.print(i+", ");
			else System.out.println(i);
		}
		
		
	}
	public void ex4() {
		//정수 5개를 입력 받아 합계 구하기
		// [실행화면]
		// 입력 1: 10
		// 입력 2: 20
		// 입력 3: 30
		// 입력 4: 40
		// 입력 5: 50
		// 합계 : 150
		int sum = 0; //합계 저장용 변수
		
		for(int i= 1; i<=5; i++ ) {
			
			System.out.print("입력 "+i+" : ");
			int num = sc.nextInt();
			sum += num;
		}	System.out.println("합계 : "+sum);
		
		
	}
	public void ex5() {
		//1부터 20까지 1씩 증가하면서 출력
		//단, 입력 받은 수의 배수는 양쪽에()표시
		
		System.out.print("정수를 입력하세요 :");
		int num = sc.nextInt();
		System.out.print("마지막 수를 입력하세요 :");
		int last = sc.nextInt();
		for(int i=1; i<=last; i++) {
			
			if(i==last) System.out.print(i);
			else if (i%num==0) System.out.print("("+i+"), ");
			else if(i<20) System.out.print(i+", " );
			else;
		}
		
		
		
	}
	public void ex6() {
		//[구구단 출력]
		//2~9사이의 수를 입력 받아 구구단 출력
		//단, 입력 받은 수가 2~9가 아니면
		//"잘못 입력하셨습니다" 출력
		
		System.out.print("단 입력 :");
		int num=sc.nextInt();
		
			if(num>=2 && num<=9) {
				for(int i=1;i<=9;i++) {
					System.out.printf("%dx%d=%d\n", num,i,num*i);
				}
			}else System.out.println("잘못 입력하셨습니다");
			
		}
	public void ex7() {
		//숫자 세기 count
		//1부터 20까지 1씩 증가하면서
		//입력 받은 수의 배수 총 개수
		//입력 받은 수의 배수 합계 출력
		
		//배수 입력 : 3
		// 3 6 9 12 15 18 : 6개
		// 3의 배수 합계 : 63
		
		int count = 0;
		int sum = 0;
		String result ="";
		
		System.out.println("배수 입력 :");
		int num = sc.nextInt();
		
		for(int i=1;i<=20;i++) {
			
			if(i%num==0) {
				result +=i+" ";//result는 문자열 이기 때문에 3 6 9와 같은 형태로 나온다
				sum +=i;
				count++;//num의 배수 개수가 나올때마다 if문이 작동하니 개수 확인
			}else;
			
		}
		System.out.printf("%s : %d개\n", result, count);
		System.out.printf("%d의 배수 합계 : %d", num, sum);
		//조건문 외부에서 선언한 변수는 내부에서도 작동하지만
		//내부에서 선언한 변수는 외부에서 작동하지 않는다
		//하지만 외부에서 선언되어 내부에서 변동된 변수는 외부에서도 변동된다
		
		
		
		
	}
	public void ex8() {
		//구구단 모두 출력하기
		for(int i=2;i<=9;i++) {
			for(int ii=1;ii<=9;ii++  ) {
				int sum=i*ii;
				System.out.printf("%dx%d=%1d ",i,ii,sum);
			}System.out.println();// 2번째 for문이 끝나고 계행을 위한 코드
			
		}
		
		
		
		
	}
	public void ex9() {
		//구구단 모두 역순 출력하기
		for(int i=9;i<=9&&i>=2;i--) {
			for(int ii=1;ii<=9;ii++) {
				int iii=i*ii;
				System.out.printf("%dx%d=%1d ",i,ii,iii);
				
			}System.out.println();
			
			
			
		}
		
		
		
	}
		
	
	
	
	
	
	
	
	
	
	
}

