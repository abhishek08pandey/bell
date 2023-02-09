package com.OneRivet.comparableandcomparator;
import java.util.Iterator;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Branch{
	
	int id;
	String name;
	String designation;
	String city;
	
	Branch(int id, String name, String designation, String city){
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.city=city;
	}
}
class NameField implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Branch b11=(Branch)o1;
		Branch b12=(Branch)o2;
		return b11.name.compareTo(b12.name);
	}
}
class Designation implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Branch b1=(Branch)o1;
		Branch b2=(Branch)o2;
		return b1.designation.compareTo(b2.designation);
	}
}
public class A {

	public static void main(String[] args) {

		List<Branch> list = new ArrayList<Branch>();
		list.add(new Branch(100, "Jay", "student", "vapi"));
		list.add(new Branch(101, "jay", "Intern", "Valsad"));
		list.add(new Branch(103, "Prince", "Professor", "Daman"));
		
		//Collections.sort(list, new NameField());
		
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Branch branch = (Branch)iterator.next();
			//System.out.println(branch.id+" "+branch.name+ " "+branch.designation+ " "+ branch.city);
		}
	}

}
