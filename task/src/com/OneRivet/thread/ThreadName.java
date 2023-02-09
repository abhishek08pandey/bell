package com.OneRivet.thread;

class ConstructorMethod extends Thread {
	
	ConstructorMethod(String conMethod){
		super(conMethod);
	}
	
	public void run() {
		System.out.println("run method");
	}
}


public class ThreadName extends Thread{

	public static void main(String[] args) {
		// 1st Method: .setName and .getName through we can declare thread name
		ThreadName th1 = new ThreadName();
		ThreadName th2 = new ThreadName();
		
		System.out.println("Thread name:- "+ th1.getName());
		System.out.println("Thread name:- "+ th2.getName());
		
		th1.setName("abhishek");
		th2.setName("abhi");
		
		System.out.println("Thread name:- "+ th1.getName());
		System.out.println("Thread name:- "+ th2.getName());
		
		//2nd Method with the use of constructor and string
		
		ConstructorMethod th3 = new ConstructorMethod("conThread1");
		ConstructorMethod th4= new ConstructorMethod("conThread2");
		
		System.out.println("conMethod thread: "+ th3.getName());
		System.out.println("conMethod thread: "+ th4.getName());
		
		th3.start();
		th4.start();
		
	}

}
