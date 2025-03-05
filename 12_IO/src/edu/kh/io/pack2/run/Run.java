package edu.kh.io.pack2.run;

import edu.kh.io.pack2.model.service.ByteService;

public class Run {

	public static void main(String[] args) {

		//불변성의 String
		
		/*String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		String str3 = new String("Hello");
		String str4 = str3+" world";
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		//가변성의 StringBuilder, StringBuffer
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.hashCode());
		sb.append("Hello");
		System.out.println(sb.hashCode());*/
		
		ByteService service = new ByteService();
		
		//service.fileCopy();
	}

	
	
	
	
}
