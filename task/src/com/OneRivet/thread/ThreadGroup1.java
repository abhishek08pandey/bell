package com.OneRivet.thread;


class ChildGroup extends Thread {

	public ChildGroup(String threadName, ThreadGroup g1) {
		
		super(g1, threadName);
	}
	
	public void run() {
		for (int i = 0; i < 1; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("for loop");
			}  catch (InterruptedException ex)   
            {  
	              System.out.println(Thread.currentThread().getName() + " interrupted");  
	            }  
	        }  
	        System.out.println(Thread.currentThread().getName() + " completed executing");  
		}
	}
	

public class ThreadGroup1 {

	public static void main(String[] args) {
		
		ThreadGroup g1 = new ThreadGroup("parent threadGroup");
		ThreadGroup g2 = new ThreadGroup(g1, "childGroup");
		
		ChildGroup t1 = new ChildGroup("thread 1: ", g1);
		t1.start();
		
		ChildGroup t2 = new ChildGroup("thread 2: ", g1);
		t2.start();
		
		  g1.checkAccess();  
	      System.out.println(g1.getName() + " has access");  
	      g2.checkAccess();  
	      System.out.println(g2.getName() + " has access"); 
	      
	      System.out.println(g1.activeCount());
	      System.out.println(g2.activeCount());
	      
	      System.out.println(g1.activeGroupCount());
	      System.out.println(g1.parentOf(g2));
	      System.out.println(g1.getParent());// main method
	}

	
}
