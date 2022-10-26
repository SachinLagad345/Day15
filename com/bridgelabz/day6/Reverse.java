package com.bridgelabz.day6;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = sc.nextInt();
		
		int reverse = 0;
		
		for(int i=n;i!=0;i/=10)
		{
		reverse = reverse * 10 + (i%10);
		}
		
		System.out.println("Reversed number is " + reverse);
	}

}
