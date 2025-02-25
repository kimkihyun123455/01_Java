package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone;
import com.kh.inheritance.model.dto.SmartPhone;

public class Run {

	public static void main(String[] args) {

		BasicPhone basic = new BasicPhone("Nokia","3310",2000,10000,true);
		
		basic.printInfo();
		basic.checkKeyboard();
		System.out.println("==============================");
		SmartPhone smart = new SmartPhone("Samsung", "Galaxy S20", 2020, 1200000, "Android", 128);
		
		smart.printInfo();
		
		
		
	}

}
