package com.OneRivet.exception;

public class JavaNestedTryBlock {

	public static void main(String[] args) {
		//Sometimes a situation may arise where a part of a block may cause one error and the entire block itself may cause another error.
		//In such cases, exception handlers have to be nested.
		
		try {
			
			try {
				int i = 10/0;
				System.out.println("divided by 0");
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
			
			try {
				int x[] = new int[3];//ArrayOutOfBoundException 
				 x[5]=4;    
				System.out.println("ad index");
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
			
		System.out.println("first try block");
		}
		catch (Exception e) {// not run
			e.printStackTrace();
			System.out.println("parant class");
		}
		System.out.println("normal execution flow");
	}

}
