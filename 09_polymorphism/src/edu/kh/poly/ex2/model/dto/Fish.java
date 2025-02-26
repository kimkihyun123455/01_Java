package edu.kh.poly.ex2.model.dto;

public class Fish extends Animal{

	public Fish() {}
	
	public Fish(String type, String eatType) {
		super(type, eatType);
	}

	@Override
	public void eat() {
		System.out.println("물고기는 입을 뻐끔거리며 먹는다");
	}

	@Override
	public void breath() {
		System.out.println("물고기는 아가미를 통해 호흡한다");
	}

	@Override
	public void move() {
		System.out.println("물고기는 지느러미로 헤엄치며 움직인다");
	}
	
	
	@Override
	public String toString() {
		return "Fish : "+super.toString();
	}
	
	
	
	
	
	
	
}
