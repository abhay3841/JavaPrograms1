package com.fusion.institute.core.java.exception;

class Parent{
	public void method1() throws IndexOutOfBoundsException{
		//lines of code
	}
}

public class ExceptionHandlingDemo extends Parent{
	//compilation error, child method is throwing parent exception which is not allowed
	@Override
	public void method1() {
		//lines of code
	}
	public static void main(String[] args) {
		ExceptionHandlingDemo child = new ExceptionHandlingDemo();
		child.method1();
	}	
	
}
