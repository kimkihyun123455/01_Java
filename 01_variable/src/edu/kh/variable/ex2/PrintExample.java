package edu.kh.variable.ex2;

public class PrintExample {

	public static void main(String[] args) {

		//System.out.println() : 한 줄 출력용 메서드 (자동 줄바꿈 실행)
		System.out.println("테스트1");
		System.out.println("테스트2");
		
		System.out.print("테스트3");
		System.out.println();  //내용이 없는 println은 단순 줄바꿈이다
		System.out.print("테스트4");
		//줄바꿈의 차이는 있지만 괄호안의 내용이 그대로 출력된다
		System.out.println();

		int iNum1 = 10;
		int iNum2 = 5;
		
		System.out.println(iNum1 +"+"+iNum2 +"="+(iNum1 + iNum2));
		
		System.out.printf("%d+%d=%d\n", iNum1, iNum2, iNum1+iNum2);
		//\n은 줄바꿈의 역할을 한다
		//System.out.printf("패턴", 패턴자리에 각각 들어갈 값/변수 나열); 의 형식으로 작성
		
		System.out.printf("%d + %d * %d / %d = %d\n", iNum1, iNum1, iNum2, 2, iNum1 + iNum1 * iNum2 /2);
		
		int iNum3 = 3;
		
		System.out.printf("%d\n", iNum3);
		System.out.printf("%5d\n", iNum3); //5칸 공간 확보 후 오른쪽 정렬하여 출력
		System.out.printf("%-5d\n", iNum3); //5칸 공간 확보 후 왼쪽 정렬하여 출력
		
		// 소수점 자리 제어
		System.out.printf("%.2f\n", 10 / 4.0);
		
		// 문자, 문자열, boolean
		
		// false / 가 / 안녕하세요
		boolean isTrue = false;
		char ch ='가';
		String str = "안녕하세요";
		
		System.out.printf("%b / %c / %s\n", isTrue, ch, str);
		
		//     \ 출력
		System.out.println("\\"); //   \를 표기하기 위해서는 \\로 기입해야한다
		
		//     \o/ 출력
		System.out.println("\\o/");
		
		
		// \t : tab(공간차지)
		System.out.println("a\tb\tc\td");
		
		// 유니코드 이스케이프
		System.out.println("\u0041");
		// 유니코드 16진수
		// 65(A)를 16진수로 표현
		// 65 / 16 몫4 나머지 1 ----> \u0041
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
