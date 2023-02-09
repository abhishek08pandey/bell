package com.OneRivet.thread;

class ThreadExample extends Thread {//public final void join() throws InterruptedException  

	public void run() {
		
		String name = Thread.currentThread().getName();
		for (int i = 1; i <50; i++) {
			try {
				System.out.println(name);
				
			} catch (Exception e) {
				System.out.println(e + "The exception has been caught:");
			}
		}
	}
}

public class ThreadJoin {

	public static void main(String[] args) throws InterruptedException {
		ThreadExample th1 = new ThreadExample();
		ThreadExample th2 = new ThreadExample();
		ThreadExample th3 = new ThreadExample();
		
		
		th2.start();
		th2.join();// th2 should be complete its execution
	 	th1.start();
	 	th1.join(1);// th1 should be complete its execution in 1m/s otherwise th3 will continue to run
	 	th3.start();
	}
}
