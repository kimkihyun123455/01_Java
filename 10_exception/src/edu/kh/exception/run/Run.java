package edu.kh.exception.run;

import java.io.FileNotFoundException;
import java.io.IOException;

import edu.kh.exception.model.service.ExceptionService;

public class Run {

	public static void main(String[] args) {

		
		try {
			new ExceptionService().ex5();
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
	
}
