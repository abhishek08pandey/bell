package com.OneRivet.collection;

import java.util.Iterator;
import java.util.TreeSet;




class Employee{
	
	int id;
	String name;
	
	Employee(int id, String name){
		this.id=id;
		this.name=name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
}
public class TreeSet1 {

	public static void main(String[] args) {

		TreeSet<String> al1 = new TreeSet<String>();
		al1.add("abhi");
		al1.add("jay");
		al1.add("husen");
		al1.add("prinsh");

		System.out.println(al1);
		String ceiling = al1.ceiling("ah");
		System.out.println(ceiling);
		al1.comparator();
		System.out.println(al1);

		Iterator<String> descendingIterator = al1.descendingIterator();
		while (descendingIterator.hasNext()) {
			System.out.println(descendingIterator.next());
		}
		
		Iterator<String> iterator = al1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Employee obj = new Employee(100, "abhishek");
		Employee obj1 = new Employee(101, "pandey");

		TreeSet<Employee> al2 = new TreeSet<Employee>();
		al2.add(obj);
		
		//System.out.println(al2); // It through ClassCastException cause when we insert data it will compare it with old data 
	}

}
