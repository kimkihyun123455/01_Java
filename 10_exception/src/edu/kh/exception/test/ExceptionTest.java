package edu.kh.exception.test;

public class ExceptionTest {

	public static void main(String[] args) {
		
		//컴파일 에러 --> 개발자가 코드 잘못 쓴 경우
		//자료형이 맞지 않아 연산이 불가하여 컴파일 에러가 발생하였다
		//int a = 99.9;
		int a = (int)99.9; // 코드 수정 가능
		
		//런타임 에러 --> 프로그램 수행 중 발생하는 에러
		//주로 if문으로 처리가 가능하다
		int[] arr = new int[3];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		//arr[3]=30;
		//배열 범위 초과 예외 발생
		
		if(arr.length>=3) {//배열 인덱스 범위 초과한 값이 들어온다면
			System.out.println("배열 범위를 초과했습니다");
		}else {
			arr[3]=40;
			System.out.println("배열 범위 안정적이다");
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
