package edu.kh.oop.abstraction.model.vo;

//MVC패턴 : Model View Controller 애플리케이션의 역할을 세가지로 분리하는 설계 패턴
// Model : 프로그램 로직과 관련된 데이터를 저장하고 비즈니스 로직을 처리하는 부분(DB, 서비스, 객체
// VO (Value Object) : 값 저장용 객체를 만들기 위한 클래스를 모아두는 패키지
// View : 사용자에게 보여지는 화면(UI-HTML,JSP,React)
// Controller : 상요자의 요청을 바다고, 모델과 뷰를 ㅇ녀결하는 역할(응답)

public class People {//국민 클래스

	//클래스란? 객체의 특성(속성과 기능)을 정의한 것
	//==객체를 만들기 위한 설계도
	
	//속성 == 값 == data
	//값을 저장하기 위한 변수 선언
	//국민이라면 공통적으로 가지고 있는 속성만 작성(추상화)
	//이름, 성별, 주민번호, 주소, 전화번호, 나이
	//필드 == 필드 변수 == 멤버 변수 :클래스에서 사용할 변수들을 나열하는 공간 
	
	//캡슐화 
	//데이터(속성)과 기능을 하나로 묶어관리하는 기법
	//데이터의 직접접근을 제한하는것이 원칙
	//때문에 클래스 내부에 간접접근 방법을 제공하는
	//기능(메서드)를 작성한다 /getter와 setter라고 한다.
	
	/*데이터 직접 접근 제한
	 * 
	 * public -> private 으로 변경
	 * 
	 * 
	 */
	
	
	//[접근제한자] 자료형 변수명;
	private String name;
	private char gender;
	private String pNo;
	private String address;
	private String phone;
	private int age;
	
	//기능 == 동작/행동 == method(메서드)
	public void tax() {
		System.out.println("세금 내놔");
	}
	
	public void vote() {
		System.out.println("투표해");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getpNo() {
		return pNo;
	}

	public void setpNo(String pNo) {
		this.pNo = pNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//캡슐화에서 사용할 간접 접근 기능(getter, setter)
	//[접근제한자] 반환자 메서드명(){}
	
	//getter
	//name 변수의 값을 호출한 쪽으로 보내주는 간접접근 기능
	
	//접근제한자 옆에 반환값에 따른 반환형을 표기 ex) void, String, int
	//void : 반환할 값이 없다
	/*public String getName() {
		return name;
		//return : 현제 메서드를 종료하고 호출한 쪽으로 되돌아감
		//return 갑/변수 : 현제 메서드 종료하고 값/변수 가지고 호출한 쪽으로 되돌아감
		
	}
	
	//getter() : 반환형이 무조건 있음
	//getter는 필드에 작성도니 변수값을 되돌려주는것
	//변수는 자료형이 있을 것
	//그 변수를 되돌려준다면 당연히 반환형도 존재할 것
	
	//name 변수에 값을 세팅하는 간접접근 기능 중 setter
	//                   매개변수
	public void setName(String name) {
		//this : 현제 객체
		this.name=name;
		//setter에 전달된 전달인자 "홍길동"이 매배변수 String name으로 대입되고
		//매개변수 name을 현재겍체의 name(private)이라는 변수에 대입한다는 뜻이다
		
		
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getpNo() {
		return pNo;
	}

	public void setpNo(String pNo) {
		this.pNo = pNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	/*public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	public String getpNo() {
		return pNo;
	}
	
	public void setpNo(String nPo) {
		this.pNo=pNo;
	}
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}*/
	//alt+shift+s 또는 Source
			//Generate Getters and Setters
	
	private String myname;

	public String getMyname() {
		return myname;
	}

	public void setMyname(String myname) {
		this.myname = myname;
	}
	//IllegalArgumentException
	//메서드에 전달된 인자가(매개변수)유효하지 않을 때 발생하는 예외
	//메서드 형태인 getter/setter를 이용하면 본인이 원하는 기능 추가 가능
	//age가 0보다 잘을때 예외 발생, 클 때 속성에 전달받은 값 세팅
	
	
	
	
	
	
}
