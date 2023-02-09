package com.OneRivet.thread;

public class ThreadPriority extends Thread {

		public void run() {
			
		}
	
	public static void main(String[] args) throws IllegalArgumentException {
		
		System.out.println("current:  "+ Thread.currentThread().getPriority());// By default main method priority=5
		
		Thread.currentThread().setPriority(9);
		System.out.println("After apply priority:  "+ Thread.currentThread().getPriority());//Apply priority 9
		
		ThreadPriority th1 = new ThreadPriority();
		System.out.println("Object thread priority: "+ th1.getPriority());
		
		try{
			Thread.currentThread().setPriority(17);
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
		//ThreadPriority thread = new ThreadPriority();
		System.out.println("1st priority:  "+ Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(2);
		//ThreadPriority thread1 = new ThreadPriority();
		System.out.println("1st priority:  "+Thread.currentThread().getPriority());
	}

}
