package com.OneRivet.collection;

import java.util.Iterator;
import java.util.LinkedList;

class UserLinkedList {
	long id;
	String schoolName;
	String principalName;
	
	UserLinkedList(long id, String schoolName, String pricipalName){
		this.id=id;
		this.schoolName=schoolName;
		this.principalName=pricipalName;
	}
}
public class LinkedList1 {

	public static void main(String[] args) {
		
		UserLinkedList user1 = new UserLinkedList(101, "Bai Ava Bai High School", "Darshna");
		UserLinkedList user2 = new UserLinkedList(102, null, null);
		UserLinkedList user3 = new UserLinkedList(102, "DMDG High School", "NatuNatbol");
		
		
		LinkedList<UserLinkedList> link = new LinkedList<>();
		link.add(user1);
		
		Iterator<UserLinkedList> iterator1 = link.iterator();
		UserLinkedList next1 = iterator1.next();
		System.out.println(next1.id + next1.principalName + next1.schoolName);
		
		boolean offer = link.offerFirst(user2);// offerFirst through we can insert at begging and offerLast through we can add in ending
		System.out.println(offer);
		
		Iterator<UserLinkedList> iterator2 = link.iterator();
		while(iterator2.hasNext()) {
		UserLinkedList next2 = iterator2.next();
		System.out.println(next2.id +" "+ next2.principalName+" " + next2.schoolName);
		}
		
		UserLinkedList set = link.set(0, user3);//? can't solve
		System.out.println(set.id + " " + set.principalName+" " + set.schoolName);
		
		//UserLinkedList peek = link.peekLast();
		//System.out.println(peek.id + " " + peek.principalName+" " + peek.schoolName);
		System.out.println(link);
		UserLinkedList pop = link.pop();
		System.out.println(link);
		System.out.println(pop);
		System.out.println(link);
	}

}
