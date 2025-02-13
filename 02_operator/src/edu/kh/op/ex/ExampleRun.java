package edu.kh.op.ex;

//실행용 클래스 (메인메서드)
public class ExampleRun {
	//메인메서드 필수 작성
	public static void main(String[] args) {
		
		// OpExample이라는 클래스를 이용하여 객체를 생성함
		// 그 객체의 이름이 opEx라고 선언
		// 같은 패키지 안에 있는 클래스는 import가 필요없다
		OpExample opEx = new OpExample();
		
	opEx.ex1(); // opEx가 가지고 있는 기능 중 ex1이라는 이름의 메서드를 호출하여 실행한다
		
	opEx.ex2();	
	
	opEx.ex3();	
	
	opEx.ex4();
	}
	

}
