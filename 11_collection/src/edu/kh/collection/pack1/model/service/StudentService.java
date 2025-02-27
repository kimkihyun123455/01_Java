package edu.kh.collection.pack1.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.pack1.model.dto.Student;

public class StudentService {

	//java.util.List 인터페이스 : List에 반드시 필요한 필수 기능을 모아둔 인터페이스
	//*인터페이스는 객체 생성이 불가능, 부모 참조변수로서 역할
	
	//java.util.ArrayList : 배열 형태의 List로 가장 대표적인 List의 자식 클래스이다
	
	//new ArrayList() : 기본 생성자 -> 기본크기 10의 리스트 생성
	//하지만 리스트의 크기는 필요에 따라 변동이 있기 때문에 큰 의미 없다
	
	//학생 정보를 저장한 List 생성
	
	private List<Student> studentList = new ArrayList<>();
	//     ArrayList를 사용해도 괜찮으나 후에 객체를 바꿔야 할 때 부모클래스는 안 바꿔도
	// 괜찮으므로 부모클래스인 List를 쓰는걸 추천
	// 다형성 중 업캐스팅 적용
	//부모타입(List) 참조변수(studentList) = 자식객체(ArrayList) 주소
	
	private Scanner sc = new Scanner(System.in);
	
	public StudentService() {
		
		studentList.add(new Student("홍길동", 23, "서울시 중구", 'M',100));
		studentList.add(new Student("고영희", 23, "경기도 안산시", 'F',100));
		studentList.add(new Student("강아지", 30, "서울시 강남구", 'M',80));
		studentList.add(new Student("오미나", 27, "충북 청주시", 'F',80));
		studentList.add(new Student("박주휘", 24, "서울시 서대문구", 'F',70));
		
		
		
	}
	
	
	
	
	
	/*private List<Object> testList = new ArrayList<>();
	
	public void ex() {//List 테스트용 예제
		
		//List.add(Object e) : 리스트에 객체를 추가
		//매개변수 타입이 Object == 모든 변수 매개변수로 전달 가능
		
		testList.add("문자열");
		testList.add(new Student("홍길동",25,"서울시 중구",'M',90));
		testList.add(sc);
		testList.add(new Object());
		
		//컬렉션 특징 : 여러 타입의 데이터를 저장할 수 있다
		
		//Object List.get(index) : List에서 index번째 객체를 반환한다
		//반환형이 Object == 모든 객체를 반환할 수 있다
		
		System.out.println(testList.get(0));
		System.out.println(testList.get(1));
		System.out.println(testList.get(2));
		System.out.println(testList.get(3));
		
		//tesstList에 꺼내온 인덱스 요소가 Student 혹은 상속관계인지 검사
		//Student라면 이름을 꺼내온다
		
		for(Object e: testList) {
			
			if(e instanceof Student) {
				System.out.println(((Student)e).getName());
			}
			
			
		}
		
		
	}*/
	
