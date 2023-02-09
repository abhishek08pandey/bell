package com.OneRivet.String;

class Field{

	String name;
	String city;
	long mobile;
	
	Field(String name, String city, long mobile){
		this.name=name;
		this.city=city;
		this.mobile=mobile;
	}
	public String toString() {//overriding the toString() method  
		return name+" "+city+" "+mobile;
	}
}
public class ToString {

	public static void main(String[] args) {
		
		String str = "ABC";
		String str1 = "XYZ";
		System.out.println(str1.compareTo(str));
		
		Field field = new Field("Preet", "Vapi", 888888888888l);
		
		System.out.println(field);//compiler writes here s1.toString()  

	}
}
