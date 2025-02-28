package com.hw2.run;


import java.util.ArrayList;
import java.util.List;

import com.hw2.model.dto.Animal;
import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		
		List<Animal> ani = new ArrayList<>();
		
		ani.add(new Tiger());
		ani.add(new Monkey());
		
		zoo.setAnimals(ani);
		
		zoo.displayMenu();
	}
	
	
}
