package com.fusion.institute.core.spring.java;

public class DependecyInjetionExample {
	
	public static void main(String[] args) {
		DependencyServiceImpl impl = new DependencyServiceImpl();
		System.out.println(impl.method1());
	}

}

interface DependencyService{
	public String method1();
}

class DependencyServiceImpl implements DependencyService{
String result = "this is Service implementation!!";
	@Override
	public String method1() {
		// TODO Auto-generated method stub
		return this.result;
	}
	
}
