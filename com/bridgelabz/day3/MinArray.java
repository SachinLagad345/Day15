package com.bridgelabz.day3;

public class MinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,4,6,7,8,9,12,15};
		int min = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min > arr[i])
			{
				min = arr[i];
			}
		}
		
		System.out.println("Smallest number in array is "+ min);
	}

}
