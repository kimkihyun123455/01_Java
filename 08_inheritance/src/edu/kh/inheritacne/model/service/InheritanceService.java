package edu.kh.inheritacne.model.service;

import edu.kh.inheritacne.model.dto.Employee;
import edu.kh.inheritacne.model.dto.Person;
import edu.kh.inheritacne.model.dto.Student;

public class InheritanceService {

	public void ex1() {
		
		Person p = new Person();
		
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
		
		System.out.println("==========================");
		
		//Person 을 상속 받은 Student가 정말로 Person의 기능을 사용할 수 있는가?
		
		//Student 객체 생성
		Student std = new Student();
		
		//Student의 고유한 멤버(필드) 이용
		std.setGrade(3);
		std.setClassRoom(5);
		
		//Person로부터 상속 받은 멤버 이용
		std.setName("고길동");
		std.setAge(19);
		std.setNationality("대한민국");
		
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		
		Employee emp = new Employee();
		
		//Employee의 고유 멤버
		
		emp.setCompany("KH정보교육원");
		emp.setName("조미현");
		emp.setAge(20);
		emp.setNationality("대한민국");
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		System.out.println(emp.getCompany());
		
		p.breath();
		p.move();
		
		std.breath();
		std.move();
		
		emp.breath();
		emp.move();
		
		//상속의 특징 : 코드길이 감소 및 중복제거 효과!
		
	}
	
	public void ex2() {
		//super 생성자 이용해보기
		//Student 객체생성
		Student std = new Student("홍길동",17,"대한민국",1,3);
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
		//Employee 객체 생성
		//매개변수 생성자 이용(이름, 나이, 국적, 회사)
		//참조변수명 emp (김노동, 30 한국 KH정보교육원)
		
		Employee emp = new Employee("김노동",30,"한국","KH정보교육원");
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		System.out.println(emp.getCompany());
		
		
	}
	
	public void ex3() {
		
		Student std = new Student();
		Employee emp = new Employee();
		
		std.move();//오버라이딩하지 않은 Person의 메서드 수행
		
		emp.move();//오버라이딩한 Employee의 move(); 메서드 실행
		
		
	}
	
	public void ex4() {
		
		//toString() 오버라이딩 예제
		
		Person p = new Person("김철수",17,"대한민국");
		
		System.out.println(p.toString());
		System.out.println(p);
		//print 구문 수행 시 참조변수명을 작성하면
		//자동으로 toString() 메서드를 호출해서 출력해준다
		System.out.println("=========================");
		
		Student std = new Student("강호동",18, "미국",2,6);
		
		System.out.println(std.toString());
		System.out.println(std);
		
		//Employee 객체 생성 김노동, 36, 한국, kh정보교육원
		
		Employee emp = new Employee("김노동",36,"한국","KH정보교육원");
		
		System.out.println("=========================");
		
		System.out.println(emp);
		System.out.println(emp.toString());
		
		
		
	}
	
	
	
}
