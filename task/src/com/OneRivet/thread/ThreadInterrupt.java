package com.OneRivet.thread;

class Interrupt extends Thread {

	public void run(){

		try {

			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000);
				System.out.println("thread 1");
				// it is mandatory other wise we can't run interrupt method
			}
		} catch (InterruptedException e) {
			System.out.println("thread Interrupt");
			//throw new RuntimeException("Thread interrupted");
		}
	}

}

public class ThreadInterrupt {

	public static void main(String[] args) {

		Interrupt in = new Interrupt();
		Thread t = new Thread(in);

		t.start();
		t.interrupt();// It will stop the further execution of current thread. we can interrupt the execution of that thread by showing InterruptedException 

	}

}
