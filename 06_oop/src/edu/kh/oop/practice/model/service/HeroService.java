package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {
	public void practice() {
		
		Hero hero = new Hero("이구역짱", "전사", 200, 20, 1,0);
		
		Hero hero2 = new Hero("Zi존위자드","마법사",100,100,1,0);
		
		System.out.println("========"+hero.getNickname()+"========");
		hero.attack();
		hero.attack();
		hero.attack();
		hero.dash();
		hero.dash();
		hero.dash();

		System.out.println(hero.toString());
		
		System.out.println("========"+hero2.getNickname()+"========");
		hero2.attack();
		hero2.dash();
		hero2.attack();
		hero2.attack();
	
		System.out.println(hero2.toString());
	}
}
