package com.OneRivet.comparableandcomparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Child implements Comparable<Child>{  
int rollno;  
String name;  
int age;  

Child(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
  
public int compareTo(Child st){
	System.out.println("call compare method");
	
	return name.compareTo(st.name);
//if(age==st.age) {
//return 0;  
//}
//else if(age>st.age)  
//return 1;  
//else  
//return -1;  
}
}  
public class ComparableClass {

	public static void main(String[] args) {
		
		ArrayList<Child> al=new ArrayList<Child>();  
		al.add(new Child(101,"vijay",23));  
		al.add(new Child(106,"ajay",27));  
		al.add(new Child(105,"jai",21));
		al.add(new Child(102, "babita", 24));
		
		Collections.sort(al);//it follow comparable or comparator interface it will call compareTo method where age logic is present
		for (Child child : al) {
			System.out.println(child.rollno+" "+child.name+" "+child.age);  
		}
		
		ArrayList<Integer> al1=new ArrayList<Integer>();  
		al1.add(45);
		al1.add(12);
		al1.add(55);
		Collections.sort(al1);//
		System.out.println(al1);
		
	}

}
