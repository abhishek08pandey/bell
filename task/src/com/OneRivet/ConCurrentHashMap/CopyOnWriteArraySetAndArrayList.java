package com.OneRivet.ConCurrentHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArraySetAndArrayList {

	public static void main(String[] args) {

		CopyOnWriteArraySet<Integer> arrySet = new CopyOnWriteArraySet<Integer>();
		arrySet.add(12);
		arrySet.add(5);
		arrySet.add(45);
		arrySet.add(116);
		
		System.out.println("\nCopyOnWriteArraySet: "+arrySet);
		Iterator<Integer> iteratorSet = arrySet.iterator();
		
		while(iteratorSet.hasNext()) {
			arrySet.add(12);
			System.out.println(iteratorSet.next());
			arrySet.add(23);
		}
		System.out.println("\nCopyOnWriteArraySet Can not contains duplicate value : "+arrySet);
		
		CopyOnWriteArrayList<Integer> arrayList = new CopyOnWriteArrayList<Integer>();
		arrayList.add(41);
		arrayList.add(65);
		arrayList.add(23);
		
		System.out.println("\nCopyOnWriteArrayList:"+arrayList);
		
		Iterator<Integer> iteratorList = arrayList.iterator();
		while(iteratorList.hasNext()) {
			arrayList.add(42);
			System.out.println(iteratorList.next());
			arrayList.add(23);
		}
		System.out.println("\nCopyOnWriteArrayList Contain Duplicate Value: "+arrayList);
	}/*both can add value during iterating, both are synchronized, we can't remove elements during iterating in both
	and only difference is that we CopyOnWriteArraySet Can not contains duplicate value and CopyOnWriteArrayList 
	Contain Duplicate Value
	*/
	
}
