package com.OneRivet.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class AllIterator {

	public static void main(String[] args) {
		
		List list = new ArrayList();//define initially capacity
		
		list.add("Ajay");
		list.add("Bubble");
		list.add("baloon");
		//list.removeIf(str -> ((String) str).contains("Ajay")); //here we use lambda expression
		list.add("manoj");
		list.add("suresh");
		list.add("pple"); 
		list.add("zoo");
		System.out.println(list.size());
		//Collections.sort(list);//it will print in ascending order
		Collections.sort(list, Collections.reverseOrder());//it will print reverse elements
		
		
		System.out.println(list);
		
		System.out.println("List when we insert all elements: " +list+ "\n");
		
		System.out.println("1st way to iterate collection with use of Iterator Interface"+ "\n");
		
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("2nd way to iterate collection with use of ListIterator Interface"+ "\n");
		ListIterator listIterator = list.listIterator(list.size());
		while (listIterator.hasPrevious()) {
			//list.add("list"); // it will through concurrentModification Exception
			System.out.println(listIterator.previous());
		}
		System.out.println("3rd way to iterate collection with use of forEach loop"+ "\n");
		
		for (Object object : list) {
			System.out.println(object);
		}
		
		System.out.println("4th way to use forEach Method ");
		list.forEach(a->{System.out.println(a);});//lambda Expression

		System.out.println("5th way to iterate by forEachremaining(); method"+ "\n");
		Iterator iterator2 = list.iterator();
		iterator2.forEachRemaining(a->{System.out.println(a);});
		
		System.out.println("6th way to iterate by for-loop"+ "\n");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("List to Array");
//		String[] array = (String[]) list.toArray(new String[list.size()]);
//		
//		for (String object : array) {
//			System.out.println(object);
//		}
		
	}

}
