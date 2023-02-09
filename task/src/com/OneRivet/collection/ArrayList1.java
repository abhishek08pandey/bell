package com.OneRivet.collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

class User {
	int id;
	 String name;
	String city;

	User(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}
}

public class ArrayList1 {


	public static void main(String[] args) {
		
		ArrayList<String> firstList  = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go"));  
		System.out.println("First List: "+firstList);   
		ArrayList<String> secondList = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go", "Perl"));  
		System.out.println("Second List: "+secondList);  
		
		Collections.reverse(secondList);
		System.out.println("reverce list: " +secondList);
		// Finds common elements   
		System.out.println("Common elements: " +firstList.stream().filter(secondList::contains).collect(Collectors.toList())); 
		
		//ARRAY LIST CAN READ ONLY 
		Collection<String> unmodifiableCollection = Collections.unmodifiableCollection(secondList);
		System.out.println(unmodifiableCollection);// here UnsupportedOperationException will throw
		//unmodifiableCollection.add("chcb");
		
		secondList.add("cch");// that way we can change/edit list 
		System.out.println(secondList);
		
//		ArrayList<String> list  = new ArrayList<String>(Arrays.asList("Javac", "Pythofn", "Rubfy", "Gfo"));  
//		  // Synchronizing ArrayList in Java  
//		list = (ArrayList<String>) Collections.synchronizedList(list);  
//  
//        // we must use synchronize block to avoid non-deterministic behavior  
//        synchronized (list) {  
//            Iterator<String> itr = list.iterator();  
//            while (itr.hasNext()) {  
//                System.out.println(itr.next());  
//            }  
//        }  

		ArrayList al = new ArrayList<User>();
		List a2 = new ArrayList();
		al.add(10.3);
		al.add("cgg");
		al.add(true);

		System.out.println(al);
		int indexOf = al.indexOf("cgg");//give a index number

		System.out.println(indexOf);
		al.clear();
		User u1 = new User(100, "abhi", "valsad");
		User u2 = new User(101, "abhishek", "valsad");

		
		al.add(u1);
		al.add(u2);
		
		System.out.println("let seee ");
		Iterator iterator = al.iterator();
		//System.out.println(iterator.next());
		//System.out.println(iterator.next());
		
		while (iterator.hasNext()) {
			//System.out.println(iterator.next());
			User next1 = (User)iterator.next();
			System.out.println(next1.id +", "+ next1.name+ ", " + next1.city);
		}
		
		System.out.println(al);
		System.out.println(u1.id + u1.name + u1.city);
		System.out.println(al.contains(u2));

		
		al.add(0, 151);
		System.out.println(al);

		al.addAll(al);
		System.out.println(al);// same object add by this method

		al.clear();
		System.out.println(al);
		al.add(5345);
		al.add(5358545);
		al.add(5345);
		System.out.println(al);
		a2.add(5345);
		boolean contains = al.contains(5345);
		System.out.println(contains);

		al.get(0);
		System.out.println(al);
		
		boolean empty = al.isEmpty();
		System.out.println(empty);
		
	
		
		Object remove = al.remove(0);
		System.out.println(remove);
		System.out.println(a2);
		System.out.println(al);// before removeall we have both int value 
		System.out.println(a2);
		boolean removeAll = al.removeAll(a2);// it will remove al element which is same in a2
		System.out.println(removeAll);
		System.out.println(al);
		System.out.println(a2);
		
		Object set = al.set(0, 6000045);
		System.out.println(set);
		al.isEmpty();
		al.add(1165131);
		al.add(444);
		Collections.sort(al);// collections is utility class which is used for sorting
		System.out.println("After  Sorting: "+ al);
		
		Collections.sort(al, Collections.reverseOrder());   
		// Print the sorted ArrayList   
		System.out.println("After reverse Sorting: "+ al);   

		Queue a = new ArrayDeque<>();
		a.add(656);
		a.add(2);
		a.add(56);
		a.add(10);
		
		a.add(5);
		 //a.add("bhs");//that should be homogenious
		//Collections.sort(a);
		System.out.println(a);
	}

}
