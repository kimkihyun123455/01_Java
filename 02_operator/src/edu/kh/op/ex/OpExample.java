package edu.kh.op.ex;

import java.util.Scanner;

// 예제 코드 작성용 클래스 (기능용/메서드)
public class OpExample {

	// ex1() method : OpExample 이라는 클래스에 포함된 메서드
	public void ex1() {
	
		// 증감 연산자 : ++, --
		// 1을 더하거나 빼는 연산
		
		int iNum1 = 10;
		int iNum2 = 10;
		
		iNum1++;
		iNum2--;
		
		System.out.println(iNum1);//11
		System.out.println(iNum2);//9
		
		// 전위연산 혹은 후위연산인가에 따라 결과값이 달라 질 수 있다
		
		// 전위연산
		int temp1 = 5;
		System.out.println(++temp1 + 5);// 6+5 = 11
		
		// 후위연산
		int temp2 =3;
		System.out.println(temp2-- + 2);// 3+2 = 5라는 결과값 도출 후에 temp2에 --연산을 가한다
		System.out.println(temp2);// 2라는 결과값이 위 계산 이후에 연산된다
		
		int a = 3;
		int b = 5; 
		int c = a++ + --b;
		
		// 최종적으로 a,b,c는 각각 얼마로 출력될 것인가 a: 3 b: 5 c: 7
		
		System.out.printf("%d / %d / %d\n", a, b, c); // 4 4 7 값이 출력된다
		
		
	}
	
	public void ex2() {
		
		// 비교 연산자 : < > >= <= == !=
		// 비교 연산자의 결과는 한상 논리값이다
		
		int a = 10;
		int b = 20;
	
		System.out.println((a == b)==false);
		
		int c = 4;
		int d = 5;
		
		System.out.println((++c != d) == (--c != d));//false
		//                  ++4(5) != 5 == --5(4) != 5
		
		System.out.println(100 > 99);
		System.out.println(100 >= 100);
		
	}

	public void ex3() {
		
		//논리 연산자 : &&(and), ||(or)
		
		// && : 둘다 true면 true 나머지 false
		// 와, 그리고, ~면서, ~부터, ~까지, ~사이
		
		int a = 101;
		// a는 100 이상 이면서 짝수인가?
		System.out.println((a>=100) && (a%2 == 0));
		
		int b = 5;
		// b는 1부터 10까지의 범위 안에 포함되어 있는가
		System.out.println((1<=b) && (b<=10));
		
		// || : 둘다 fasle면 false 나머지 true
		// 또는, 혹인
		
		int c = 10;
		// c는 10을 초과하거나 짝수인가?
		System.out.println((c>10)||(c%2==0));
		
		
		
		
	}
	
	public void ex4() {
		
		// 삼항 연산자 : 조건식 ? true 일 때 수행될 값 : false 일 때 수행될 값
		// *조건식 : 연산결과가 true나 false인 식
		
		int num = 30;
		
		// num이 30보다 크면 "num은 30보다 큰 수이다"
		// 아니면 "num은 30 이하의 수이다" 출력
		
		String result = num>30 ? "num은 30보다 큰 수이다 " : "num은 30 이하의 수이다";
	
		System.out.println(result);
		
		// 입력 받은 정수가 음수인지 양수인지 구분해라
		// 단, 0은 양수로 처리
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("정수를 입력하세요 : ");
		int int1 = sc.nextInt();
		int int2 = int1 * -1;
		sc.nextLine();
		String result2 = int2 >= 0 ? "양수입니다" : "정수입니다";
		*/
		
		System.out.println("정수를 입력하세요 : ");
		int int1 = sc.nextInt();
		String result2 = int1 >= 0 ? "양수입니다" : "정수입니다";
		
		System.out.println(result2);
		
		
		
		
	
	
	}
}
