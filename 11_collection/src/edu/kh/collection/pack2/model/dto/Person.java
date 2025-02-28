package edu.kh.collection.pack2.model.dto;

import java.util.Objects;

public class Person {

	private String name;
	private int age;
	private char gender;
	
	public Person() {}

	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	
	//객체가 같다는 것은 동등한가 동일한가로 나뉜다
	//동일 : 가르키고 있는 것이 같다
	//동등 : 가진 값이 같다
	
	//동일 객체 : 메모리 주소가 같은 객체
	//hashCode()는 주로 이런 객체를 식별하는데 사용
	
	//동등 객체 : 메모리 주소가 다르더라도, 각 객체의 내부 값들이 같다면 동일한 객체로 간주하는 경우
	//equals() 라는 메서드는 이런한 객체들이 같은지 판단할 때 상용된다
	
	@Override
	public int hashCode() {//동일비교
		//필드에 저장된 값을 이용해서 hashcode 생성
		//hashcode : 객체별 식별 코드
		return Objects.hash(age, gender, name);
	}
	
	
	// == : 주소를 비교
	// equals : 값 비교
	
	
	//동등 비교 : Object.equals() 메서드 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && gender == other.gender && Objects.equals(name, other.name);
	}
	
	
	
}
