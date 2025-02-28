package com.hw2.model.service;

import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;

public class Zoo {

	private Scanner sc = new Scanner(System.in);
	
	private List<Animal> animals;
	
	public Zoo() {}

	//animal 타입의 변수를 넣어야 작동하는 addAnimal
	public void addAnimal(Animal animal) {
		
	}
	
	public void showAnimals() {
		
	}
	
	public void displayMenu() {
		
		int input=0;
		
		do {
			
			System.out.println("******KH 동물원******");
			System.out.println("원하는 작업을 선택하세요 : ");
			System.out.println("1. 동물들의 울음소리 듣기");
			System.out.println("2. 종료");
			System.out.print("선택 : ");
			input = sc.nextInt();
			
			if(input ==1) {
				for(Animal animal : animals) {
					animal.sound();
				}
			}
		}while(input != 2);
		
		
		
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}
	
	
}
