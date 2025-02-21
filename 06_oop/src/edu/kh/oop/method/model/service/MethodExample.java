package edu.kh.oop.method.model.service;

public class MethodExample {
	
	//메서드가 호출될 때마다 stack에 메서드를 실행한 이력이 메서드를 호출한 순서대로 쌓인다
	//그리고 제일 마지막에 쌓인 순서대로 stack에서 나간다
	
	public void method1() {
		int result = method2(3,5); //method() 함수 호출
		System.out.println(result);
		
		//void 형은 return;이라는 함수가 생략되어 있는 상태이다
	}
	
	public int method2(int a, int b) {
		int sum = a + b;
		return sum;
		
		//return(반환)
		//method2() 호출한 쪽으로 sum(8)을 가지고 되돌아감
		//호출된 메서드 자리에 return값을 넣는다는 뜻
	}
	
	
}
