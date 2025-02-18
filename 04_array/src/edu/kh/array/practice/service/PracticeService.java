package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		int[] num = new int[9];
		int sum=0;
		for(int i=0;i<num.length;i++) {
			
			num[i]=i+1;
			
			System.out.print(num[i]+" ");
			if(i%2==0) {
				sum+=num[i];
			}
		}System.out.println("\n짝수번째 인덱스 합 : "+sum);
		
	}
	public void practice2() {
		
		int[] num = new int[9];
		int sum=0;
		
		for(int i=0;i<num.length;i++) {
			
			num[i]=num.length-i;
			
			System.out.print(num[i]+" ");
			
			if(i%2==1) {
				sum+=num[i];
			}
		}System.out.println("\n홀수번째 인덱스 합 : "+sum);
		
	}
	public void practice3() {
		
		System.out.print("양의 정수 : ");
		int num=sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0;i<num;i++) {
			
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
	}
	public void practice4() {
		int[] arr = new int[5];
		boolean flag=false;
		int index=0;
		for(int i = 0; i<5; i++) {
			System.out.print("입력 "+i+": ");
			arr[i]=sc.nextInt();
		}System.out.print("검색할 값 :");
		int num=sc.nextInt();
		for(int i=0;i<5;i++) {
			if(num==arr[i]) {
				flag=true;
				index=i;
			}
		}if(flag==true) {
			System.out.println("인덱스 : "+index);
		}else {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
		
		
	}
	public void practice5() {
		
		System.out.println("문자열 : ");
		String name=sc.next();
		char[] ch= new char[name.length()];
		String flag="";
		int count=0;
		for(int i=0;i<name.length();i++){
			
			ch[i]=name.charAt(i);
		}System.out.print("문자 :");
		char one =sc.next().charAt(0);
		for(int i=0;i<name.length();i++) {
			if(ch[i]==one) {
				flag+=i+" ";
				count++;
			}
		}System.out.println(name+"에 i 가 존재하는 위치 :"+flag);
		System.out.println(one+"개수 : "+count);
		
		
		
		
	}
	public void practice6() {
		
		System.out.print("정수 :");
		int num=sc.nextInt();
		
		int[] arr= new int[num];
		
		int sum=0;
		
		String arr1="";
		for(int i=0;i<num;i++) {
			
			System.out.print("배열"+i+"번째 인덱스에 넣을 값 :");
			arr[i]=sc.nextInt();
			sum+=arr[i];
			arr1+=arr[i]+" ";
		}System.out.println(arr1);
		
		System.out.println("총합 : "+sum);
	}
	public void practice7() {
		System.out.print("주민등록번호를 - 포함하여 입력하세요 : ");
		String num=sc.nextLine();
		char[] ch=new char[num.length()];
		String sex="";
		
		for(int i=0;i<14;i++) {
			ch[i]=num.charAt(i);
			if(i>=8) {
				ch[i]='*';
			}
			sex+=ch[i];
		}System.out.println(sex);
		
	}
	public void practice8() {
		System.out.print("정수를 입력하세요 : ");
		int num=sc.nextInt();
		
		
		if(num%2!=1) {
			while(num%2!=1){
				System.out.println("다시 입력하세요.");
				System.out.print("정수를 입력하세요 :");
				num=sc.nextInt();
			}
		}
		int[] arr=new int[num];
		
		for(int i=0;i<num;i++) {
			if(i<(num+1)/2) {
				arr[i]=i+1;
			}else {
				arr[i]=arr[i-1]-1;
			}
		}System.out.print(Arrays.toString(arr));
		
		
	}
	public void practice9() {
		int[] arr= new int[10];
		String num ="";
		for(int i=0;i<10;i++) {
			arr[i]=(int)(Math.random()*10+1);
			
			num+=arr[i]+" ";
			
		}System.out.println("발생한 난수 :"+num);
		
	}
	public void practice10() {
		int[] arr= new int[10];
		String num="";
		int max=0;
		int min=10;
		
		for(int i=0;i<10;i++) {
			int random=(int)(Math.random()*10+1);
			arr[i]=random;
			num += arr[i] + " ";
//			for(int x=0;x<i;x++) {
//				if(arr[x]==random) {
//					i--;
//					break;
//				} 
//			} 
//			
			
			if(arr[i]>max){
				max=arr[i];
			}if(arr[i]<min) {
				min=arr[i];
			}
			
		}System.out.println(Arrays.toString(arr));
		System.out.println("발생한 난수 : "+num);
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		
		                  
		                  
		                  
	}
	public void practice11() {
		
		int[] arr= new int[10];
		String num="";
		
		for(int i=0;i<10;i++) {
			int random=(int)(Math.random()*10+1);
			arr[i]=random;
			for(int x=0;x<i;x++) {
				if(arr[x]==random) {
					i--;
				}
			}
			
		}for(int i=0;i<10;i++) {
			
			num+=arr[i]+" ";
			
		}
		
		System.out.println(num);
		
		
	}
	public void practice12() {
		
		int[] lotto=new int[6];
		String num="";
		
		for(int i=0;i<6;i++) {
			int random=(int)(Math.random()*45+1);
			lotto[i]=random;
			for (int x=0; x<i; x++) {
				if(lotto[x]==random) {
					i--;
				}
			}
		}Arrays.sort(lotto);
		for(int i=0;i<6;i++) {
			num+=lotto[i]+" ";
		}System.out.println(num);
		
		
	}
	public void practice13() {
		
		System.out.print("문자열 : ");
		String word=sc.next();
		String sum="";
		char[] ch=new char[word.length()];
		int count=0;
		
		for(int i=0; i < word.length(); i++) {
			
			ch[i]=word.charAt(i);
		}
		
		System.out.print("문자열에 있는 문자 : ");
		
		for(int i=0;i<word.length();i++) {//중복체크용 for
			
			boolean flag= true;//중복값 체크용
			for(int x=0;x<i;x++) {
				if(ch[i]==ch[x]) {
					flag=false;
					break;
				}
			}
			if(flag) {//중복 발생하지 않았을 경우
				
				if(i==0) {//첫글자
					System.out.print(ch[i]);
				}else {
					System.out.print(", "+ch[i]);
				}
				count++;//중복 아닐 때 count증가
			}
		}
		System.out.println("\n문자 개수 : "+count);
		
	}
	public void practice14() {
		
		System.out.print("배열의 크기를 입력하세요 : ");
		
		int size = sc.nextInt();
		System.out.println();//계행을 위한 print구문
		
		String[]arr=new String[size];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+1+"번째 문자열 : ");
			
			arr[i]=sc.nextLine();
		}
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(y/n)");
			char ch=sc.next().charAt(0);
			if(ch=='y'||ch=='Y') {
				
				System.out.print("더 입력 받을 개수 : ");
				int addSize=sc.nextInt();
				sc.nextLine();//입력받은 계행 문자 제거
				//새로 입력 받을 배열 생성
				String[] newArr=new String[arr.length+addSize];
				//배열 복사
				for(int i=0;i<newArr.length;i++) {
					//인덱스의 크기가 기존 배열보다 크거나 작을 경우 
					if(i<arr.length) {//깊은 복사 필요
						newArr[i]=arr[i];
					}else {//작은 복사 필요
						System.out.println(i+1+"번째 문자열 : ");
						newArr[i]=sc.nextLine();
					}
					
				}
				//기존 배열 공간을 참조하던 arr에 newArr 대입 필요
				//추가 입력시 위 코드를 반복하며 기준배열arr을 기준으로
				//newArr의 길이를 할당하기 때문에 꾸준히 for문 에서 변경된
				//arr값을 갱신해줘야한다
				arr=newArr;
				
				
			}else if(ch=='n'||ch=='N') {
				break;//while 반복문 종료
				
			}else System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			
		}
		
		
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
