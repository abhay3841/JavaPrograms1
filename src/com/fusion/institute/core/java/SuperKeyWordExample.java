package com.fusion.institute.core.java;

class Person {

	private int age;

	public Person() {
		System.out.println("Person Created");
	}

	public Person(int i) {
		this.age = i;
		System.out.println("Person Created with Age = " + i);
	}

}

class Student extends Person {

	private String name;

	public Student() {
		System.out.println("Student Created");
	}

	public Student(int i, String n) {
		super(i); // super class constructor called
		this.name = n;
		System.out.println("Student Created with name = " + n);
	}

}

public class SuperKeyWordExample{
	public static void main(String[] args) {
		Student st;
		st = new Student();
		//Student st = new Student(28, "Vishal");
	}
	
}

