package com.bankapp.controller;

import java.util.Scanner;

public class BalanceInquiry extends Controller {

	public void balanceInquiry() {
		Scanner scn = new Scanner(System.in);
		System.out.println("For Balance Inquiry Enter name: ");
		String s = scn.next();
		try {
			if (user.name.equalsIgnoreCase(s)) {
				System.out.println("Balance: " + user.balance);
				modeCall();
			} else {
				System.out.println("User does not exist \n For try again press: 2 \n Exit press: 6");
				String exit = scn.next();

				if (exit.contentEquals("2")) {
					balanceInquiry();
				} else if (exit.contentEquals("6")) {
					System.out.println("Thanks for Using Bank application");
				} else {
					System.out.println("Wrong Inputs given");
					balanceInquiry();
				}
			}
		} catch (NullPointerException e) {
			System.out.println("User does not exist");
			modeCall();
		}
	}
}
