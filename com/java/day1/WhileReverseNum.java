package com.java.day1;

import java.util.Scanner;

public class WhileReverseNum {
	
	public static int tenPower(int n) {
		int value = 1;
		for(int i=0;i<n;i++)
		{
			value *= 10;
		}
//		System.out.println("Ten power value is " + value);
		
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int size = 0;
		
		while(temp != 0)
		{
			temp = temp/10;
			size++;
		}
		
		int[] arr = new int[size];
		
		int i=0;
		
		while (n != 0) {
			int digit = n%10;
			arr[i] = digit;
			i++;
			n = n/10;
		}
		i--;
		
		int reversenum = 0;
		int r = 0;
		
		while(i >= 0 )
		{
			reversenum += (arr[r] * tenPower(i));
			i--;
			r++;
		}
		
		System.out.println("Reverseed num is " + reversenum);
		
	}

}
