package com.OneRivet.thread;


class Bus implements Runnable{

	int available = 2, passanger;
	String name;
	
	Bus(int passanger){
		this.passanger=passanger;
	}
	
	@Override
	public synchronized void run() {
		
		String name = Thread.currentThread().getName();
		if(available>=passanger) {
			System.out.println(name+ " : Reserved sheat");
			available= available-passanger;
		}else {
			System.out.println(name +" : sorry sheat is not available");
		}
	}
	
	
}
public class ThreadSyncronize {

	public static void main(String[] args) throws InterruptedException {
		
		Bus bus = new Bus(1); 
		Thread t1 = new Thread(bus);
		Thread t2 = new Thread(bus);
		Thread t3 = new Thread(bus);
		
		t1.setName("Raju");
		t2.setName("Baburav");
		t3.setName("Shyam");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
