package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 문자열(String) 입력
		// 문자열을 3번 입력 받아 한줄로 출력하기
		
		// sc.next() : 다음 입력된 한 단어를 읽어와 공백을 만나면 중단
		// sc.nextLine() : 다음 입력된 한 줄을 읽어와 공백도 포함하여 입력
		/*System.out.print("입력 테스트 : ");
		String input1 = sc.nextLine();
		
		System.out.println(input1);
		*/
		
		
		System.out.print("입력 1 : ");
		String str1 = sc.nextLine();
		System.out.print("입력 2 : ");
		String str2 = sc.nextLine();
		System.out.print("입력 3 : ");
		String str3 = sc.nextLine();
		
		System.out.printf("%s %s %s\n", str1, str2, str3);
		
		
		
		
		
		
	}

}
