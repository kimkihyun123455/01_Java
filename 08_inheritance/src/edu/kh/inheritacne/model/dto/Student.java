package edu.kh.inheritacne.model.dto;

//Student 클래스가 Person 클래스 상속
public class Student extends Person {
	//Student 클래스에 Person 클래스의 필드,메서드를 추가하여 확장한다
	
	//Object-Person-Student로 상속중
	
	
	//속성
	/*private String name;
	private int age;
	private String nationality;*/ //Person이 지닌 코드를 사용하면 되기 때문에 필요 없음
	private int grade;
	private int classRoom;
	
	public Student() {}
	
	public Student(String name, int age, String nationality, int grade, int classRoom) {
		
		//왜 안될까?
		//this 참조변수는 본인만을 의미한다. 즉 본인의 name변수가 없기 때문에 불가능
		//물려받은거지 본인이 만든게 아니잖아
		/*this.name=name;
		this.age=age;
		this.nationality()=nationality;*/
		/*setName(name);
		setAge(age);
		setNationality(nationality);*/
		//부모의 setter를 사용은 가능하지만 비효율적이다
		
		super(name, age, nationality);//Person의 매개변수 생성자 호출
		this.grade = grade;
		this.classRoom = classRoom;
	}



	//기능
	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}*/
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	@Override //부모클래스인 Person에서 toString을 먼저 재정의 했기때문에 Person클래스의 toString이 나온다
	public String toString() {
		return super.toString()+" / "+grade+" / "+classRoom;
	}
	
	//이름 나이 국적 학년 반 출력
	
	
	
	
	
}
