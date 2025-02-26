package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{

	private Prisoner[] prisoners;
	
	private int prisonerCount;

	
	Person p = new Prisoner();
	
	public Prison() {
	}
	
	public Prison(int size) {
		prisoners = new Prisoner[size];
		prisonerCount=0;
	}
	
	@Override
	public void addPerson(Person person) {
		
		for(int i = 0; i<prisoners.length; i++) {
			
			if(prisonerCount==prisoners.length) {
				System.out.println("인원이 모두 충족되었습니다");
				
				break;
			}
			
			if(prisoners[i]==null) {
				
				System.out.print("수감자가 추가되었습니다 - "+p.getInfo()+"\n");
				prisoners[i] = (Prisoner) person;
				prisonerCount++;
			}
			
		}
		
		
		
	}

	@Override
	public void removePerson(String id) {
		
	}

	@Override
	public void displayAllPersons() {
		//System.out.printf("수감자가 추가되었습니다 - ID : %s , 이름 : %s , 죄목 : %s",prisoners.);
	}

	public Prisoner[] getPrisoners() {
		return prisoners;
	}

	public void setPrisoners(Prisoner[] prisoners) {
		this.prisoners = prisoners;
	}

	public int getPrisonerCount() {
		return prisonerCount;
	}

	public void setPrisonerCount(int prisonerCount) {
		this.prisonerCount = prisonerCount;
	}
	
	
}
