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
	public void ex4() {
		//1~100까지 1씩 증가하여 출력
		//단 5의 배수 제외
		//제외하는 값이 40이 되었을 때 반복 멈춤
		
		for(int i=1;i<=100;i++) {
			if(i==40) {
				break;
			}
			if(i%5==0) {
				continue;
			}
			System.out.print(i+" ");
			
			
		}
		
		
		
	}
	public void RSPGame() {
		//가위바위보 게임
		//몇 판 할지 입력
		//입력 받은 판수 만큼 반복
		
		//Math.random() : 0.0<=x<1.0의 난수 생성
		//1~3사이 난수 생성
		//1이면 가위, 2이면 바위, 3이면 보
		//승패 판별
		//매판 전적 기록 = 현재 기록 : 2승 1무 0패
		
		System.out.println("====가위바위보게임====");
		System.out.print("원하는 판수를 입력하세요 : ");
		int round=sc.nextInt();
		
		//승패 기록용 변수
		int win=0;
		int lose=0;
		int draw=0;
		
		for(int i=1; i<=round;i++){
			
			System.out.println("\n"+i+"번째 게임");
			System.out.println("가위/바위/보 중 하나를 입력하세요 : ");
			String input=sc.next();
			
			int random=(int)(Math.random()*3+1);
			//Math.random*3+1은 0부터 4사이의 난수를 생성한다
			//즉 1이상 4미만의 난수 생성
			
			//switch로 random값을 문자열로 바꾸기
			//null은 아무것도 참조하고 있지 않는 다는 뜻=공백
			String com=null;
			
			switch(random) {
			case 1 : com="가위";break;
			case 2 : com="바위";break;
			case 3 : com="보";break;
			}
			System.out.printf("컴퓨터는 %s를 선택했습니다\n",com);
			
			//컴퓨터와 플레이어 승패 판별
			if(input.equals(com)) {
				//무승부
				System.out.println("비겼습니다");
				draw+=1;
			}else {//이기거나 진 경우
				
				boolean win1= input.equals("가위") && com.equals("보");
				boolean win2= input.equals("바위") && com.equals("가위");
				boolean win3= input.equals("보") && com.equals("바위");
				
				if(win1||win2||win3) {
					System.out.println("플레이어가 이겼습니다");
					win++;
				}else {
					System.out.println("플레이어가 졌습니다");
					lose++;
				}
			}
			System.out.printf("현재 기록 : %d승 %d무 %d패",win,draw,lose);
			
			
		}
		
		
		
		
	}
	public void game() {
		
	}
}
