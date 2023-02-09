package com.OneRivet.collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.NavigableMap;
import java.util.SortedMap;

public class TreeMap1 {

	public static void main(String[] args) {
		
		TreeMap map = new TreeMap();
	
		map.put(102, "prince");
		map.put(101, "husain");
		map.put(110, "jay");
		System.out.println(map);
		
		Set keySet = map.keySet();
		System.out.println(keySet);
		
		Entry ceilingEntry = map.ceilingEntry(104);//it return >= key-value
		System.out.println(ceilingEntry);
		
		System.out.println(map.descendingKeySet());//reverse key 
		System.out.println(map.descendingMap());//reverse map
		
		System.out.println(map.firstEntry());//return first top element 
		
		System.out.println(map.navigableKeySet());//only key
		System.out.println(map.get(102));
		System.out.println(map.firstKey());		
		System.out.println(map.size());
		System.out.println(map.values());
		System.out.println(map.containsValue("husain"));
		
		//Navigable map
		 NavigableMap<Integer,String> maps=new TreeMap<Integer,String>();    
	      maps.put(100,"Amit");    
	      maps.put(102,"Ravi");    
	      maps.put(101,"Vijay");    
	      maps.put(103,"Rahul");    
	      //Maintains descending order  
	      System.out.println("descendingMap: "+maps.descendingMap());  
	      //Returns key-value pairs whose keys are less than or equal to the specified key.  
	      System.out.println("headMap: "+maps.headMap(102,true));  
	      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	      System.out.println("tailMap: "+maps.tailMap(102,true));  
	      //Returns key-value pairs exists in between the specified key.  
	      System.out.println("subMap: "+maps.subMap(100, false, 102, true));   
	      
	      //Sorted Map
	      SortedMap<Integer,String> map1=new TreeMap<Integer,String>();    
	      map1.put(100,"Amit");    
	      map1.put(102,"Ravi");    
	      map1.put(101,"Vijay");    
	      map1.put(103,"Rahul");    
	      //Returns key-value pairs whose keys are less than the specified key.  
	      System.out.println("headMap: "+map1.headMap(102));  
	      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	      System.out.println("tailMap: "+map1.tailMap(102));  
	      //Returns key-value pairs exists in between the specified key.  
	      System.out.println("subMap: "+map1.subMap(100, 102));    
	      
	      
			}

}
