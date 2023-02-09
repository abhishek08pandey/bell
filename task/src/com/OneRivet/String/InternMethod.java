package com.OneRivet.String;

public class InternMethod {

	public static void main(String[] args) {//intern + String constant pool SCP

		String st= "abhishek";//A string literal always invokes the intern() method, whether one mention the intern() method along with the string literal or not. For example,
		String stt= "abhishek";
		String sr = new String("abhishek");
		String srr = new String("abhishek");
		
		System.out.println(st==stt);//true
		System.out.println(st.equals(stt));//true
		
		System.out.println(sr==srr);//false
		System.out.println(sr.equals(srr));//false
		
		System.out.println("5th : "+ st.contains(srr));//true
		System.out.println(st==sr);//false compare reference/object
		System.out.println(st.equals(sr));//true compare content
		System.out.println();
		
		
		String s = new String("abhi").intern();
		String ss = new String("abhi").intern();
		// Before intern() method
		System.out.println(s.equals(ss));// true
		System.out.println(s == ss);// false

		// After intern() method
		System.out.println(s.equals(ss));// true
		System.out.println(s == ss);// true
		// Both should be use intern() method

		/*
		 * In the above code snippet, the intern() method is invoked on the String
		 * objects. Therefore, the memory is allocated in the SCP. For the second
		 * statement, no new string object is created as the content of str and str1 are
		 * the same. Therefore, the reference of the object created in the first
		 * statement is returned for str1. Thus, str and str1 both point to the same
		 * memory. Hence, the print statement prints true.
		 */
	}

}
