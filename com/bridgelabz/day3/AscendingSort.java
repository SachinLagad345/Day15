package com.bridgelabz.day3;

public class AscendingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,6,3,8,7,1,16,12,10,9};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
