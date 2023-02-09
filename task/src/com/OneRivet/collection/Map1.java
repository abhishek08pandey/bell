package com.OneRivet.collection;

import java.util.*;
import java.util.Map.Entry;

public class Map1 {

	public static <V> void main(String[] args) {
		
		Map<Integer , String> map = new HashMap<Integer , String>();
		
		map.put(1, "abhi");
		map.put(2, "shek");
		map.put(3, "jay");
		//	System.out.println(map);
		
//		for (Entry<Integer, String> string : map.entrySet()) {
//			System.out.println(string.getKey()+ " " + string.getValue());
//		}
//		
		Map<Integer , String> mapp = new HashMap<Integer , String>();
		mapp.put(101, "husen");
		mapp.put(102, "dharshi");
		mapp.put(103, "pratik");
		mapp.put(104, "pratik");
		
		map.putAll(mapp);
		
		for (Map.Entry<Integer, String> string : map.entrySet()) {
			System.out.println(string.getKey()+ " " + string.getValue());
		}
//		
//		//map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);//comparing by key
//		
//		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);//comparing by key Reverse
//		
//		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);// comparing by value
//		
//		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);//comparing by reverse value
//		
//		System.out.println(map);
//		//Iterator <Integer> it =  map.entrySet().iterator();
		
//		Iterator<Integer> it = map.keySet().iterator();
//		
//		while (it.hasNext()) {
//			int key =(int) it.next();
//			System.out.println("key no: "+ key + ", name: " + map.get(key));
//		}
		
		 //2nd
		 for (Integer key : map.keySet()) {
			System.out.println( "key : " +key);
			
			
		}
		for (String string : map.values()) {
			System.out.println( " name: "+ string);
		}

	}
}
