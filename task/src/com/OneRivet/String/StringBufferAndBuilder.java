package com.OneRivet.String;

public class StringBufferAndBuilder {

	public static void main(String[] args) {

		String s1 = "abhishek";
		System.out.println("Length() method indicate length of String: "+s1.length());
		String s2 = "abhishek";

		String s3 = new String("abhishek");
		String s4 = new String("abhishek");
		
		//Non-Synchronized
		StringBuilder sb1 = new StringBuilder("abhishek");
		StringBuilder sb2 = new StringBuilder("abhishek");
		
		//Synchronized
		StringBuffer sb3 = new StringBuffer("abhishek");
		StringBuffer sb4 = new StringBuffer("abhishek");

		System.out.println("Comparing String to String Object");
		System.out.println(s1 == s3);// false
		System.out.println(s1.equals(s3));// true :cause .equals() method of String class override object class
		
		System.out.println("\nComparing String Object");
		System.out.println("comparing reference variable: " + s3 == s4);// false
		System.out.println("comparing content:s3.equals(s4)-> " + s3.equals(s4));// true

		
		System.out.println("\nComparing StringBuilder");
		System.out.println("Note:-In StringBuilder and Buffer both can't override .euqal() method of Object class");
		System.out.println(sb1 == sb2);// false
		System.out.println("sb1.equals(sb2): "+sb1.equals(sb2));// false

		System.out.println("\nComparing StringBuffer");
		System.out.println(sb3 == sb4);// false
		System.out.println(sb3.equals(sb4));// false

		System.out.println("\nComparing StringBuilder and StringBuffer");
		// System.out.println(sb1==sb3);//Compiletime error we can not compare reference of StringBuffer and StringBuilder
		System.out.println(sb1.equals(sb3));// false :cause cannot override .equals() method
		
		System.out.println("\nComparing String with StringBuilder and StringBffer");
		//System.out.println(s1==sb1);//Compile time error
		//System.out.println(s1==sb3);//Compile time error
		System.out.println(s1.equals(sb1));//false
		System.out.println(s1.equals(sb3));//false
		
		System.out.println("\nConvert StringBuilder and StringBuffer");
		System.out.println(s1.equals(sb1.toString()));//true
		System.out.println(s1.equals(sb3.toString()));//true
		
		System.out.println("StringBuilder and StringBuffer compare refrence variable/Memmory Address");
		System.out.println(sb1.toString());
		sb1 = new StringBuilder("jay");
		System.out.println(sb1==sb1);
		System.out.println(sb1.toString());
		

		
	}

}
