package edu.kh.oarr.run;

import edu.kh.oarr.model.service.MemberService;

public class MemberRun {

	public static void main(String[] args) {
		
		MemberService memser = new MemberService();
		memser.displayMenu();
		
	}

}
