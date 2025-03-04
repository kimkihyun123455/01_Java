package com.toyFactory.model.dto;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;

public class Toy implements Comparable<Toy>{

	private String name;
	private int userAge;
	private int price;
	private String color;
	private String made;
	private Set<String> materials;
	
	public Toy() {}

	
	public Toy(String name, int userAge, int price, String color, String made, Set<String> materials) {
		super();
		this.name = name;
		this.userAge = userAge;
		this.price = price;
		this.color = color;
		this.made = made;
		this.materials = materials;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMade() {
		return made;
	}

	public void setMade(String made) {
		this.made = made;
	}

	public Set<String> getMaterials() {
		return materials;
	}

	public void setMaterials(Set<String> materials) {
		this.materials = materials;
	}

	@Override
	public String toString() {
		
		return "이름 : "+name+" / 가격 : "+price+" / 색상 : "+color+" / 사용가능연령 : "+userAge+" / 제조년월일 : "+made+" / 재료 : "+materials;
	}
		
	@Override
	public int hashCode() {
		return Objects.hash(color, made, materials, name, price, userAge);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return Objects.equals(color, other.color) && Objects.equals(made, other.made)
				&& Objects.equals(materials, other.materials) && Objects.equals(name, other.name)
				&& price == other.price && Objects.equals(userAge, other.userAge);
	}
	@Override
	public int compareTo(Toy other) {
		return this.userAge - other.userAge;
	}
	
	
}
