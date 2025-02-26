package com.hw2.run;

import com.hw2.model.dto.Prisoner;
import com.hw2.model.service.Company;
import com.hw2.model.service.ManagementSystem;
import com.hw2.model.service.Prison;

public class Run {

	public static void main(String[] args) {
		
		ManagementSystem company = new Company(10);
		ManagementSystem prison = new Prison(10);
		
		
		Prisoner no = new Prisoner("1205", "정준하", "밥도둑");
		
		System.out.println(no.getInfo());
		
		prison.addPerson(no);
	}

}
