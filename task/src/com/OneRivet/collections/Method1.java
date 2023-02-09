package com.OneRivet.collections;
import java.util.*;
public class Method1 {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<String>();
		list.add("abhishek");
		list.add("Hushain");
		System.out.println("Only list Use: "+list);
		
		Collections.addAll(list, "Price", "Jay", "Dev");
		System.out.println("Afetr Collections addAll() method use: "+list);
		
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		
		Stack<String> stk= new Stack<>();  
		//pushing elements into Stack  
		stk.push("Mac Book");  
		stk.push("HP");  
		stk.push("DELL");  
		stk.push("Asus");  
		System.out.println("Stack: " + stk);  
		// Search an element  
		int location = stk.search("HP");  
		System.out.println("Location of Dell: " + location);  
	}

}
