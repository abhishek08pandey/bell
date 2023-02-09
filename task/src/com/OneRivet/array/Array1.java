package com.OneRivet.array;

public class Array1
{

	public static void min(int arr[])//smallest element
	{
		int min = arr[0];
		for (int j = 0; j < arr.length; j++) {
		if(min>arr[j]) {
			min=arr[j];
			System.out.println(min);
		}
		}
	}
	public static void main(String[] args)
	{
		int []x = new int[3];
		x[0]= 10;
		x[1]= 20;
		x[2]=30;
		for (int i = 0; i < x.length; i++)
		{
			//System.out.println(x[i]);
		}
		
		int []x1= {145,5,55,555};
		
		
		for (int i : x1) {
			//System.out.println(i);
		}
		min(x1);
	}
}
