package edu.kh.oop.method.model.vo;

public class Member {
	
	//회원이라면 필요한 속성과 기능
	
	//필드
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	
	//생성자
	//생성자 규칙 : 반환형이 없고, 클래스명과 이름이 같아야한다
	
	public Member() {
		//기본생성자는 없으면 컴파일러가 자동으로 생성해 주지만 매개변수가 존재할 경우 
		//기본생성자는 자동으로 생성해주지 않는다
	}
	
	//모든 필드 초기화용 매개변수 생성자
	public Member(String memberId, String memberPw, String memberName, int memberAge) {
		//오버로딩이 적용
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}




	//메서드
	//getter / setter
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMemberAge() {
		return memberAge;
	}
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	
	
}
