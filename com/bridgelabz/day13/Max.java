package com.bridgelabz.day13;

public class Max {

	public static String findmax(String[] arr)
	{
		String maxnum = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i].compareTo(maxnum) > 0)
				maxnum = arr[i];
		}
		
		return maxnum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Float arr1[] = {3.1F,2.4F,1.2F};
//		Float arr2[] = {3.2F,12.14F,6.4F};
//		Float arr3[] = {2.32F,5.2F,8.34F};
		
		String arr1[] = {"Vasudev","Krishna","Ram"};
		String arr2[] = {"Ganesh","Ram","Chaitanya"};
		String arr3[] = {"Raja","Krishna","Trivikram"};
		
		System.out.println(Max.findmax(arr1));
		System.out.println(Max.findmax(arr2));
		System.out.println(Max.findmax(arr3));
	}

}
