package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

//Service : 특정 기능(비즈니스 로직)을 제공하는 패키지
//비밀번호 암호화, 

public class AbstractionService {
	
	//속성은 따로 없음
	//기능
	public void ex1() {
		//People 클래스를 이용해서 국민 객체 생성
		People p1=new People();
		//People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1
		//new People : 새로운 People 객체를 Heap 영역에 생성
		//클래스 이름이 자료형처럼 사용된다
		//때문에 클래스를 "사용자 정의 자료형"이라고 부른다
		/*
		p1.name="홍길동";
		p1.gender='남';
		p1.pNo="123456-1234567";
		p1.address="서울시 중구 남대문로 120";
		p1.phone="010-1234-5678";
		p1.age=20;
		
		p1.tax();
		p1.vote();
		
		System.out.println("p1의 name : "+ p1.name);
		System.out.println("p1의 gender : "+ p1.gender);
		System.out.println("p1의 address : "+ p1.address);
		System.out.println("p1의 phone : "+ p1.phone);
		System.out.println("p1의 age : "+ p1.age);
		System.out.println("p1의 pNo : "+ p1.pNo);
		*/
		p1.setName("홍길동");
		System.out.println(p1.getName());
		
		
		//p1.getName();//name을 얻어올 수 있으므로 getter
		
		//전달하는 값 : 전달인자
		
		p1.setGender('남');
		System.out.println(p1.getGender());
		
		
		p1.setpNo("123456-1234567");
		System.out.println(p1.getpNo());
		
		
		p1.setAddress("서울시 중구 남대문로 120");
		System.out.println(p1.getAddress());
		
		
		p1.setPhone("010-1234-5678");
		System.out.println(p1.getPhone());
		
		
		p1.setAge(20);
		System.out.println(p1.getAge());
		
		//본인 객체
		//People 클래스 애용하여 본인 이름 객체 생성하기
		//본인의 정도 setter값 대입
		//getter 이용해서 출력
		//메모리구조에 그려보기
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public void ex2() {
		People p2= new People();
		p2.setMyname("김기현");
		System.out.println(p2.getMyname());
	}
	
	
	
	
}
