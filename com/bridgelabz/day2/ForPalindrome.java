package com.bridgelabz.day2;

import java.util.Scanner;

public class ForPalindrome {
	
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
		int number = n;
		int temp = n;
		int size = 0;
		
		while(temp != 0)
		{
			temp = temp/10;
			size++;
		}
		
		int[] arr = new int[size];
		
		int i;
		
		for (i=0;i<size;i++) {
			int digit = n%10;
			arr[i] = digit;
			n = n/10;
		}
		
		i--;
		
		int reversenum = 0;
		
		for(int r=0;r<size;r++ )
		{
			reversenum += (arr[r] * tenPower(i));
			i--;
		}
		
		if(number == reversenum)
		{
			System.out.println("Given number "+ number + " is palindrome");
		}
		else
		{
			System.out.println("Given number "+ number + " is not palindrome");
		}
		
	}

}
