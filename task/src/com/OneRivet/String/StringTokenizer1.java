package com.OneRivet.String;

import java.util.StringTokenizer;

public class StringTokenizer1 {

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("completed java internship from OneRivet");
		System.out.println(st.countTokens());// It count it return int type

		while (st.hasMoreTokens()) {// return in boolean form same as st.hasMoreElement()The 
			//only difference is this class can implement the Enumeration interface.

			//System.out.println(st.nextToken("java"));//it return based on delimiter
			//System.out.println(st.nextElement());//return object
			System.out.println(st.nextToken());//return next token
		}
	}

}
