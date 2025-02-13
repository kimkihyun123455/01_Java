package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//nextInt()를 사용 후 nextLine()을 사용시 문제점
		System.out.print("nextInt() 입력 : ");
		int intNum = sc.nextInt();
		
		sc.nextLine();// 입력버퍼에 남아있는 개행문자 제거용
		
		System.out.print("nextLine() 입력 : ");
		String word = sc.nextLine();
		// nextInt에 해당하는 정수 입력 후 nextLine에 해당하는 문자열을 입력할 수 없다
		// nextInt를 입력하며 눌린 정수와 Enter값(\n) 중 Enter 값이 입력버퍼에 남아있어
		// nextLine이 남아있는 Enter값(\n)를 수집하는 것으로 입력기회를 소모한다
		
	}
}
