package com.OneRivet.thread;

	class Table1{
		
		public void printTable() throws InterruptedException {
			System.out.println("hi");
			
			printTable1();
			
		}
		
		public void printTable1() throws InterruptedException {
			System.out.println("hello");
			Thread.sleep(1000);
			printTable();
			
		}
	}
	
public class ThreadSynchronized1 {

	public static void main(String[] args) throws InterruptedException {
		
		final Table1 obj = new Table1();
		
		 Thread thread1 = new Thread() {	
			public void run() {
				try {
					obj.printTable();
					obj.printTable1();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		 };
		Thread thread2 = new Thread() {
			public void run() {
				try {
					obj.printTable();
					obj.printTable1();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		thread1.start();
		//thread1.join(1);
		thread2.start();
	}
}
