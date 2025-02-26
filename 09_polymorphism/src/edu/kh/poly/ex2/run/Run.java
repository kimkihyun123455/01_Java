package edu.kh.poly.ex2.run;

import edu.kh.poly.ex2.model.service.Calculator;
import edu.kh.poly.ex2.model.service.KKHCalculator;

public class Run {

	public static void main(String[] args) {
		
		//AbstractService abser = new AbstractService();
		//abser.ex1();
		
		Calculator cal = new KKHCalculator();
		
		System.out.println("합 : "+cal.plus(20,30));
		System.out.println("차 : "+cal.minus(20,30));
		System.out.println("곱 : "+cal.multiple(20,30));
		System.out.println("몫 : "+cal.divide(20,30));
		
		//인터페이스 == 미완성 설계도 == 객체 생성 불가능
		//하지만 참조변수로는 사용 가능
		//코드의 큰 수정 없이 객체 생성 코드만 바꾸면 새로운 클래스 코드 수행 가능
		
		//인터페이스 특징
		//1) 인터페이스를 부모 참조변수로 사용하면 다형성 중 업캐스팅이 적용되어
		//   상속 받은 모든 클래스를 자식객체로 참조할 수 있다
		//   이를 이용하여 중요한 메인코드의 수정을 최소화할 수 있다
		
		//2) 자식 클래스의 공통된 메서드를 강제구현하기 때문에 모든 자식 클래스가
		//   동일한 형태를 띄게 된다
		//   때문에 공동작업에 필요한 개발환경 조성에 용이하다
		
		
		
		
		
	}

}
