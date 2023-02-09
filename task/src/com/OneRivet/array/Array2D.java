package com.OneRivet.array;

public class Array2D {

	public static void main(String[] args) {
		
		int [][] no = new int [2][3];
		no[0][0] = 10;
		no[0][1]= 20;
		no[0][2]=30;
		
		no[1][0]= 40;
		no[1][1]= 50;
		no[1][2]= 60;

		System.out.println(no);
		System.out.println(no.length);// at a time we use nothing so we get only Raw
		System.out.println(no[1].length); // at a time we use raw to get Column
		//System.out.println(no[2].length); // it will give a exception because of 2 raw is not avilabel
		
		for (int i = 0; i < no.length; i++) {
			for (int j = 0; j < no.length; j++) {
				System.out.println(no[i][j]);
			}
		}
		
		 char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };  
		 System.out.println("Indicate lenth of array: "+copyFrom.length);
		  char[] copyTo = new char[9];  
		  //copying array using System.arraycopy() method  
	        System.arraycopy(copyFrom, 2, copyTo, 0, 8);  
	        //printing the destination array  
	        System.out.println(String.valueOf(copyTo));  
	        int arr[]={33,3,4,5};  
	        System.out.println("Printing original array:");  
	        for(int i:arr)  
	        System.out.println(i);  
	          
	        System.out.println("Printing clone of the array:");  
	        int carr[]=arr.clone();  
	        for(int i:carr)  
	        System.out.println(i);  
	          
	        System.out.println("Are both equal?");  
	        System.out.println(arr.equals(carr));
	        System.out.println(arr==carr);
	        
	}

}
