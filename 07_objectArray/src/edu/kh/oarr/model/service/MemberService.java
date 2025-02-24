package edu.kh.oarr.model.service;

import java.util.Scanner;

import edu.kh.oarr.model.vo.Member;

public class MemberService {

	//속성
	private Scanner sc = new Scanner(System.in);
	
	//회원가입한 사람의 정보를 저장해둘 참조변수
	//Member 5칸 객체배열 선언 및 할당
	private Member[] memberArr = new Member[5];
	
	//현재 로그인한 회원의 정보를 저장할 참조변수 선언
	private Member loginMember = null;
	
	public MemberService() {
		
		//memerArr 배열 0,1,2 인덱스 초기화 5개 다 치기 귀찮으니까
		memberArr[0] = new Member("user01","pass01","홍길동",30,"서울");
		memberArr[1] = new Member("user02","pass02","계보린",25,"경기");
		memberArr[2] = new Member("user03","pass03","고길동",45,"강원");
	}
	
	//기능
	//메뉴 출력용 메서드
	public void displayMenu() {
		
		int menuNum = 0;//메뉴선택용 변수 선언
		
		do {
			
			System.out.println("====회원 정보 관리 프로그램 v2====");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 검색(지역)");
			System.out.println("0. 프로그램 종료");
			System.out.println("메뉴 입력 : ");
			menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			
			case 1 : System.out.println(signUp()); break;
			case 2 : System.out.println(login());break;
			case 3 : System.out.println(viewMember());break;
			case 4 : int result = updateMember();
					if(result==1) {
						System.out.println("회원정보가 수정되었습니다");
					}else if(result==0) {
						System.out.println("입력하신 비밀번호가 옳바르지 않습니다");
					}else {
						System.out.println("로그인 후 이용하세요");
					}break;
			case 5 : searchRegion(); break;
			case 0 : System.out.println("프로그램 종료...."); break;
			default : System.out.println("번호를 잘못 입력하였습니다");
			}
		}while(menuNum!=0);
		
	}
	
	//memberArr의 비어있는 인덱스 번호를 반환하는 메서드
	//단, 비어있는 인덱스가 없다면 -1 반환
	public int emptyIndex() {
		
		for(int i = 0; i<memberArr.length ; i++) {
			if(memberArr[i]==null) {
				return i;
			}
			
		}
		//for문을 진행하여 return이 되지 않은 경우 null이 없다는 뜻이므로 다음 코드 실행
		return -1;
		
		
	}
	
	
	public String signUp() {
		
		System.out.println("\n==========회원가입===========");
		
		//memberArr 배열에 빈자리 있는지 확인
		int index = emptyIndex(); //memberArr배열의 비어있는 인덱스 반환
		
		if(index == -1) {
			return "회원가입이 인원수 초과로 인해 불가능 합니다";
		}
		//회원가입이 가능할 경우
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
		
		System.out.print("지역 : ");
		String region = sc.next();
		
		if(memberPw.equals(memberPw2)) {
			
			//새로운 member객체 생성후 비어있는 memberArr 인덱스에 대입한다
			memberArr[index] = new Member(memberId, memberPw, memberName, memberAge, region);		
			return "회원가입 성공";
		}else {
			return "비밀번호 불일치";
		}
	}
	
	public String login() {
		//1)아이디 비밀번호 입력받기
		//2)memberArr배열 내 요소를 순서대로 접근하여 null이 아닌지 확인
		//3)정보가 있다면 아이디 비밀번호 비교
		//같다면 로그인 회원정보 객체를 참조할 변수 loginMember에 현재 접근중인
		//memberArr[i] 요소에 저장된 주소를 얕은 복사
		//로그인 성공 : memberName 님 환영합니다
		//로그인 실패 : 아이디 또는 비밀번호가 일치 하지 않습니다.
		
		System.out.print("아이디 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		
		for(int i = 0; i<memberArr.length; i++) {
			
			if(memberArr[i]!=null) {
				
			
			if(memberArr[i].getMemberId().equals(memberId) && 
					memberArr[i].getMemberPw().equals(memberPw)) {
				loginMember=memberArr[i];
				return memberArr[i].getMemberName()+"님 환영합니다";
			}
			}
			
		}return "아이디 또는 비밀번호가 일치하지 않습니다";
	}
	
	
	public String viewMember() {
		
		System.out.println("====회원 정보 조회====");
		
		if(loginMember==null) {
			return "로그인을 먼저 진행해주세요";
		}
		return "\n아이디 : "+loginMember.getMemberId()+
				"\n이름 : "+loginMember.getMemberName()+
				"\n나이 : "+loginMember.getMemberAge()+"\n지역 : "+loginMember.getRegion();
		
	}
	
	
	//회원 검색(지역)
	public void searchRegion() {
		System.out.println("\n======회원 검색(지역)======");
		System.out.println("검색할 지역을 입력하세요 : ");
		String inputRegion = sc.next();
		
		//검색결과 신호용 변수
		boolean flag = true;
		//memberArr배열의 모든 요소 순차 접근
		//memberArr[i]요소가 null이라면 반복 종료
		//memberArr[i]요소가 null이 아니라면 저장된 지역과 입력받은 지역의 동일 비교
		//동일할 경우 회원의 아이디 이름 출력
		//일치하는 회원 없다면 "일치하는 검색 결과가 존재하지 않습니다"출력
		for(int i = 0;i<memberArr.length;i++) {
			if(memberArr[i]==null) {
				break;
			}
			
			if(memberArr[i].getRegion().equals(inputRegion)) {
				System.out.printf("아이디 : %s, 이름 : %s\n",memberArr[i].getMemberId(), memberArr[i].getMemberName());
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println("일치하는 검색 결과가 없습니다");
		}
		
	}
	
	
	//회원 정보 수정 메서드명 : updateMember() int
	//1)로그인이 되어있지 않으면 -1반환
	//2)비밀번호가 다를경우 0반환
	//3)비밀번호가 같을경우 수정하며 1반환
	
	public int updateMember() {
		System.out.println("\n====회원 정보 수정====");
		if(loginMember==null) {
			return -1;
		}
		System.out.println("수정할 이름 입력 : ");
		String newName =sc.next();
		
		System.out.println("수정할 나이 입력 : ");
		int newAge = sc.nextInt();
		
		System.out.println("수정할 지역 입력 : ");
		String newRegion = sc.next();
		
		System.out.println("비밀번호 입력 : ");
		String memberPw2 =sc.next();
		
			if(loginMember.getMemberPw().equals(memberPw2)) {
				loginMember.setMemberName(newName);
				loginMember.setMemberAge(newAge);
				loginMember.setRegion(newRegion);
				return 1;
			}else {
				return 0;
			}
		
	}
	
	
}
