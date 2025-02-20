package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

//ClsService와 Student, TestVo와 패키지가 다름
public class ClsService /*extends Student*/{
	//extends 클래스명 : 부모 클래스명으로부터 자식으로서 상속 받는다
	//Student가 부모 ClsService가 자식
	
	public void ex1() {
		//클래스 접근 제한자 확인해보기
		Student stu = new Student();//public 클래스는 어디서든 접근 가능하여 import해서 접근 가능
		
		//TestVo tv = new TestVo();//default 클래스는 같은 ClsService와 같은 패키지가 아니라 import 불가능
		
		//필드 접근 제한자 확인
		//전체에서 접근 가능한 public만 에러 안남
		System.out.println(stu.v1);
		//System.out.println(stu.v2);
		//System.out.println(stu.v3);
		//System.out.println(stu.v4);
		
		//상속 관계에서 집적 접근 가능 범위 테스트
		//상속 받으면 부모클래스를 본인 처럼 사용해야함
		//System.out.println(v1);
		//System.out.println(v2);
		//System.out.println(v3);
		//System.out.println(v4);
		
		
		
		
	}
	public void ex2() {
		//static 필드 확인 예제
		
		//학생 객체 2개 생성
		Student std1 = new Student();
		Student std2 = new Student();
		
		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
		
		//schoolName에 노란줄이 뜨는 이유 = 경고 = 문법에 맞지 않음
		
		//**static이 붙은 변수(필드)는 '클래스명.변수명'으로 사용해야함
		
		Student.schoolName="KH정보교육원";
		
		System.out.println(Student.schoolName);
		
		/*
		 * static
		 * 
		 * 공유 메모리 영역 또는 정적 메모리 영역이라고 함
		 * 
		 * 프로그램 시작 시 static이 붙은 코드들이 모두 static영역에 생성되고
		 * 프로그램이 종료될 때까ㅣㅈ 사라지지 않음(정적)
		 * 
		 * 그리고 static영역에 생성된 변수는 어디서든지 공유가능(공유)
		 * 
		 * 
		 */
		
		
	}
	public void ex3() {
		//생성자 확인 테스트
		User u1 = new User();
		
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());
		
		User u2 = new User();
		
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
		//문제점
		//u1이 참조하고 있는 User 객체와 u2가 참조하고 있는 User 객체의 필드값이 모두 동일하다
		//u1과 u2가 같은 기본생상자로 User 객체를 생성핶기 때문이다
		
		System.out.println("===========================");
		
		//해결방법
		//1)setter 를 이용해서 새로운 값 재대입
		u2.setUserId("김철수");
		u2.setUserPw("1234");
		u2.setUserName("철수출소");
		u2.setUserAge(30);
		u2.setUserGender('남');
		
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
		//해결방법 2 : 매개변수 생성자를 이용하여 객체가 생성될 때 다른값으로 필드를 초기화
		User u3 = new User("test3", "1234");
		
		System.out.println(u3.getUserId());
		System.out.println(u3.getUserPw());
		System.out.println(u3.getUserName());
		System.out.println(u3.getUserAge());
		System.out.println(u3.getUserGender());
	}
	public void ex4() {
		//매개변수 생성자 예제
		User u1 = new User();
		User u2 = new User("user02", "pass02");
		User u3 = new User("user03", "pass03", "김기현", 29, '남');
		
		System.out.printf("u1 : %s / %s / %s / %d / %c\n", 
				u1.getUserId(), u1.getUserPw(), u1.getUserName(), 
				u1.getUserAge(), u1.getUserGender());
		System.out.printf("u2 : %s / %s / %s / %d / %c\n", 
				u2.getUserId(), u2.getUserPw(), u2.getUserName(), 
				u2.getUserAge(), u2.getUserGender());
		System.out.printf("u3 : %s / %s / %s / %d / %c\n", 
				u3.getUserId(), u3.getUserPw(), u3.getUserName(), 
				u3.getUserAge(), u3.getUserGender());
		
		System.out.println(u1);
		System.out.println(u1.toString());
		
	}
}
