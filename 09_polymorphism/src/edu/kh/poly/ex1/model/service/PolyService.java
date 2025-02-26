package edu.kh.poly.ex1.model.service;

import edu.kh.poly.ex1.model.dto.Car;
import edu.kh.poly.ex1.model.dto.Spark;
import edu.kh.poly.ex1.model.dto.Tesla;

public class PolyService {

	//다형성 확인 예제
	public void ex1() {
		
		//Car 객체 생성
		Car car = new Car();
		
		//Tesla 객체 생성
		Tesla tesla = new Tesla();
		
		//************다형성 적용************
		
		//부모타입 참조변수 = 자식객체 upcasting
		Car car2 = new Tesla();
		//Tesla 객체를 참조하는 변수의 타입이 Car(부모)이기 때문에
		//Tesla 객체가 Car타입의 객체로 변화함
		
		Car car3 = new Spark();
		//Spark 객체를 참조하는 변수의 타입이 Car이기 대문에
		//Spark 객체가 Car 객체로 변화함
	
		//up casting을 완료한 객체는 자신의 고유한 필드, 메서드는 사용이 불가능해진다
		//car2는 Tesla의 batteryCapacity 사용이 불가능해진다
		
		//ex)Car
		car.setEngine("v6 6기통 엔진");
		car.setFeul("휘발유");
		car.setWheel(4);
		//car는 본인의 메서드 모두 사용 가능
		
		//Tesla
		tesla.setEngine("전기모터");
		tesla.setFeul("전기");
		tesla.setWheel(4);
		tesla.setBatteryCapacity(1000000);
		//Tesla는 부모와 본인의 메서드 모두 사용 가능
		
		//car2
		car2.setEngine("전기모터");
		car2.setFeul("전기");
		car2.setWheel(4);
		//car2.setBatteryCapacity(1000000); 이용불가
		
		//car3
		car3.setEngine("경차엔진");
		car3.setFeul("휘발유");
		car3.setWheel(4);
		//car3.setDiscountOffer(0.5); 이용불가
		
		//car2와 car3는 부모타입 참조변수이기 때문에 
		//자식객체의 고유한 필드 메서드가 사용이 불가하다
		
		//다형성을 이용한 객체배열 만들기
		
		//객체배열 : 같은 객체 참조 자료형의 변수를 하나로 묶어서 다룬다
		//다형성을 이용한 객체배열 : 부모타입 참조자료형의 변수를 하나의 묶음으로 다루는 것
		
		Car[] arr = new Car[3]; //부모타입 참조변수 배열 선언 및 할당
		//각 요소는 Car 타입 참조변수다
		arr[0] = car; //Car 주소
		
		arr[1] = car2;//Tesla 주소
		
		arr[2] = car3;//Spark 주소
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i+"번째 인덱스의 엔진"+arr[i].getEngine());
		}
		
		//상속 + 다형성
		//상속 특징 : Car 상속 클래스는 모두 getEngine()을 가지고 있다
		//다형성(업캐스팅) : 부모타입 참조변수 arr[i]로 자식객체를 참조할 수 있다
		
		
	}
	
	//전달받은 Car 또는 자식객체의 엔진, 연료, 바퀴갯수를 출력하는 메서드
	public void printCar(Car temp) {
		//Car temp = c
		//Car temp = t
		//Car temp = s 
		//부모타입 참조변수 = 자식타입객체
		//다형성의 업캐스팅과 형태가 동일하다
		//temp라는 Car타입의 매개변수에는 Car, Tesla, Spark의 주소가 참조될 수 있다
		
		System.out.println("엔진 : "+ temp.getEngine());
		System.out.println("연료 : "+ temp.getFuel());
		System.out.println("바퀴 갯수 : "+ temp.getWheel()+"개");
		System.out.println();
		
		
	}
	
	//매개변수로 전달받은 정숙밧에 따라 Car, Tesla, Spark 객체를 만들어 반환하는 메서드
	public Car creatCar(int num) {
		
		Car result = null;
		
		switch(num) {
		case 1 : result = new Car(); break;
		case 2 : result = new Tesla(); break;
		case 3 : result = new Spark(); break;
		}
		
		return result;
		
	}
	
	//다형성(업캐스팅)을 이용한 매개변수 사용법
	public void ex2() {
		
		Tesla t = new Tesla("전기모터","전기",4,1000000);
		
		Spark s =new Spark("경차엔진","휘발유",4,0.5);
		
		Car c = new Car("경유엔진", "경유", 12);
		
		printCar(t);
		printCar(s);
		printCar(c);
		
		System.out.println("==================================");
		
		//다형성을 사용한 반환형 사용법
		
		//Car[] arr = {new Car(), new Telsa(), new Spark()};
		
		Car[] arr = {creatCar(1), creatCar(2), creatCar(3)};
					   //Car        Tesla        Spark 반환
		
		
		//객체가 어떤타입(자료형)인지 검사
		//instanceof 연산자 : 객체의 자료형을 검사하는 연산자
		//참조하는 객체가 특정 자료형이거나 상속관계인지 확인 true/false 반환
		System.out.println(arr[1] instanceof Tesla);
		System.out.println(arr[1] instanceof Spark);
		System.out.println(arr[1] instanceof Car);
		
		
	}
	
	//다형성(다운캐스팅)을 확인하는 예제
	public void ex3() {
		//다운캐스팅이란?
		//부모타입 참조변수가 자식객체를 참조하는 업캐스팅이 적용되어야 사용 가능
		//부모타입을 자식타입으로 강제 형변환하여 자식객체의 필드 메서드를 사용 가능캐한다
		
		Car c1 = new Tesla("전기모터", "전기", 4, 50000);
		//Tesla를 Car타입으로 업캐스팅했음
		
		System.out.println(((Tesla)c1).getBatteryCapacity());
		//연산의 우선순위로 인해 형변환하는 부분을 ()로 한번 묶어줘야 getter 사용 가능
		
		Tesla t1 = (Tesla)c1;
		System.out.println(t1.getBatteryCapacity());
		
		
		
	}
	
	//다운캐스팅 주의사항
	public void ex4() {
		
		Car c1 = new Tesla();
		//Tesla 객체를 만들어 Car 타입 참조변수 c1에 담음
		
		//Spark s1 =(Spark)c1;
		//업캐스팅은 Tesla로 하고 다운 캐스팅은 Spark로 하고 있음
		//다운 캐스팅 잘못해도 컴파일 에러 발생안함
		//런타임 에러 발생함
		//ClassCastException : 형변환 예외
		
		//해결방법 : instanceof 와 같이 사용
		
		//예외처리 
		if(c1 instanceof Spark) {//c1이 Spark이거나 상속관계라면
			
			Spark s1 = (Spark)c1;
			System.out.println("성공");
		}else {
			System.out.println("실패");
			
		}
		
		
		
		
		
		
		
	}
	
	//바인딩 확인 예제
	public void ex5() {
		//바인딩(Binding)
		//실제 실행할 메서드 코드와 호출하는 코드를 연결시키는 것
		
		Car c1 = new Car("경유엔진", "경유", 8);
		
		System.out.println(c1.toString());
		//Car 객체에 있는 toString() 메서드를 호출
		//정적바인딩
		//컴파일러는 toString() 메서드가 Car에 있는걸로 인식해서
		//c1.toString() 호출코드와 주소코드를 연결
		
		
		//다형성 적용 시 바인딩
		Car c2 = new Spark("경차엔진","휘발유",4,0.5);
		//업캐스팅 적용 : 부모부분만 참조 가능상태
		
		System.out.println(c2.toString());
		//참조변수 c2가 Car 타입이므로
		//toString() 호출코드와 Car의 toString() 메서드 코드를 연결한 정적바인딩상태
		//실행해 보면 자식인 Spark의 toString() 메서드가 호출된다
		//Car타입으로 호출했는데 왜 Spark타입이??
		//컴파일 시에는 부모와 바인딩 == 정적바인딩
		//실행시에는 정적바인딩보다 자식에서 오버라이딩된
		//toString() 메서드가 우선시되어 Spark의 메서드와 바인딩 == 동적바인딩
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
