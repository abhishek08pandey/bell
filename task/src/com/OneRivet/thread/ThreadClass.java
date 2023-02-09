package com.OneRivet.thread;

public class ThreadClass extends Thread {// extending thread class 

	
	public void run() {
		System.out.println("abhishek");
	}
	
	public static void main(String[] args) {
		
		ThreadClass threadClass = new ThreadClass();
		threadClass.run();// we can call direct a run method by main thread
		threadClass.start();
	}
}
