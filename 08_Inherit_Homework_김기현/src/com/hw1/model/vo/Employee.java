package com.hw1.model.vo;

public final class Employee extends Person {

	private int salary;
	private String dept;
	
	Person p = new Person();
	
	public Employee() {}

	

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		
		p.setAge(age);
		p.setHeight(height);
		p.setWeight(weight);
		p.name=name;
		this.salary = salary;
		this.dept = dept;
	}
	

	public String information() {
		return p.information()+" / 급여 : "+salary+" / 부서 : "+dept;
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
