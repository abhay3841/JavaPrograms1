package com.fusion.institute.core.java.exception;

import java.awt.image.SampleModel;
import java.io.IOException;

public class ExceptionDemo {
	private static int num1 = 34;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ExceptionDemo demo = new ExceptionDemo();
			demo.addition();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	public int addition() throws IOException,ArithmeticException{
		int result=0;
		sampleMethod();
		result = 23+24;
		throw new IOException();
	}
	
	public void sampleMethod() throws ArithmeticException{
		throw new ArithmeticException();
	}

}



