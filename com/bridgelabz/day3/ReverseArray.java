package com.bridgelabz.day3;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//indexes =  0 1 2 3 4 5  6  7
		int arr[] = {2,4,6,7,8,9,12,15};
		//length = 8
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

}
