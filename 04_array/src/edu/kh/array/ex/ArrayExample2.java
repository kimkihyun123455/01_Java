package edu.kh.array.ex;

import java.util.Arrays;

public class ArrayExample2 {
	
	//얕은 복사
	//주소를 복사하여 서로다른 두 참조 변수가 하나의 배열을 참조하는것
	public void shallowCopy() {
		
		int[] arr = {1,2,3,4,5};
		
		//얕은 복사 진행
		int[] copyArr=arr;//주소만 복사
		System.out.println("변경 전");
		System.out.println("arr 주소 : "+arr);
		System.out.println("copyArr 주소 : "+copyArr);
		System.out.println("arr : "+Arrays.toString(arr));
		System.out.println("copyArr : "+Arrays.toString(copyArr));
		
		//얕은 복사한 배열의 값을 변경
		copyArr[2]=999;
		
		System.out.println("변경 후");
		System.out.println("arr : "+Arrays.toString(arr));
		System.out.println("copyArr : "+Arrays.toString(copyArr));
		
		
		
	}
	
	//깊은 복사
	//같은 자료형의 새로운 배열을 만들어 기존 데이터를 모두 복사하는것
	public void deepCopy() {
		
		int[] arr= {1,2,3,4,5};
		
		//for문을 이용한 깊은 복사
		int[] copyArr1 = new int [arr.length];
		for(int i=0;i<arr.length;i++) {
			copyArr1[i]=arr[i];
		}
		System.out.println("arr 주소 : "+arr);
		System.out.println("copyArr1 주소 : "+copyArr1);
		
		System.out.println("arr : "+Arrays.toString(arr));
		System.out.println("copyArr1 : "+Arrays.toString(copyArr1));
		
		//System.arraycopy(원본배열,원복복사 시작 인덱스, 복사배열명,복사배열 삽입 시작 인덱스,복사길이)
		int[] copyArr2= new int[arr.length];
		System.arraycopy(arr, 0, copyArr2, 0, arr.length);
		
		System.out.println("copyArr2 : "+Arrays.toString(copyArr2));
		
		//복사할 배열의 참조변수 = Arrays.copyOf(원본배열명, 복사할 길이);
		int[] copyArr3 = Arrays.copyOf(arr, arr.length);
		System.out.println("copyArr3 : "+Arrays.toString(copyArr3));
		
		//값 변경 후 확인
		
		copyArr1[4]=0;
		copyArr2[4]=9;
		copyArr3[4]=5000;
		
		System.out.println("arr : "+Arrays.toString(arr));
		System.out.println("copyArr1 : "+Arrays.toString(copyArr1));
		System.out.println("copyArr2 : "+Arrays.toString(copyArr2));
		System.out.println("copyArr3 : "+Arrays.toString(copyArr3));
		
		
	}
	
	//로또 번호 생성기
	//배열을 이용한 중복데이터 제거 + 정렬
	public void creatLootoNumber(){
		
		//1~45 사이 중복되지 않은 난수 6개 생성
		//생성된 난수가 오름차순 정렬
		//[5,11,13,18,24,25]
		
		//정수 6개를 저장할 배열 선언 및 할당
		int[] lotto = new int[6];
		
		//생성된 배열 순차접근하는 for문 작성
		for(int i=0; i<lotto.length;i++) {
			
			//1~45 난수 생성
			int random=(int)(Math.random()*45+1);
			
			//생성된 난수 순서대로 배열요소에 대입
			lotto[i]=random;
			
			//중복 검사를 위한 중첩for문
			for(int x=0;x<i;x++) {
				
				//현재 생성된 난수와 같은 수가 앞쪽 요소에 있는지 확인
				if(random==lotto[x]) {
					i--;//i가 중복이면 난수를 새로 생성해야 하므로
						//i값을 인위적으로 감소시켜 중복난수를 덮어쓸 기회 제공
					break;//중복데이터를 발견하면 뒤의 데이터는 추가적으로 검사 할 필요 없다
						//효율을 위해 중복검사 break
				}
			}
		}
		//중복제거된 배열을 정렬
		//자바가 정렬 방법을 제공
		//Arrays.sort(배열명) : 배열 내 요소값들이 오름차순 정렬
		Arrays.sort(lotto);
		
		//결과 출력
		System.out.println(Arrays.toString(lotto));
		
		
		
	}
	
	
	
}
