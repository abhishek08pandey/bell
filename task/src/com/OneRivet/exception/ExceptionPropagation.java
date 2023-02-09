package com.OneRivet.exception;

public class ExceptionPropagation {

	public static void main(String[] args) {// ExceptionPropagation:- when a method cen't handle exception than it is
											// transfer that to the calling method

		ExceptionPropagation ep = new ExceptionPropagation();

		try {
			ep.firstMethod();
		} catch (ArithmeticException e) {
			System.out.println("not run");

			e.printStackTrace();
		}
	}

	public void firstMethod() {
		ExceptionPropagation.secondMethod();
	}

	public static void secondMethod() {
		int i = 10 / 0;
	}

}
