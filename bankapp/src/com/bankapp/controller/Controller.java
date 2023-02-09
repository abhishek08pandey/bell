package com.bankapp.controller;

import java.util.Scanner;
import com.bankapp.user.User;

public class Controller {
	static User user = new User();

	public static void main(String[] args) {
		modeCall();
	}

	public static void modeCall() {
		try {
			Scanner scn = new Scanner(System.in);
			System.out.println("*******************************************");
			System.out.println(
					"Mode:\n Create Account 1\n Balance inquiry 2 \n Account Details 3\n Credit Amount 4\n Withdraw Amount 5 \n Exit press: 6");
			String str = scn.next();
			if (str.contentEquals("1")) {
				createAccount();
			} else if (str.contentEquals("2") && !user.name.isEmpty()) {
				balanceInquiry();
			} else if (str.contentEquals("3") && !user.name.isEmpty()) {
				accountDetails();
			} else if (str.contentEquals("4") && !user.name.isEmpty()) {
				creditAmount();
			} else if (str.contentEquals("5") && !user.name.isEmpty()) {
				withdrawAmount();
			} else if (str.contentEquals("6")) {
				System.out.println("Thanks for Using Bank application");
			} else {
				System.out.println("Choose correct Mode: ");
				modeCall();
			}
		} catch (NullPointerException e) {
			System.out.println("You have to create account, User does not exist");
			modeCall();
		}
	}

	public static void createAccount() {
		try {
			Scanner scn = new Scanner(System.in);
			System.out.println("*******************************************");
			System.out.println("Enter Name: ");
			user.name = scn.next();
			System.out.println("Enter Account type: ");
			user.accountType = scn.next();
			System.out.println("Enter Account Number: ");
			user.accountNumber = scn.nextLong();
			System.out.println("Balance: ");
			user.balance = scn.nextLong();

			System.out.println("*******************************************");
			System.out.println(user.name+" 💆 Acoount created successfully");
			System.out.println("\nThanks for Using Bank application");

			modeCall();
		} catch (Exception e) {
			System.out.println("Enter valid input");
			modeCall();
		}
	}

	public static void balanceInquiry() {
		Scanner scn = new Scanner(System.in);
		System.out.println("For Balance Inquiry Enter name: ");
		String s = scn.next();
		try {
			if (user.name.contentEquals(s)) {
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

	public static void accountDetails() {
		System.out.println("*******************************************");
		System.out.println("AccountDetails: \n" + "Name: " + user.name + "\n" + "Account number: " + user.accountNumber
				+ "\n" + "Account type: " + user.accountType + "\n" + "Balance: " + user.balance);
		System.out.println("\nThanks for Using Bank application");
		modeCall();
	}

	public static void creditAmount() {

		if (user.name.contentEquals(user.name)) {
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter Credit Amount: ");
			double addAmount = scn.nextDouble();

			if (user.balance == 0 && user.balance > 0) {
				user.balance = user.balance+addAmount;
				System.out.println("After Credited Amount Balance: " + user.balance);
				modeCall();
			} else {
				System.out.println("Invalid Inputs");
				creditAmount();
			}
		} else {
			System.out.println("User does not exist");
		}
	}

	public static void withdrawAmount() {

		if (user.name.contentEquals(user.name)) {
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter Withdraw Amount: ");
			double WithdrawAmount = scn.nextDouble();

			if (user.balance == 0 && user.balance > 0) {
				user.balance = user.balance - WithdrawAmount;
				System.out.println("After Withdraw Amount Balance: " + user.balance);
				modeCall();
			} else {
				System.out.println("Invalid Inputs");
				withdrawAmount();
			}
		} else {
			System.out.println("User does not exist");
		}
	}
}
