package com.OneRivet.collection;

import java.util.ArrayDeque;
import java.util.Deque;  

public class Deque1 {

	public static void main(String[] args) {

		Deque<String> d = new ArrayDeque<String>();
		d.add("abhi");
		d.offerFirst("shek");
		d.offerLast("pandey");
		d.add("husen");
		d.offer("prinsh");
		d.poll();//remove first element
		d.pollFirst();//remove first element
		d.pollLast();// remove last element
		System.out.println(d.pop());// it can retrieve first element and remove it.
	}

}