	//메뉴출력용 메서드
	/**
	 * alt + shift + j : 메서드 설명용 주석
	 * @author 김기현(kimkihyun123455@gmail.com)
	 */
	public void displayMenu() {
		
		int menuNum = 0; //메뉴 선택용 변수
		
		do {
			System.out.println("\n==========학생 관리 프로그램===========");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 학생 정보 전체 조회");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 제거");
			System.out.println("5. 이름으로 검색(일치)");
			System.out.println("6. 이름으로 검색(포함)");
			System.out.println("7. 나이순으로 정렬"); //Comparable 사용
			System.out.println("8. 이름순으로 정렬"); //Comparator 사용
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 번호를 입력하세요 : ");
			
			try {
				menuNum = sc.nextInt();
				sc.nextLine(); //입력버퍼 개행문자 제거용
				
				switch(menuNum) {
				case 1 : System.out.println(addStudent()); break;
				case 2 : selectAll(); break;
				case 3 : System.out.println(updateStudent()); break;
				case 4 : System.out.println(removeStudent()); break;
				case 5 : System.out.println(searchName1()); break;
				case 6 : /*searchName2();*/ break;
				case 7 : /*sortByAge();*/ break;
				case 8 : /*sortByName();*/ break;
				case 0 : System.out.println("프로그램 종료...");break;
				default : System.out.println("메뉴에 작성된 번호만 입력하세요!");
				}
				
			}catch(InputMismatchException e) {
				System.out.println("\nerror : 입력형식이 유효하지 않습니다. 다시 시도해주세요" );
				
				sc.nextLine(); //입력버퍼에 남아있는 잘못된 코드 제거
				
				menuNum=100;
				//첫 반복시 잘못 입력하는 경우 menuNum이 0을 지녀 반복문이 종료되므로 입력형식이 잘못 되었을 때
				//menuNum의 값을 변동시킨다
			}
			
			
			
		}while(menuNum!=0);
		
	}
	
	/**
	 * 1.학생 정보 추가 메서드
	 * 
	 * @return 삽입 성공 시 "성공", 실패 시 "실패" 문자열 출력
	 */
	public String addStudent() {
		//Checked Exception : 반드시 throws 구문이나 try-catch 처리 강제
		
		//Unchecked Exception : 강제성이 없기 때문에 예외발생 시 상위호출된 메서드로 예외가 전파된다
		
		
		System.out.println("==========학생 정보 추가===========");
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("거주지역을 입력하세요 : ");
		String region = sc.nextLine();
		
		System.out.print("성별을 입력하세요 : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		//Student 새 객체 생성 후 studentList에 추가
		if(studentList.add(new Student(name, age, region, gender, score))) {
			
			return "성공";
			
		}else {
			
			return "실패";
		}
		
		
		
	}
	
	
	
	/**
	 * 2.학생 전체 조회 메서드
	 * 
	 * List가 비어있는 경우 "학생 정보가 없습니다" 출력
	 * 있는 경우 전체 학생 출력
	 */
	public void selectAll() {
		System.out.println("==========학생 전체 조회==========");
		
		//studentList가 비어있는지 확인
		//List에 저장된 데이터의 개수 : int List.size();
		
		//if(studentList.size() == 0) {
		//boolean List.isEmpty() : 컬렉션이 비어있다면 true 반환	
		if(studentList.isEmpty()) {
			
			System.out.println("학생 정보가 없습니다");
			return; // 현재 메서드를 종료하고 호출한 곳으로 돌아간다
		}
		
		//일반 for문
		/*for(int i =0; i<studentList.size(); i++) {
			
			System.out.println(studentList.get(i));
			
		}*/
		
		//향상된 for문
		//컬렉션, 배열의 모든 요소를 순차적으로 반복접근 할 수 있는 for문
		
		int index =0;
		for(Student std :studentList) {
			System.out.print((index++)+"번 : ");
			System.out.println(std);
		}
		
		
	}
	
	
	/**
	 * 3.학생 정보 수정 메서드
	 * 
	 *학생 정보가 studentList에 하나라도 있는지 검사
	 *없다면 "입력된 학생정보가 없습니다" 반환
	 *입력된 숫자가 0보다 작으면 "음수는 입력할 수 없습니다" 반환
	 *studentList 범위 내 인덱스인지 검사 초과했다면 " 범위를 넘언선 값을 입력할 수 없습니다"
	 *
	 *수정할 때는 
	 *수정 전 정보를 출력
	 *이름, 나이, 거주지, 성별, 점수 수정값 입력
	 *
	 *수정 완료시 "000의 정보가 변경되었습니다" 반환
	 */
	public String updateStudent() {
		System.out.println("==========학생 정보 수정==========");
		
		System.out.println("인덱스 번호 : ");
		int index = sc.nextInt();
		
		//1) 학생 정보가 studentList에 하나라도 있는지 검사
		if(studentList.isEmpty()) {
			return "입력된 학생 정보가 없습니다";
			
		}else if(index<0) {
			return "음수는 입력할 수 없습니다";
			
		}else if(index>=studentList.size()) {
			return "범위를 넘어선 값을 입력할 수 없습니다";
			
		}else {
			//수정코드 작성
			//1.index번째에 저장된 학생 정보 출력하기
			System.out.println(index+"번째에 저장된 학생 정보");
			System.out.println(studentList.get(index));
			
			//2.
			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();
			
			System.out.print("나이를 입력하세요 : ");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.print("거주지역을 입력하세요 : ");
			String region = sc.nextLine();
			
			System.out.print("성별을 입력하세요 : ");
			char gender = sc.next().charAt(0);
			
			System.out.print("점수를 입력하세요 : ");
			int score = sc.nextInt();
			
			//입력받은 index번째에 수정할 학생정보를 세팅 -> 수정
			//index번째에 있던 기존 학생 정보가 반환되고 이를 temp에 저장
			Student temp = studentList.set(index, new Student(name,age,region,gender,score));
			
			return temp.getName()+"님의 정보가 변경되었습니다";
			
			
		}
		
		
		
		
		
		
		
	}
	
	
	/**
	 * 4.학생 정보 제거 메서드
	 * 
	 *학생 정보가 studentList에 하나라도 있는지 검사
	 *없다면 "입력된 학생정보가 없습니다" 반환
	 *입력된 숫자가 0보다 작으면 "음수는 입력할 수 없습니다" 반환
	 *studentList 범위 내 인덱스인지 검사 초과했다면 " 범위를 넘언선 값을 입력할 수 없습니다"
	 *
	 *제거할 때는 "정말 삭제하시겠습니까? (y/n)"출력
	 *y 입력시 해당 인덱스에 있는 객체 삭제후
	 *"000님의 정보가 삭제되었습니다"리턴
	 *n 입력시 "취소"리턴
	 *
	 *
	 */
	public String removeStudent() {
		
		//Student List.remove(int index) : 리스트에서 index번째 요소를 제거하며 제거한 요소 반환
		//List 중간에 비어있는 인덱스가 없게 하기 위해서 
		//remove() 동작 시에 뒤쪽 요소 자동으로 당겨줌
		
		System.out.println("==========학생 정보 제거==========");
		
		System.out.print("인덱스 번호를 입력하세요 : ");
		int index = sc.nextInt();
		
		if(studentList.isEmpty()) {
			return "입력된 학생정보가 없습니다";
		}
		if(index<0) {
			return "음수는 입력할 수 없습니다";
		}
		if(index>=studentList.size()) {
			return "범위를 넘어선 값을 입력할 수 없습니다";
		}
		
		//4)삭제
		System.out.println("정말 삭제하시겠습니가? (Y/N)");
		char ch = sc.next().toUpperCase().charAt(0);//입력받은 문자를 대문자로 변환후 char 형태로 변환
		
		if(ch=='Y') {
			Student temp = studentList.remove(index);
			return temp.getName() + "님의 정보가 제거되었습니다";
			
		}
		return "취소";
	}
	
	public String searchName1() {
		System.out.print("검색하려는 이름을 입력하세요 : ");
		String name = sc.next();
		
		String searchName ="";
		for(Student str:studentList) {
			
			if(str.getName().equals(name)) {
				searchName+=str;
				return searchName;
			}
			
		}return "일치하는 이름이 없습니다";
		
	}
	
	public String searchName2() {
		
	}
	
	public void sortByAge() {
		
		for(Student str : studentList) {
			
			
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
