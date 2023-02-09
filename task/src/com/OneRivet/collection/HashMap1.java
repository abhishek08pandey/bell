package com.OneRivet.collection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
	
		HashMap<Integer, String> hash = new HashMap<Integer, String>(122);
		hash.put(11, "kartik");
		hash.put(12, "kartik");
		hash.put(13, "pratik");
		hash.put(16, null);
		hash.put(17, null);
		
		System.out.println(hash.entrySet());
		//hash.clear();
		
		for (Entry<Integer, String> string : hash.entrySet()) {
			System.out.println(string.getKey() + " " + string.getValue());
		}
		
		Set<Integer> keySet = hash.keySet();
		System.out.println(keySet);
		Collection<String> values = hash.values();
		System.out.println(values);
		System.out.println(hash.entrySet());

		System.out.println(hash.containsValue(null));
		
		System.out.println(hash.replace(11, "war"));// it change and print old value
		//hash.replaceAll((k,v) -> "Ajay");//it change all element with same ajay name
		System.out.println(hash.entrySet());
		
		System.out.println(hash.replace(11, "war", "pop"));//it change old value and return boolean answers 
		System.out.println(hash.entrySet());
	}

}
