package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
Scanner sc= new Scanner(System.in);
	public void practice1() {
		
		System.out.println("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		String result="";
		
		if(num<1) result="1 이상의 숫자를 입력하세요 :";
		else {
			for(int i=1;i<=num;i++) {
				result += i+" ";
			}System.out.println(result);
		}
		
		
		
		
	}
	public void practice2() {
		/*System.out.println("1 이상의 숫자를 입력하세요 :");
		int num = sc.nextInt();
		String result="";
		
		if(num<1) {
			result="1이상의 숫자를 입력해주세요.";
		}else {
				for(int i=num;i>1;i--) {
					result += i+" ";
				}
				System.out.println(result);
			}*/
		
		System.out.println("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		String result="";
		
		if(num<1) result="1 이상의 숫자를 입력하세요 :";
		else {
			for(int i=num;i>=1;i--) {
				result += i+" ";
			}
		}System.out.println(result);
		
		
		
	}
	public void practice3() {
		System.out.println("정수를 하나 입력하세요 :");
		int num = sc.nextInt();
		String result="";
		int sum=0;
		
		for(int i=1;i<=num;i++) {
			if(i==1) {
				
				result+=i+"";
				sum+=i;
			}else {
				result+=" + "+i;
				sum+=i;
			}
		}System.out.println(result+" = "+sum);
		
		
	}
	public void practice4() {
		System.out.print("첫 번째 숫자 : ");
		int first= sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int second= sc.nextInt();
		
		String result="";
		
		if(first < 1 || second < 1) {
			result = "1 이상의 숫자를 입력해주세요";
		} else {
			for(int i=1; i<=first || i<=second; i++) {//조건 제대로 확인하자..||를 &&로 써서 30분을 해멨다;;
				
				if(i<first&&i<second) {
					result += "";
				}else {
					result+=i+" ";
				}
			}
		}
		
		System.out.println(result);
		
		
		
	}
	public void practice5() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		int sum;
		System.out.println("======="+num+"단=======");
		for(int i=1; i<=9; i++) {
			sum=num*i;
			System.out.printf("%d * %d = %d",num,i,sum);
			System.out.println();
		}
		
		
		
	}
	public void practice6() {
		System.out.println("숫자 :");
		int num = sc.nextInt();
		//String result="";
		
		if(num<2||num>9) {
			//result="2~9사이 숫자만 입력해주세요.";
			System.out.println("2~9사이 숫자만 입력해주세요.");
		}else {
			for(int i=2;i<=9;i++) {
				System.out.print("===="+i+"단====");
				System.out.println();
			}
			
			
		}
		
		
	}
	public void practice7() {
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		String result="";
		for(int i=1;i<=num;i++) {
			result+="*";
			System.out.println(result);
		}
		
	}
	public void practice8() {
		System.out.println("정수 입력 :");
		int num = sc.nextInt();
		String result="";
		for(int i=num ;i>=1 ;i--) {
			result="";
			for(int ii=i ;ii>=1 ;ii--) {
				result+="*";
			}System.out.println(result);
		}
		
	}
	public void practice9() {
		System.out.println("정수 입력 :");
		int num = sc.nextInt();
		String result="";
		String result2="";
		String result3="";
		for(int i=1;i<=num;i++) {
			result+="*";
			for(int ii=i;ii<num;ii++) {
				result2+=" ";
			}result3=result2+result;
			System.out.println(result3);
			result2="";
		}
		
	}
	public void practice10() {
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		String result = "";
		for(int i=1; i<2*num-1; i++) {
			if(i<=num) {
				result+="*";
				System.out.println(result);
			}else {
				for(int ii=i; ii<2*num; ii++) {
					result="";
					for(int iii=ii; iii<2*num; iii++) {
						result+="*";
					}System.out.println(result);
				}
			}
		}
		
		
		
	}
}
