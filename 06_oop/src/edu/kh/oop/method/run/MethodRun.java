package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;
import edu.kh.oop.method.model.service.MethodExample;


public class MethodRun {

	public static void main(String[] args) {
		
		//MethodExample methodEx = new MethodExample();
		//methodEx.method1();
		
		
		
		
		
		
		//  |method2() 메서드 호출 |  /\ 아래에서 위방향으로 stack에 메서드가 쌓인다
		//  |method1() 메서드 호출 |  |
		//  |main 메서드 실행      |  |
		//  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ  
		MemberService memser = new MemberService();
		memser.displayMenu();
	}

	
	
}
