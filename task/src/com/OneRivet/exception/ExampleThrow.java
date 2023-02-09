package com.OneRivet.exception;

import java.io.IOException;

public class ExampleThrow {

	public static void main (String[] args) throws NotAbleToVoteException, EligiableForVoting, IOException  {
		vote(18, "valsad");
		System.out.println("rest of the code");
	}
	
	public static void vote(int x, String city) throws NotAbleToVoteException, EligiableForVoting, IOException {
		
		if(x<18 && city!="valsad") {
			System.out.println("not able to vote at this age");
			throw new NotAbleToVoteException();
			
		}else if(x>=18 && city!="surat + daman") {
			System.out.println("able to vote at this age");
			throw new EligiableForVoting();
			
		}else if(x>=18 && city==" ") {
			System.out.println("not able to vote at this age");
			throw new IOException();
			
		}else {
			System.out.println("you are not indian");
		}
	}
}