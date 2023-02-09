package com.OneRivet.casting;

interface Printable {

}

class A implements Printable {
	public void a() {
		System.out.println("A-method");
	}
}

class B implements Printable {
	public void b() {
		System.out.println("B-methos");
	}
}

class Call {

	public void invoke(Printable p) {// P has a Relationship with?

		if (p instanceof A) {// if it is A
			A a = (A) p;// Downcasting:- ref is class A and obj is p
			System.out.println("ref a address:- " + a);
			a.a();
		}
		if (p instanceof B) {// If it is B
			B b = (B) p;// Downcasting:- ref is class B and obj is p
			System.out.println("ref b address:- " + b);
			b.b();
		}
	}

}

/*
 * Here 1st we check if downCasting happen or not by "instanceof" method
 */
public class ClassUpCasting {

	public static void main(String[] args) {

		Printable p = new B();// UpCasting
		System.out.println("ref p address:- " + p);
		Call c = new Call();
		System.out.println("ref c address:- " + c);
		c.invoke(p);

	}

}
