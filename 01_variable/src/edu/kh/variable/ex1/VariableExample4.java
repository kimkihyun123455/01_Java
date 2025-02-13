package edu.kh.variable.ex1;

public class VariableExample4 {

	public static void main(String[] args) {

		/* 강제 형변환
		 *  -기존 자료형을 원하는 자료형으로 강제 변환 시키는 것
		 *   -값의 범위가 큰 자료형을 값의 범위가 작은 자료형으로 변환할 때
		 *   -출력되는 데이터의 표기법을 변환 시키고 싶을 경우
		 * 
		 *  *강제 형변환 방법
		 *  -자료형을 변환시키고 싶은 값 또는 변수 앞에 (자료형)을 작성
		 *  
		 * 
		 * 
		 * */
		
		double temp = 3.14;
		int num = (int)temp;
		
		System.out.println(num); //3
		System.out.println(temp); //3.14
		//실수형인 temp를 정수형인 num으로 전환하며 소수점 손실
		
		int iNum = 290;
		byte bNum = (byte)iNum;
		
		System.out.println(bNum); //34
		System.out.println(iNum); //290
		//같은 정수형 끼리의 변환시에도 범위 차이로 인한 손실 발생가능
		
		char ch = 'A';
		System.out.println((int)ch);//65
		
		int iNum3 = 44085;
		System.out.println((char)iNum3);
		//이 함수의 int 변수명을 위에 있는 함수의 변수명과 동일한 iNum이라 명명하였을 경우 오류가 나는 이유는? 덮어씌워지는거 아니였나?
		//int를 통해 같은 변수명을 다시 선언해서 오류난거였음
		
		int i6 = 2147483647;//int의 최대값
		int result2 = i6 + 1;
		
		System.out.println(result2);
		//위의 현상을 오버플로우라 하는데 최대값을 넘어선 연산이 발생할 경우 최소값으로 회귀하는 것을 의미한다
		//오버플로우를 염두에 두어야한다
		
		char ch1 = 'K';
		
		System.out.println((int)ch1);
		
		
	}

}
