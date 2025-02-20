package edu.kh.oop.cls.model.vo;

public class Student { //클래스 선언부
	//[접근제한자][예약어] class 클래스명
	
	//접근제한자 public : 같은 프로젝트 내에서 어떤 클래서에서도 import 하여 사용가능
	
	//1.필드(Field) 영역 : 객체의 속성을 작성하는 클래스 내부 영역 == 멤버 변수
	
	//인스턴스 변수 : 필드에 작성되는 일반 변수 ex) private int age;
	
	//클래스 변수(== static 변수) : 필드에 static 예약어가 작성된 변수
	//ex) public static String schoolName;
	
	//필드 접근제한자 예제
	//필드 접근제한자 뜻 : 직접 접근 가능한 범위
	
	public int v1=10;//모두 접근가능
	protected int v2=20;//후손패키지까지 접근가능
	int v3=30;//같은 패키지 접근 가능
	private int v4=40;//같은 클래스 접근 가능
	
	//static 예약어
	public static String schoolName = "KH정보교육원";
	
	//final 예약어
	private final int TEMP1 = 100;
	
	
	//2.생성자 : 새롭게 원하는 대로 객체를 만드는 기능을 수행
	
	//객체를 만들 때 필요했던것은?
	//객체가 어떻게 생겼는지 정의되어 있는 클래스
	//그 클래스를 보고 new 연산자를 통해서 오른쪽에 new 클래스명();
	//특정 클래스를 내가 원하는 값으로 만들겠다 --> 기능()가 있으면 메서드
	

	
	
	
	//3.메서드
	
	public int getTEMP1() {//TEMP1에 대한 setter는 TEMP1은 final 예약어가 붙어있어 상수이므로 
		return TEMP1;      //재대입이 불가능하므로 setter가 설정되지 않았다
	}
	
	
	public void ex1() {
		TestVo tv = new TestVo();//default 클래스는 같은 패키지에서 사용 가능
		
		//v1부터 v4까지 전부 Student 클래스 내부에서 생성된 변수이기 때문에
		//같은 클래스 내부인 이곳에서 직접 접근이 가능하다
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		
		
	}



	
	
	
	
	
	
}
