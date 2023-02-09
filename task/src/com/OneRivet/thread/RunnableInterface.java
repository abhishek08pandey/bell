package com.OneRivet.thread;

public class RunnableInterface implements Runnable { // implementing runnable interface

	@Override
	public void run() {
		System.out.println("3rd-runnable run method call");
	}

	public static void main(String[] args) throws InterruptedException {

		RunnableInterface run = new RunnableInterface();

		// Using the Thread Class: Thread(String Name)

		Thread thread = new Thread("1st-thread name");
		String name = thread.getName();
		System.out.println(name);
		

		Thread thread1 = new Thread(run);// calling run method
		thread1.start();

		// Using the Thread Class: Thread(Runnable r, String name)

		Runnable r1 = new RunnableInterface();
		Thread thread2 = new Thread(r1, "2nd-second Thread");
		thread2.sleep(1000);
		thread2.start();
		String name2 = thread2.getName();
		System.out.println(name2);
	}

}
