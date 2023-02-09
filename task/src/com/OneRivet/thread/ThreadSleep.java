package com.OneRivet.thread;

public class ThreadSleep extends Thread {

	public static void main(String[] args) throws InterruptedException {
		try {
		for (int i = 0; i < 5; i++) {
			Thread.sleep(1000);
			System.out.println(i);
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		}
}
