package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{

	private Prisoner[] prisoners;
	
	private int prisonerCount;

	
	public Prison() {
	}
	
	public Prison(int size) {
		prisoners = new Prisoner[size];
		prisonerCount=0;
	}
	
	@Override
	public void addPerson(Person person) {
		
		if(prisonerCount<prisoners.length && person instanceof Prisoner ) {
			
			prisoners[prisonerCount++]=(Prisoner)person;
			
			System.out.println("수감자가 추가되었습니다 - "+person.getInfo());
			
		}
		
		if(prisonerCount==prisoners.length) {
			System.out.println("수용소가 가득 찼습니다.");
		}
		
		
		
	}

	@Override
	public void removePerson(String id) {
	
		for(int i =0; i<prisonerCount; i++) {
			
			if(prisoners[i].getId().equals(id)) {
				System.out.println("수감자가 삭제되었습니다 -"+prisoners[i].getInfo());
				prisoners[i]=null;
				for(int ii = i; ii<prisonerCount;ii++) {
					
					prisoners[ii]=prisoners[ii+1];
					
				}
				prisoners[--prisonerCount]=null;
				return;
			}
		}
		System.out.println("ID : "+id+"인 수감자를 찾을 수 없습니다");
		
	}

	@Override
	public void displayAllPersons() {
		System.out.println("전체 수감자 명단");
		
		for(int i = 0; i<prisonerCount; i++) {
			System.out.println(prisoners[i].getInfo());
		}
		
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
