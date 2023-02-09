package com.OneRivet.ConCurrentHashMap;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConCurrentHashMap {

	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer, String> conMap = new ConcurrentHashMap<>();
		conMap.put(101, "abhi");
		conMap.put(100, "Husain");
		conMap.put(99, "Jay");
		 conMap.forEach( (k, v) -> System.out.printf("    k: %s, v: %s%n", k, v));  
		System.out.println(conMap);
		System.out.println(conMap.contains("Husain"));//check values print true
		System.out.println(conMap.containsKey(100));
		System.out.println(conMap.containsValue("Husain"));

		conMap.compute(101, (key, val)->val+"shek");//it will compute/change with input
		System.out.println(conMap);
		
		conMap.computeIfAbsent(102, k->"Dharshi");//it key not present than it add key+value
		System.out.println(conMap);
		
		conMap.computeIfAbsent(101, k->"hi");//first it will check key present than it can't change
		System.out.println(conMap);
		
		conMap.computeIfPresent(99, (key, val)->"jay patel");
		System.out.println(conMap);
		
		Enumeration<String> elements = conMap.elements();
		while (elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
		
		System.out.println("key through get value: "+conMap.get(101));//key through get value
		System.out.println(conMap.keySet());
		System.out.println(conMap.keySet("jay patel"));
		
		 ConcurrentHashMap<Integer, String>  conmap = new ConcurrentHashMap<Integer, String>();  
         conmap.put(1, "Java");  
         conmap.put(2, "php");  
         conmap.put(3, ".net");  
         conmap.put(5, "python");  
         ConcurrentHashMap<Integer, String>  conmap2 = new ConcurrentHashMap<Integer, String>();  
         conmap2.put(1, "Java");  
         conmap2.put(2, "C++");  
         conmap2.put(3, "Rubi");  
         conmap2.put(5, "Java Script");  
        
         conmap2.forEach(  
                 (key, value) -> conmap.merge( key, value, (v1, v2) -> v1.equalsIgnoreCase(v2) ? v1 : v1 + "," + v2)  
                          );  
                 System.out.println(conmap);
          
         System.out.println("\nbefore putAll: "+conmap);
         conmap.putAll(conmap2);
         System.out.println("\nAfter putAll: "+conmap);//replace all keys value
         
          //newKeySet();method
	      Set<String> hashmap = ConcurrentHashMap.newKeySet();  
	      hashmap.add("AA");  
	      hashmap.add("BBB");   
	      hashmap.add("CCC");
	      hashmap.add("DDD");    
	      System.out.println(" Mappings : "+ hashmap);   
	     
	}

}
