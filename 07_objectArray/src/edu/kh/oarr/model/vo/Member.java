package edu.kh.oarr.model.vo;

public class Member {

	//속성(필드 == 멤버변수))
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String region; //서울, 경기, 전남..
	
	//기능(메서드와 생성자)
	//생성자(기본 생성자, 매개변수 생성자)
	//생성자 작성 규칙
	//1.생성자 이름은 클래스명과 같다
	//2.반환형이 없다
	//**기본생성자는 컴파일러가 자동으로 생성해주지만 매개변수가 존재할 경우 생성하지 않는다
	
	public Member() {
	}

	//오버로딩 : 같은 클래스 내 동일한 메서드, 생성자명을 이용할 수 있는 기법
	//오버로딩 성립조건 : 매개변수의 개수, 순서, 타입 중 하나라도 달라야한다//생성자명 같아야한다
	public Member(String memberId, String memberPw, String memberName, int memberAge, String region) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.region = region;
	}

	//메서드
	//getter/setter
	//필드에 선언된 멤버변수들이 캡슐화에 의거해 private로 선언되어
	//다른 클래스에서 직접접근이 불가능하여 getter와 setter를 통해
	//간접접근하여 값을 세팅하거나 얻어오게 한다
	//      반환형
	public String getMemberId() {
		return memberId;
		//return memeberId : 해당 메서드를 즉시 종료하고 호출한 곳으로 memberId를 반환한다
	}
	
	public void setMemberId(String memberId) {
		this.memberId = memberId;
		//모든 메서드는 종료 시 호출한 곳으로 돌아가는 return구문이 작성되어 있어야하며
		//void 반환형의 경우 return이 자동추가된다
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
	
	public String getRegion() {
		return region;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
