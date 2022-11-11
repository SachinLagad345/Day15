package com.bridgelabz.day13;

public class Max {

	public static <E extends Comparable<E>> E findmax(E[] arr)
	{
		E maxnum = arr[0];
		
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
		Integer arr2[] = {2,5,3};
		Float arr3[] = {12F,24F,30.23F};
		
		System.out.println(Max.findmax(arr1));
		System.out.println(Max.findmax(arr2));
		System.out.println(Max.findmax(arr3));
	}

}
