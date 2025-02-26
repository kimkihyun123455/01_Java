package edu.kh.poly.ex2.model.dto;

public abstract class Animal {
	//추상클래스(abstract class)는 미완성 메서드를 보유하고 있는 클래스다
	//객체로 만들수 없는 클래스다
	//여러 타입들을 관리하기 위한 상위 타입의 목적
	//객체로 생성하여 사용하기 위한 목적이 아니다
	
	
	private String type;
	private String eatType;
	
	public Animal() {}

	public Animal(String type, String eatType) {
		super();
		this.type = type;
		this.eatType = eatType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEatType() {
		return eatType;
	}

	public void setEatType(String eatType) {
		this.eatType = eatType;
	}
	
	//동물의 공통 기능 추출(추상화)
	//동물은 공통적으로 먹고 숨쉬고 움직이지만
	//어떤 동물이냐에 따라 방법에 차이가 있다
	//해당 클래스에 각 행위에 따른 메서드 정의를 상세하게 하기 힘들다
	//미완성 상태의 메서드를 자식 메서드에서 오버라이딩 시켜 재정의 시킨다
	//따라서 추상 메서드(abstract)로 작성할 필요가 있다
	
	//먹다
	public abstract void eat(); //추상 메서드
	
	//숨쉬다
	public abstract void breath();
	
	//움직이다
	public abstract void move();
	
	//추상 클래스는 일반 멤버도 작성 가능
	public void ex() {
		System.out.println("이 메서드는 평범한 메서드...");
	}
	
	@Override
	public String toString() {
		return type + " / " + eatType;
	}
	
	
	
	
	
}
