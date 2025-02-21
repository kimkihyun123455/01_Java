package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemberService {

	//필드
	private Scanner sc = new Scanner(System.in);
	
	private Member memberInfo = null; //가입한 회원 정보 저장
	
	private Member loginMember = null;//로그인한 회원 정보 저장
	
	//기능(생성자 메서드)
	
	//메뉴화면 출력 기능
	public void displayMenu() {
		
		int menuNum = 0; //메뉴선택용 변수
		
		//무조건 한번은 수행하도록 do while 문 사용
		
		do {
			
			System.out.println("=====회원 정보 관리 프로그램=====");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			sc.nextLine(); // 입력버퍼에 남은 개행문자 제거용
			
			switch(menuNum) {
			//내가 호출하는 메서드의 return값 생각하기
			case 1 : System.out.println(signUp()); break;
			case 2 : System.out.println(login());break;
			case 3 : System.out.println(selectMember());break;
			case 4 : 
				int result = updateMember();
				
				if(result==-1) {
					System.out.println("로그인 후 이용해주세요");
				}else if(result == 0) {
					System.out.println("회원정보 수정 실패(비밀번호 불일치)");
				}else {
					System.out.println("회원정보가 수정되었습니다");
				}
			
			break;
			case 0 : System.out.println("프로그램 종료..."); break;
			default : System.out.println("잘못 입력하셨습니다. 메뉴에 있는 번호만 입력해주세요!");
			}
			
			
			
			
			
			
		}while(menuNum!=0);//menuNum이 0이되면 반복종료
		
		
		
	}
	
	//회원 가입 기능
	public String signUp() {//아래 return값이 String형태이기 때문에 반환형이 void가 아닌 String이다
		
		System.out.println("\n******회원가입******");
		
		System.out.print("아이디 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		System.out.print("비밀번호 확인 : ");
		String memberPw2 = sc.next();
		
		System.out.print("이름 : ");
		String memberName = sc.next();
		
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		
		//비밀번호, 비밀번호 확인이 일치하면 회원가입
		//일치하지 않으면 실패
		
		if(memberPw.equals(memberPw2)) {
			
			//새로운 회원 객체를 생성
			//Member클래스 이용해서 새로운 객체 생성
			//매개변수생성자 이용
			
			memberInfo = new Member(memberId, memberPw, memberName, memberAge);
			
			return "회원가입 성공!!";
			
			
		}else {
			
			return "회원가입 실패!! (비밀번호 불일치)";
			
			
		}
		
	}
	
	//로그인
	//회원가입이 되어있는 사람이 있는지 없는지 검사
	//내가 입력한 아이디가 사용중인지 확인
	public String login() {
		System.out.println("\n********로그인*********");
		
		//회원가입 했는지 확인
		//==memberInfo가 객체를 참조하고 있는지 확인 null확인
		
		if(memberInfo == null) {//회원가입을 안한 경우
			return "회원가입부터 진행해주세요";
			//return : 현재 메서드를 종료하고 값을 가지고 호출한 메서드로 이동
		}
		
		//회원가입시 해당 라인 도달
		//로그인 기능 수행
		System.out.print("아이디 : ");
		String memberId =sc.next();
		
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		//회원가입 정보(memberInfo)가 참조하는 Member객체에
		//저장된 아이디와 비밀번호가 방금 입력된 아이디, 비밀번호와 동일하면 성공
		//같지 않으면 "아이디 또는 비밀번호 불일치"라고 리턴
		
		//아이디 비번 일치할 경우
		if(memberId.equals(memberInfo.getMemberId())
				&& memberPw.equals(memberInfo.getMemberPw() )) {
			
			//로그인한 사람의 정보를 기억시키기
			//loginMember에 현재 로그인한 사람의 정보 기억시키기
			
			//==loginMember에 memberInfo가 참조하고 있는 객체의 주소 대입
			loginMember=memberInfo;//얕은 복사
			
			//회원가입 정보를 loginMember에 대입하여 
			//어떤 회원이 로그인했는지를 구분할 수 있도록하라
			
			return loginMember.getMemberName()+"님 환영합니다";
		
		}else {
			
			return "아이디 또는 비밀번호가 일치하지 않습니다.";
			
		}
		
		
		
		
	}
	
	//회원정보조회 기능
	//로그인여부 확인
	//로그인했으면 로그인한 사람의 정보를 저장하는 객체에서 정보 얻어오기(이름 아이디 나이)
	//로그인 안했으면 로그인 후 이용해주세요
	
	public String selectMember() {
		
		if(loginMember==null) {
			
			return "로그인 후 이용해주세요";
			
		}else {
			
			//String str = "회원정보조회\n";
			//str+="이름 : "+loginMember.getMemberName();
			//이런식으로 str변수 선언하고 해도 괜찮다
			
			
			return "******회원 정보 조회******\n이름 : "+loginMember.getMemberName()+"\n아이디 : "+loginMember.getMemberId()+"\n나이 : "+loginMember.getMemberAge();
			//str;
		}
		
		
		
	}
	
	//회원정보 수정 기능
	public int updateMember() {
		
		System.out.println("/n******회원 정보 수정******");
		
		//1)로그인 확인
		//로그인이 되어있지 않으면 -1 반환
		if(loginMember==null) {
			return -1;
		}
			//2)로그인이 되어있을 때
			//2-1) 수정할 회원 정보 입력받음(이름, 나이)
		
		System.out.println("수정할 이름 입력 : ");
		String inputName = sc.next();
		
		System.out.println("수정할 나이 입력 : ");
		int inputAge = sc.nextInt();
			//2-2) 비밀번호 일치 확인
		
		System.out.println("비밀번호 입력 : ");
		String inputPw = sc.next();
		
		if(inputPw.equals(loginMember.getMemberPw())) {
			
			//3) 일치하면 로그인한 회원의 이름과 나이를 수정한 정보로 변경후 1반환
			//일치하지 않으면 0반환 비밀번호가 일치하지 않습니다 출력
			loginMember.setMemberName(inputName);
			loginMember.setMemberAge(inputAge);
			
			return 1; 
			
			
		}else {
			//일치하지 않으면 0반환 비밀번호가 일치하지 않습니다 출력
			return 0;
		}
		
		
		
	}
	
	
}
