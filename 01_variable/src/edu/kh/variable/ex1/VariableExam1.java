package edu.kh.variable.ex1;

public class VariableExam1 {
	//생성된 .java 파일과 class 파일명의 이름은 같아야 한다
	public static void main(String[] args) {
		//변수 미사용
		System.out.println(2*3.141592653589793*5);
		System.out.println(3.141592653589793*5*5);
		System.out.println(3.141592653589793*5*5*20);
		System.out.println(4*3.141592653589793*5*5);
		
		//변수 사용
		double pi = 3.141593653589793;//double은 실수형 자료를 뜻한다
		int r = 5; //int는 정수형 자료를 뜻한다
		int h = 20;
		
		System.out.println(2*pi*r);
		System.out.println(pi*r*r);
		System.out.println(pi*r*r*h);
		System.out.println(pi*r*r*4);
		
		/* 변수 (Variable)
		 * 메모리에 기록되는 공간
		 * 공간에 기록되는 값이 변할 수 있어서 변수라고 한다
		 * 
		 * 변수에는 여러 종류가 존재한다(저장되는 값의 형태, 크기가 다름)
		 * 
		 * 변수 사용의 장점
		 * 1. 가독성이 증가한다
		 * 2. 재사용성이 증가한다
		 * 3.코드 길이가 감소한다
		 * 4. 유지보수성이 증가한다(수정이 용이하다)
		 * 
		 * 집에서 코드 변경해보기
		 * 
		 * 오늘 점심은 무엇을 먹어야할까
		 * */
		
	}
}
