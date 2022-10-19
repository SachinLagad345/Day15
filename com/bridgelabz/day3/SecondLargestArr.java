package com.bridgelabz.day3;

public class SecondLargestArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,6,3,8,7,1,12,10,13,9};
		int max1,max2;
		
		if(arr[0] > arr[1])
		{
			max1 = arr[0];
			max2 = arr[1];
		}
		else
		{
			max1 = arr[1];
			max2 = arr[0];
		}
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i] > max1)
			{
				int temp = max1;
				max1 = arr[i];
				max2 = temp;
			}
			else if(arr[i] > max2)
			{
				max2 = arr[i];
			}
		}
		
		System.out.println("Second largest element is " + max2);;
	}

}
