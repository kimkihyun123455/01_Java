package edu.kh.inheritacne.model.dto;

/*
 * Object
 * 	ㄴPerson
 * 		ㄴEmployee
 * 
 */

//final 클래스 : 상속불가능한 클래스(부모가 될 수 없는 클래스)
//제공되는 클래스 그대로 사용해야할 경우 사용
//ex) String 클래스
public /*final*/ class Employee extends Person{

	//필드
	private String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public Employee() {}

	public Employee(String name, int age, String nationality, String company) {
		super(name, age, nationality);//Person의 매개변수 생성자 호출
		this.company = company;
	}
	
	//Person으로부터 상속 받은 메서드 중
	//move()라는 메서드를 Employee에 맞게 재정의한다 (==오버라이딩)
	
	//@Override 어노테이션 : 해당 메서드가 오버라이딩을 되었음을 컴파일러에게 고지
	//컴파일러에게 문법체크를 하도록 알린다
	//부모에게 해당 메서드가 있는지 체크 -> 이름, 매개변수, 타입과 개수만 체크
	
	//super. : 상속관계에서 부모객체를 가르키는 참조변수
	
	@Override
	public void move() {
		//super.move(str, num);
		System.out.println("오버라이딩된 move()");
		System.out.println("효율적으로 빨리 일하고 퇴근한다");
		
	}
	
	@Override
	public String toString() {
		return super.toString()+" / "+company;
	}
	
	/*
	 *final 메서드는 오버라이딩이 불가하다 
	 *메서드의 기능이 변하면 안되는 경우 사용
	 */
	public final void onlyEmployee() {
		System.out.println("final 메서드입니다");
	}
	
	
	
	
	
}
