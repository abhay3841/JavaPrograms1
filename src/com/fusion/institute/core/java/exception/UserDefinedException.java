package com.fusion.institute.core.java.exception;


class EmptyListException extends Throwable{
	String errMsg;
	public EmptyListException(String msg){
		super(msg);
		this.errMsg=msg;
	}
}

public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
				throw new EmptyListException("The list is empty!!");
		}catch (EmptyListException e) {
			// TODO: handle exception
			System.out.println("the exception msg is: "+e.getMessage());
		}
	}

}
