package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {// 기능 제공용 클래스

	Scanner sc = new Scanner(System.in);//공동으로 사용하는 필드
	
	//생성자
	
	
	//매서드영역
	public void ex1() {
		
		// if문 : 조건식이 true 일때만 내부 코드 수행
		
		//입력받은 정수가 양수인지 검사
		//양수라면 "양수입니다" 출력
		
		System.out.print("정수를 입력하세요 : ");
		int int1 = sc.nextInt();
		
		if(int1>0) {
			System.out.println("양수입니다");
		}
		
		if(int1<=0) {
			System.out.println("양수가 아닙니다");
		}
		
		
	}
	public void ex2() {
		// if-else문
		// 조건식 결과가 true면 if문이 false면 else문이 수행된다
		
		//홀짝검사
		
		System.out.println("정수를 입력하시오 : ");
		int int1 = sc.nextInt();
		
		if(int1%2 !=0) {
			System.out.println("홀수입니다");
		}else {//짝수 또는 0입력 수행
			
			//중첩 if문 
			if(int1==0) {
				System.out.println("0입니다");
			}else {
				System.out.println("짝수입니다");
			}
			
			
		}
		
		
	}
	public void ex3() {
		// if(조건식)-else if(조건식)-else
		
		// 양수, 음수, 0 판별
		
		System.out.println("정수를 입력하시오 : ");
		int int1 =sc.nextInt();
		
		if(int1>0) {
			System.out.println("양수입니다");
		}else if(int1<0) {
			System.out.println("음수입니다");
			
		}else {
			System.out.println("0입니다");
		}
		
		
		
	}
	public void ex4() {
		//month를 입력 받아 해당 month에 해당하는 계절 출력
		//12~2 겨울(-15도 이하 : "한파경보" / -12도 이하 : "한파주의보") 
		//3~5 봄 
		//6~8 여름 (35도 이상 : "폭염 경보"/33도 이상 : "폭염 주의보")
		//9~11 겨울, 해당사항 없음
		System.out.println("달 입력 : ");
		int month = sc.nextInt();
		
		String season; // 아래 조건문 수행 결과를 저장할 변수 선언
		
		if(month==1 || month==2 || month==12) {
			season = "겨울";
			System.out.println("온도를 입력하시오 : ");
			int temp1 = sc.nextInt();
			
			if(temp1 <=-15) {
				season += "한파 경보";
			} else if(temp1<=-12) {
				season += "한파 주의보";
			}
		} else if(month>=3 && month<=5) {
			season = "봄";
		} else if(month>=6 && month<=8) {
			season = "여름";
			
			System.out.println("온도를 입력하시오 : ");
			int temp1 = sc.nextInt();
			
			if(temp1>=35) {
				season +=" 폭염 경보";
			} else if(temp1>=33) {
				season += "폭염 주의보";
			}
		} else if(month>=1 && month<=11) {
			season ="가을";
		} else {
			season ="해당하는 계절이 없습니다";
		}
		System.out.println(season);
		
		
		
		
	}
	public void ex5() {
		
		//나이를 입력받아
		//13세 이하면 "어린이입니다"
		//13세 초과 19세 이하면 "청소년입니다"
		//19세 초과 시 "성인입니다" 출력
		
		System.out.println("나이를 입력하시오 : ");
		int age = sc.nextInt();
		String result;
		
		if(age<=13) {
			result = "어린이입니다";
		}else if(age<=19) {
			result = "청소년입니다";
		}else {
			result = "성인입니다";
		}
		System.out.println(result);
		//위의 코드와 같이 if문 이후 나오는 구문이 한줄일 경우 {}를 쓰지 않아도 괜찮다
		
		/*if(age<=13) {
			System.out.println("어린이 입니다");
		}else if(age>13 && age<=19) {
			System.out.println("청소년입니다");
		}else {
			System.out.println("성인입니다");
		}
		내가 작성한 코드는 print를 여러반 사용해요 하나
		강사님이 작성한 코드는 result값을 설정하여
		마지막에 print(result)를 하는 것 같으로 깔끔하게
		해결되어 비교를 위해 남겨둠
		
		*/
		
			
		}
	public void ex6() {
		
		//점수를 입력받아
		//90점 이상 : A
		//80점 이상 90점 미만 : B
		//70점 이상 80점 미만 : C
		//60점 이상 70점 미만 : D
		//60점 미만 : F
		//0점 미만, 100점 초과 : "잘못 입력하셨습니다" 출력
		
		System.out.println("점수를 입력하시오 : ");
		int score = sc.nextInt();
		String result;
		
		if(score>=90 && score<100 ) result= "A";
		else if(score>=80 && score<100) result ="B";
		else if(score>=70 && score<90) result ="C";
		else if(score>=60 && score<80) result ="D";
		else if(score<60 && score>=0) result ="F";
		else  result = "잘못 입력하셨습니다";
		
		
		System.out.println(result);
		/* 위의 코드에서 A 점수파트를 먼저 작성하다보니
		* if조건문에 계속 범위 설정을 해주어야 한다
		*
		* 하지만 오류 조건을 먼저 입력하게 되면 코드 작성이 한결 편해진다
		*
		* if(score<0 || score>100) result="잘못 입력하셨습니다";
		* else if(score><60 && score>=0) result ="F";
		* else if(score>=60) result ="D";
		* else if(score>=70) result ="C";
		* else if(score>=80) result ="B";
		* else result ="A";
		* 라고 코드를 짜는 것이 더욱 깔끔하다
		*/
		
		
	}
	public void ex7() {
		//놀이기구 탑승 제한 검사
		//나이가 12세이상, 키 140.0 이상일 경우에만 "탑승가능"
		//나이가 12세 미만인 경우 : " 적정 연령이 아닙니다"
		//키가 140.0 미만 : "적정 키가 아닙니다"
		//나이가 0세 미만, 100세 초과 시 : "잘못 입력하셨습니다"
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		/*System.out.println("키를 입력하세요 : ");
		double len =sc.nextDouble();
		
		String result;
		if(age<0 || age>100) result = "잘못 입력하셨습니다";
		else if(age<12) result = "적정 연령이 아닙니다";
		else if(len<140.0) {
			result = "적정키가 아닙니다";
		}
		else result="탑승가능";
		
		System.out.println(result);
		*/
		
		String result;
		
		if(age<0||age>100) {
			result="잘못 입력하셨습니다";
		}else {
			System.out.println("키 입력 : ");
			double height = sc.nextDouble();
			
			if(age<12) result ="적정 연령이 아닙니다";
			else if(height<140.0) result="적정 키가 아닙니다";
			else result = "탑승가능";
			
		}
		
		System.out.println(result);
		
		
	}
	public void ex8() {
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		String result;
		if(age>100 || age<0) {
			//System.out.println("나이를 잘못 입력하셨습니다");
			result="나이를 잘못 입력하셨습니다";
		}else {
			
			System.out.println("키를 입력하세요 : ");
			double height = sc.nextDouble();
			if(height>250.0 || height<0) {
				result="키를 잘못 입력하셨습니다";
				//System.out.println("키를 잘못 입력하셨습니다.");
			}else  {
				if(age<12 && height<140.0) {
					result="나이와 키 모두 적절치 않음";
					//System.out.println("나이와 키 모두 적절치 않음");
				}else if(age<12 && height>140.0) {
					result="키는 적절하나, 나이가 적절치 않음";
					//System.out.println("키는 적절하나, 나이가 적절치 않음");
				}else if(age>=12 && height<140.0) {
					result="나이는 적절하나, 키가 적절치 않음";
					//System.out.println("나이는 적절하나, 키가 적절치 않음");
				}else result = "탑승가능";
					//System.out.println("탑승 가능!!");
			} //다시 result선언을 통한 코드의 단축을 사용하지 않고 일일히 print문을 작성하였다. 유의하자.
			
		}
		System.out.println(result);
		
	}
	public void ex9() {
		//switch문
		//여러 case 중 하나를 선택하여 수행하는 조건문
		
		//요일 번호 입력(1~7) : 3=수요일
		
		System.out.println("요일번호를 입력하세요 : ");
		int day = sc.nextInt();
		
		switch(day) {
		case 1 : System.out.println("월요일");break;
		case 2 : System.out.println("화요일");break;
		case 3 : System.out.println("수요일");break;
		case 4 : System.out.println("목요일");break;
		case 5 : System.out.println("금요일");break;
		case 6 : System.out.println("토요일");break;
		case 7 : System.out.println("일요일");
		default : System.out.println("번호를 잘못 입력하였습니다");break;
		}
		//System.out.println(day);이거 필요 없다
		
		
		
		
		
	}
	public void ex10() {
		//점수 입력 0~100
		//90~100 : a
		//80~90 : b
		
		System.out.println("점수를 입력하세요 : ");
		//점수 범위 벗어난건 생각 x
		int score = sc.nextInt();
		
		switch(score/10) {
		case 10 : 
		case 9 : System.out.println("학점 : A");break;
		case 8 : System.out.println("학점 : B");break;
		case 7 : System.out.println("학점 : C");break;
		case 6 : System.out.println("학점 : D");break;
		default : System.out.println("학점 : F");
		
		}
		
		//System.out.println(score);
		
		
	}
	
	
}
