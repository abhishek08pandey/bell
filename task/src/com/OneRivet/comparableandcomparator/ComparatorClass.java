package com.OneRivet.comparableandcomparator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student{
	
	int id;
	String name;
	int marks;
	
	Student(int id, String name, int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
public class ComparatorClass {//This is after java 1.8 comparator

	public static void main(String[] args) {
		
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(100, "husain", 95));
		arrayList.add(new Student(101, "jay", 66));
		arrayList.add(new Student(10, "abhishek", 950));
		
		Comparator<Student> comparing = Comparator.comparing(Student::getName);//Lambda Expression
		Collections.sort(arrayList, comparing);
		
		for (Student student : arrayList) {
			System.out.println(student.name+" "+ student.id);
		}
		
		List<Student> list = new LinkedList<Student>();
		list.add(new Student(50, "husain", 9005));
		list.add(new Student(1000, "jay", 66));
		list.add(new Student(150, "abhishek", 950));
		
		Comparator<Student> com = Comparator.comparing(Student::getMarks);//Lambda Expression
		Collections.sort(list, com);
		
		Iterator<Student> iterator = list.iterator();
		while (iterator.hasNext()) {
			//System.out.println(iterator.next());
			Student student = (Student) iterator.next();
			System.out.println(student.id+ " "+ student.name+ " "+ student.marks);
		}
	}

}
