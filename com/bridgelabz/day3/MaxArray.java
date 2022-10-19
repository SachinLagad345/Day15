package com.bridgelabz.day3;

public class MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,4,6,7,8,9,12,15};
		int max = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		
		System.out.println("Largest number in array is "+ max);
	}

}
