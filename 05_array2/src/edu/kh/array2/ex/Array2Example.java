package edu.kh.array2.ex;

import java.util.Arrays;

public class Array2Example {

	/* 2차원 배열
	 * 
	 * 자료형이 같은 1차원 배열을 묶음으로 다루는 것
	 * 행과 열의 개념이 추가되었다
	 * 
	 */
	public void ex1() {
		
		//2차원 배열 선언
		int[][] arr;
		//int 2차원 배열을 참조하는 참조변수 arr 선언
		//참조변수==참조형==레퍼런스변수==레퍼런스 (사람마다 부르는게 다름)
		
		//2차원 배열 할당
		//new 자료형[행크기][열크기];
		arr = new int[2][3];
		// Heap 영역에 int 2차원 배열 2행 3열 공간을 할당하고 arr에 대입
		
		//2차원 배열 초기화
		//1)행, 열 인덱스를 이용해 직접 초기화
		/*arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;*/
		
		//2중 for문을 이용한 초기화
		int num=10; // 배열 초기화에 사용할 변수
		
		//배열 길이
		System.out.println(arr.length);//2라고 반환되는 값은 행의 길이를 뜻한다
		System.out.println(arr[0].length);//3이라고 반환되는 값은 0행의 길이(열)을 뜻한다
		
		for(int row =0 ;row<arr.length; row++) {//행 반복(0,1)
			
			for(int col=0; col<arr[row].length; col++) {//열 반복 (0,1,2)
				arr[row][col]=num;
				num+=10;
			}
			
		}
		
		//3)선언과 동시에 초기화
		int arr2[][]= {{10,20,30},{40,50,60}};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr));
		System.out.println(Arrays.deepToString(arr2));
		//Arrays.toString() : 참조하고 있는 1차원 배열긔 값을 문자열로 반환
		
		//Arrays.deepToString() : 참조하고 있는 배열의 모든 값을 문자열로 반환
		
		
	}
	public void ex2() {
		//2차원 배열 선언과 동시에 초기화
		//3행3열 정수형 2차원 배열 선언과 동시에
		//1~9까지 초기화
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		
		//행별로 합 출력
		//0행의 합 :6
		//1행의 합 :15
		//2행의 합 :24
		
		for(int row=0;row<arr.length;row++) {
			
			int sum=0;
			for(int col=0; col<arr[row].length; col++) {
			
				sum+=arr[row][col];
				
			}
			System.out.println(row+"행의 합 : "+sum);
		}
		
		System.out.println("=============================");
		
		//열 별로 합 출력
		for(int i=0; i<arr[0].length;i++) {
			
			int sum=0;
			
			for(int x=0; x<arr.length;x++) {
				
				sum+=arr[x][i];
				
			}System.out.println(i+"열의 합 : "+sum);
		}
		
		
		
	}
	public void ex3() {
		
	
		//가변 배열 : n차원 배열 생성 시 마지막 배열 차추(열)을 지정하지 않고
		//나중에 서로 크기가 다른 배열을 생성하여 참조하는 배열
		
		char[][]arr = new char[4][];
	
		arr[0]=new char[3];//0행에 3열짜리 1차원 배열 생성후 주소값 저장
		arr[1]=new char[4];//1행에 4열짜리 1차원 배열 생성후 주소값 저장
		arr[2]=new char[5];//2행에 5열짜리 1차원 배열 생성후 주소값 저장
		arr[3]=new char[2];//3행에 2열짜리 1차원 배열 생성후 주소값 저장
		
		char ch = 'a';
		
		for(int row=0; row<arr.length; row++) {
			
			for(int col=0; col<arr[row].length;col++) {
				
				arr[row][col]=ch++;//ch++은 후위연산으로 대입 이후 ++을 실행한다
			}
			
		}
		System.out.println(Arrays.deepToString(arr));
		
	}
	
	
}
