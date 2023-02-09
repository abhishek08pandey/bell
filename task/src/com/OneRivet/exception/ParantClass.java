package com.OneRivet.exception;


class ParantClass2 {
	
	public static void test2() throws Exception {
		try {
			int i = 10/0;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("parantclass 2nd ");
	}
}
public class ParantClass extends ParantClass2 {

	public static void test() throws Exception{
		
//		try {
//			int i = 10/0;
//			
//		} catch (RuntimeException e) {
//			e.printStackTrace();
//		}
//		
		try {
			test2();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		int i = 10/0;
		System.out.println("next line of code");
	}
}
