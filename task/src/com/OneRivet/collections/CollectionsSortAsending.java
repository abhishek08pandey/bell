package com.OneRivet.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	int id;
	String name;
	String city;

	Student(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public String toString() {// r problem
		return this.id + " " + this.name + " " + this.city;
	}
}

class SortById implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.id - o2.id;
	}
}

class SortByName implements Comparator<Student> {
	
	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
}

public class CollectionsSortAsending {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(15);
		list.add(656);
		list.add(2);
		list.add(56);
		list.add(10);
		System.out.println("Before Collections Sort Method: " + list);

		Collections.sort(list);
		System.out.println("After Collection Sort in Ascending: " + list);

		Collections.sort(list, Collections.reverseOrder());
		System.out.println("After Collection Sort in Descending: " + list);

		List<Student> arrayList = new ArrayList<Student>();

		arrayList.add(new Student(10, "abhi", "valsad"));
		arrayList.add(new Student(8, "husain", "vapi"));
		arrayList.add(new Student(11, "prince", "daman"));
		arrayList.add(new Student(9, "Jay", "Valsad"));

		// Normal printing
		System.out.println("Student details");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		System.out.println("Reverse Sorting based on Student id");
		Comparator<Student> comparator = Collections.reverseOrder(new SortById());
		Collections.sort(arrayList, comparator);

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("Reverse Sorting based on Student name");
		Comparator<Student> com2 = Collections.reverseOrder(new SortByName());
		Collections.sort(arrayList, com2);

		for (int j = 0; j < arrayList.size(); j++) {
			System.out.println(arrayList.get(j));
		}
	}
}
