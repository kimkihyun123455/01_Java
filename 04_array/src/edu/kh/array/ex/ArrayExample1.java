package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
	Scanner sc= new Scanner(System.in);
	/*
	 * 배열(Array)
	 * 
	 *  같은 자료형의 변수를 하나의 묶음으로 다루는 것.
	 *  묶여진 변수들은 하나의 배열명으로 불러지고
	 *  구분은 index를 이용함(index는 0부터 시작하는 정수)
	 */
	
	public void ex1() {
		//변수 vs 배열
		
		//변수 선언
		int num; // stack 영역에 int 자료형을 저장 할 수 있는 공간 4byte를 할당하고
				 // 그 공간에 num이라는 이름을 부여
		
		//변수 대입
		num=10; //생성된 num이라는 변수공간에 10이라는 정수값 대입

		//변수 사용
		System.out.println(num); //num이 작성된 자리에 num에 저장된 값을 읽어와 출력
		
		//---------------------------
		
		//배열 선언
		int[] arr; //stack 영역에 int[]자료형 공간을 4byte 할당하고
				   //그 공간에 arr 이라는 이름을 부여
				   //**해당 변수는 참조형으로 주소값만을 저장할 수 있다**
		
		//배열 할당
		arr=new int[3]; //new : new 연산자라고 하며 Heap 메모리 영역에 새로운 공간 할당
		
		//int[3] : int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열
		//
		//new int[3] : Heap 영역에 int형 변수 3칸짜리 int[]을 생성
		//
		//생성되노 배열에는 같은 종류의 변수를 대입하여야 한다
		//
		//Heap 영역에 할당된 공간은 절대 비어있을 수 없다
		//배열 최초 할당 시 JVM 기본값0이 자동 저장된다
		//boolean은 false, 나머지는 0, 참조형은 null이 기본값이다
		
		System.out.println(arr);//arr이라는 영역의 주소값을 출력
	
		System.out.println(arr[0]);//arr이라는 영역의 0번 변수 출력
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//배열 요소 값 대입
		arr[0]=10;
		arr[1]=50;
		arr[2]=100;
		
		//배열 사용
		
		System.out.println(arr[0]);//arr이라는 영역의 0번 변수 출력
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//[10, 50, 100] 실제로 arr 배열이 가진 모든 요소의 값 출력
		//Arrays.toString(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
	public void ex2() {
		//배열 선언 및 할당
		int[] arr = new int[4];
		
		//arr[0~3] 전부 초기값 0으로 설정
		
		arr[0]=100;
		arr[1]=200;
		arr[2]=500;
		arr[3]=1000;
		
		// 코드에서 빨간줄 에러 : 컴파일 에러
		// 실행 중에 발생 하는 에러 : 런타임 에러
		
		//배열과 for문
		//배열의 길이 : 배열명.length
		System.out.println("배열의 길이 : "+arr.length);
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf("arr[%d]에 저장된 값 : %d\n",i,arr[i]);
			
			
		}
		
		//선언과 동시에 초기화
		int[]arr2= {1,2,3,4,5};
		//stack 영억에 int[] 자료형 공간을 4byte 할당하고
		//그 공간에 arr2라는 이름을 부여
		//Heap 메모리 영역에 int 5칸짜리 int[]를 생성하고
		//0번 인덱스부터 각 요소에 1~5까지 초기화함
		//int[] 주소값을 arr2 참조 변수가 참조함
		
		System.out.println(Arrays.toString(arr2));
	}
	public void ex3() {
		//5명의 키를 입력 받고 평균 구하기
		//1번키 입력 : 170.5
		//2번키 입력 : 163.7
		//3번키 입력 : 170.0
		//4번키 입력 : 167.2
		//5번키 입력 : 177.3
		//평균 : 177.02
		
		double[] height = new double[5];
		//double[] 자료형 참조변수 height를 stack영역에 생성하고
		//height에 heap영역에 새로 생성된 double 5칸짜리 배열의 주소를 대입
		
		for(int i=0;i<height.length;i++) {
			System.out.print((i+1)+"번 키 입력 : ");
			height[i]+=sc.nextDouble();
			//heigth의 i번째 인덱스에 입력값 추가
		}
		System.out.println();
		
		double sum=0;//합계 저장용 변수
		
		for(int i=0;i<height.length;i++) {
			sum+=height[i];
		}System.out.printf("\n평균 : %.2f",sum/height.length);
		
	}
	public void ex4() {
		//입력 밥은 인원 수 만큼의 점수를 입력받아 배열에 저장
		//입력이 완료되면 점수 합계, 평균, 최고점, 최저점 출력
		
		System.out.println("입력 받을 인원수 :");
		int member = sc.nextInt();
		int arr[]=new int[member];
		
		double sum=0;
		int best=arr[0];
		int worst=arr[0];
		
		for(int i=0;i<member;i++) {
			System.out.print((i+1)+"번 점수 입력 : ");
			int score = sc.nextInt();
			arr[i]+=score;
		}for(int i=0;i<member;i++) {
			sum+=arr[i];
			
		}for(int i=0;i<member;i++) {
			
			if(arr[i]>=best) {
				best=arr[i];
			}else {
				worst=arr[i];
			}
		}
		
		System.out.printf("합계 : %.0f\n",sum);
		System.out.printf("평균 : %.1f\n",sum/arr.length);
		System.out.printf("최고점 : %d\n",best);
		System.out.println("최저점 : "+worst);
		
		
		
		
	}
	public void ex5() {
		// 점심 메뉴 뽑기 프로그램
		String[] arr= {"김밥", "서브웨이", "햄버거", "백반", "국밥","짜장면"};
		
		System.out.println("오늘 점심 메뉴 : "+arr[(int)(Math.random()*6)]);
		
		
	}
	public void ex6() {
		//배열을 이용한 검색
		
		//입력 받은 정수가 배열에 있는지 없는지 확인
		//있다면 몇번 인덱스에 있는지 출력
		//없으면 존재하지 않음
		int arr[]= {100,200,300,400,500,600,700,800,900,1000};
		
		//신호를 나타내기 위한 변수
		boolean flag = false; 
		
		System.out.println("정수를 입력하세요 :");
		int num=sc.nextInt();
		
		for(int i=0; i<arr.length ;i++) {
			
			if(arr[i]==num) {
				System.out.println(i+"번째 인덱스에 존재");
				flag=true;//일치하는 값이 있으므로 true로 변경
			}
		}
		//flag 상태를 검사
		
		if(!flag) {
			System.out.println("존재하지 않음");
		}
		
	}
	public void ex7() {
		//입력받은 값과 일치하는 값이 있으면 인덱스 번호 출력
		//없으면 '존재하지 않음' 출력
		
		String[] arr= {"사과","딸기","바나나","키위","멜론","아보카도"};
		
		/*과일 입력 : 아보카도
		 *5번 인덱스에 존재
		 *
		 *과일 입력 : 수박
		 *존재하지 않음
		 */
		
		System.out.println("과일 입력 : ");
		String fruit=sc.next();
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(fruit)) {
				System.out.println(i+"번 인덱스에 존재");
				flag=true;
			}
			
		}if(!flag) {
			System.out.println("존재하지 않음");
		}
		
		
	}
	public void ex8() {
		//String 참조형
		
		/*String str = "가나다";// String Constant Pool 저장
		*String str2 = "가나다";// String Constant Pool 저장
		*String str3 = new String("가나다");// Heap 새 객체 저장
		*String str4 = new String("가나다");// Heap 새 객체 저장
		*
		*str과 str2는 상수풀(객체)에 포함되어 있는 "가나다"를 참조하지만
		*str3과 str4는 각각 새로운 객체를 만들었기 때문에 참조하게 되는 객체가 다르다
		*
		*
		*
		*
		*/
		
		
		//System.out.println(str);//주소값이 출력되는가?
		//String 클래스의 toString() 메서드가 존재
		//toString() 메서드는 자기 자신을 그대로 반환
		//System.out.println(str);을 실행하면
		//str.toString()이 자동으로 호출됨
		
		//String[] strArr = {"사과", "바나나","딸기"};
		
		
		
	}
	public void ex9() {
		//1.문자열을 입력 받아 한 글자씩 잘라내어 char 배열에 순서대로 저장
		//2.문자 하나를 입력 ㅂ다아 일치하는 문자가 char 배열에 몇개 존재하는지 확인
		//3. 단, 일치하는 문자 없을경우 "존재하지 않습니다" 출력
		/*
		 * 문자열 입력 : hello
		 * [h,e,l,l,o]
		 * 검색할 문자 입력 : l
		 * 2개 있음
		 * 
		 * 사용해야하는 기능
		 * 1. 배열검색
		 * 2. 문자열의 길이 : String.length()***문자열의 길이는 메서드이기 때문에 () 붙인다
		 * 3. String.charAt(index) : 문자열에서 특정 index에 위치한 문자 하나 얻어옴
		 * 4. "hello".charAt(1)-> 'e'
		 * 5. count(숫자세기)
		 */
		
		System.out.print("문자열 입력 : ");
		String input = sc.nextLine();//공백도 포함한다
		
		//입력 받은 문자열 한글자씩 잘라 char배열에 저장하기
		
		char arr[]=new char[input.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i]=input.charAt(i);
			
		}System.out.println(Arrays.toString(arr));
		
		//2. 문자 하나를 입력 받아 일치하는 문자가 char 배열에 몇개 있는지 확인
		System.out.print("검색할 문자 입력 : ");
		
		char ch = sc.next().charAt(0);
		//sc.next : String형
		//String.chatAt(0) -> String의 0번째 인덱스 문자 하나 추출해서 char 형태로 변환
		//"h"->'h'
		
		int count=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==ch) {
				count++;
			}
		}if(count>0){
			System.out.println(count+"개 있음");
		}else System.out.println("존재하지 않음");
		
		
		
		
	}
	
}
