package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.println("숫자를 한 개 입력하세요 : ");
		int int1 = sc.nextInt();
		
		String result;
		if(int1<0) result = "양수만 입력해주세요.";
		else if(int1%2==0) result="짝수입니다.";
		else result="홀수입니다.";
		
		System.out.println(result);
	}
	public void practice2() {
		
		System.out.println("국어점수 : ");
		int score1 = sc.nextInt();
		System.out.println("수학점수 : ");
		int score2 = sc.nextInt();
		System.out.println("영어점수 : ");
		int score3 = sc.nextInt();
		
		int sum = score1+score2+score3;
		double average = sum/3;
		
		
		if(score1<40 ||score2<40||score3<40|| average<60 ) {
			
			System.out.println("불합격입니다.");
		}
		else {
			System.out.println("국어 :"+score1);
			System.out.println("영어 :"+score2);
			System.out.println("수학 :"+score3);
			System.out.println("합계 :"+sum);
			System.out.println("평균 :"+average);
			System.out.println("축하합니다, 합격입니다!");
		}
		//System.out.printf(result);
		
	}
	public void practice3() {
		System.out.println("1~12 사이의 정수 입력 :");
		int month = sc.nextInt();
		
		switch(month) {
		case 1,3,5,7,8,10,12 : System.out.println(month+"월은 31까지 있습니다");break;
		case 4,6,9,11 : System.out.println(month+"월은 30일까지 있습니다");break;
		case 2 : System.out.println(month+"월은 28일까지 있습니다");break;
		default : System.out.println(month+"월은 잘못 입력된 달입니다");
		/*case 1 : System.out.println("1월은 31까지 있습니다");break;
		case 2 : System.out.println("2월은 28까지 있습니다");break;
		case 3 : System.out.println("3월은 31까지 있습니다");break;
		case 4 : System.out.println("4월은 30까지 있습니다");break;
		case 5 : System.out.println("5월은 31까지 있습니다");break;
		case 6 : System.out.println("6월은 30까지 있습니다");break;
		case 7 : System.out.println("7월은 31까지 있습니다");break;
		case 8 : System.out.println("8월은 31까지 있습니다");break;
		case 9 : System.out.println("9월은 30까지 있습니다");break;
		case 10 : System.out.println("10월은 31까지 있습니다");break;
		case 11 : System.out.println("11월은 30까지 있습니다");break;
		case 12 : System.out.println("12월은 31까지 있습니다");break;
		default : System.out.println(month+"월은 잘못 입력된 달입니다");
		*/ //그냥 case 한번에 붙이면 된다
		
		
		
		/*String result;
		
		if(month<1 || month>12) result =month+"월은 잘못 입력된 달입니다";
		else if(month==1 ||month==3||month==5||month==7||month==8||month==10||month==12) {
			result=month+"월은 31일까지 있습니다";
		}else if(month==2) {
			result=month+"월은 28일까지 있습니다";
		}else {
			result = month+"월은 30일까지 있습니다";
		}
		
		
		System.out.println(result);
		 */
		}
	}
	public void practice4() {
		System.out.println("키(m)를 입력해 주세요 :");
		double height = sc.nextDouble();
		System.out.println("몸무게(kg)를 입력해 주세요 :");
		double weight = sc.nextDouble();
		
		double bmi = weight/(height*height);
		
		String result;
		
		if(bmi>=30) result="고도비만";
		else if(bmi>=25) result="비만"; //나는 elseif 구문에 각각bmi<30&&bmi>=25
		else if(bmi>=23) result="과제충"; //bmi<25&&bmi>=23
		else if(bmi>=18.5) result="정상체중";// bmi<23&&bmi>=18.5를 입력했으나 첫 if에서 걸러지는 것을 
		else result="저체중";              //고려하여 전반부를 제거하는 것이 가능하다. 유의해두자.
		
		System.out.println("BMI 지수 :"+bmi);
		System.out.println(result);
	}
	public void practice5() {
		
		System.out.println("중간 고사 점수 :");
		int score1 = sc.nextInt();
		System.out.println("기말 고사 점수 :");
		int score2 = sc.nextInt();
		System.out.println("과제 점수 :");
		int score3 = sc.nextInt();
		System.out.println("출석 횟수 :");
		int score4 = sc.nextInt();
		
		double score11=score1*2/10; //*=를 통한 대입은 강제형변환을 포함한다
		double score22=score2*3/10; //int1*=0.2 는 int1=(int)int1*0.2로 0.2를 통해 double이 된 형태
		double score33=score3*3/10; // int로 강제형변환을 시켜주는 것이 포함되어 있다
		
		double average = score11+score22+score33+score4;
		String result;
		
		if(score4<=14) {
			result= "";
			System.out.print("Fail [출석 횟수 부족 ("+score4+"/20)]");
		}
		else {
			if(average<70) {
			result="Fail [점수 미달]";
		}
			else {
			result="PASS";
		}
			//System.out.printf("중간고사 점수(20) :%.1f", score11); 이라고 적어도 괜찮다
			System.out.println("중간 고사 점수(20) :"+score11);
			System.out.println("기말 고사 점수(30) :"+score22);
			System.out.println("과제 점수(30) :"+score33);
			System.out.println("출석 점수(20) :"+score4);
			System.out.println("총점 :"+average);
			System.out.println(result);
		}
	}
	
	
	
	
	
}
