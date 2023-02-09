package com.OneRivet.thread;

class Bank extends Thread{
	
	static int balance= 5000;
	static int withdraw;
	
	
	Bank(int withdraw)
	{
		this.withdraw=withdraw;
	}
	public static synchronized void notRun()
	{
		String name = Thread.currentThread().getName();
		if(withdraw<=balance)
		{
			System.out.println(name+ " : withdraw amount ");
			balance=balance-withdraw;
		
		}else
		{
			System.out.println("insufficient balance");
		}
	}
	public void run() {
		notRun();
	}
}

public class ThreadSychronized3 {

	public static void main(String[] args) {

		Bank b1 = new Bank(5000);
		Bank b2 = new Bank(5000);
		
		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b1);
		
		Thread t3 = new Thread(b2);
		Thread t4 = new Thread(b2);
		
		t1.setName("abhi");
		t2.setName("abhishek");
		t3.setName("shek");
		t4.setName("pandey");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
