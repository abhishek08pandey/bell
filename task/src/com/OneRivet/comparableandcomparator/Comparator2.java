package com.OneRivet.comparableandcomparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Students{
	
	int id;
	String name;
	int age;
	
	Students(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
}
class NameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Students s1 = (Students)o1;
		Students s2 = (Students)o2;
		return s1.name.compareTo(s2.name);
		}
}
class AgeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Students s1 = (Students)o1;
		Students s2 = (Students)o2;
		
		if(s1.age==s2.age)return 0;
		else if(s1.age>s2.age) return 1;
		else return-1;
	}
}

public class Comparator2 {//This is before java 1.8 comparator

	public static void main(String[] args) {
		
		ArrayList<Students> list = new ArrayList();
		list.add(new Students(10, "prince", 26));
		list.add(new Students(9, "jay", 36));
		list.add(new Students(11, "husain", 46));
		
		System.out.println("Let's sort by name");
		
		System.out.println();
		Collections.sort(list, new NameComparator());//Name compare
		Iterator<Students> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			Students next = iterator.next();
			System.out.println(next.id+ " "+ next.name+ " "+next.age);
		}
		System.out.println();
		Collections.sort(list, new AgeComparator());//Age compare
		Iterator<Students> iterator2 = list.iterator();
		
		while (iterator2.hasNext()) {
			Students next = iterator2.next();
			System.out.println(next.id+ " "+ next.name+ " "+next.age);
		}
	}
}