package com.bridgelabz.day5;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		
		System.out.println("Factors of " + n + " are ");
		for(int i=2; i*i < n; i++)
		{
			while(n%i == 0)
			{
				System.out.println(i);
				n = n/i;
			}
		}
		
		if(n>2)
		{
			System.out.println(n);
		}
	}

}
