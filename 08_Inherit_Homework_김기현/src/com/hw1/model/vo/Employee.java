package com.hw1.model.vo;

public final class Employee extends Person {

	private int salary;
	private String dept;
	
	Person p = new Person();
	
	public Employee() {}

	

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age,height,weight);
		/*p.setAge(age);
		p.setHeight(height);
		p.setWeight(weight);
		p.name=name;//부모클래스 Person에 작성된 필드 name의 접근제한자가 protected이기 때문에 가능*/
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	@Override
	public String information() {
		return super.information()+" / 급여 : "+salary+" / 부서 : "+dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
