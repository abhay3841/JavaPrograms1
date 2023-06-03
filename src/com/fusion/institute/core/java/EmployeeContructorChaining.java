package com.fusion.institute.core.java;

public class EmployeeContructorChaining {

	private int id;
	private String name;
	
	public EmployeeContructorChaining() {
		this("John Doe", 999);
		System.out.println("Default Employee Created");
	}
	
	public EmployeeContructorChaining(int i) {
		this("John Doe", i);
		System.out.println("Employee Created with Default Name");
	}
	public EmployeeContructorChaining(String s, int i) {
		this.id = i;
		this.name = s;
		System.out.println("Employee Created");
	}
	public static void main(String[] args) {

		EmployeeContructorChaining emp = new EmployeeContructorChaining();
		System.out.println(emp);
		EmployeeContructorChaining emp1 = new EmployeeContructorChaining(10);
		System.out.println(emp1);
		EmployeeContructorChaining emp2 = new EmployeeContructorChaining("Pankaj", 20);
		System.out.println(emp2);
	}

	@Override
	public String toString() {
		return "ID = "+id+", Name = "+name;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
