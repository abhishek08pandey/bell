package com.OneRivet.Programme;

import java.util.Scanner;

public class PrimeNumber {

	public static void checkPrimeNumber(int n) {

		int i, m, flag = 0;
		m = n / 2;
		if (n == 0 || n == 1) {// o and 1 can't prime number
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {// smallest prime number is 2
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		} // end of else
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number:");
		int number = scan.nextInt();
		// checkPrimeNumber(number);
		checkPrime(number);
	}

	public static void checkPrime(int n) {
		// prime number is that which is only divide by itself and 1
		// 1st condition that should not 0 and 1, 2 is only one even prime number and
		int no = 0;
		//int m = n / 2;//23 11
		if (n == 0 || n == 1) {
			System.out.println(n + ": is not prime number");
		} else {
			for (int i = 2; i <= n-1; i++) {//11

				if (n % i == 0) {
					System.out.println(n + " : is not prime number");
					no = 1;
					break;
				}
			}
			if (no == 0) {
				System.out.println(n + " is prime number");
			}
		}
	}

}
