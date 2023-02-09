package com.OneRivet.collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable1 {

	public static void main(String[] args) {
		
		Hashtable <Integer, String> hm = new Hashtable<Integer, String>();
		
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul");  

		  System.out.println(hm);
		 System.out.println( hm.get(103));
		 Set<Entry<Integer,String>> entrySet = hm.entrySet();
		 
		 Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		 
		 while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		 System.out.println(hm.keySet());
		 
		 System.out.println(hm.getOrDefault(101, null));
		 System.out.println(hm.getOrDefault(155, "not available"));// if key is not present it print define string
	     
		  System.out.println("before putIfAbsent: "+ hm);
		 hm.putIfAbsent(104,"Gaurav");  
	     System.out.println("Updated Map: "+hm);  
	     //Returns the current value, as the specified pair already exist  
	     hm.putIfAbsent(101,"Vijay");  
	     System.out.println("Updated Map: "+hm);
	     
	     
	}

}
