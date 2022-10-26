package com.bridgelabz.day6;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = sc.nextInt();
		int counter = 0;
		for(int i=2;i<=n/2;i++)
		{
			if(counter > 0)
				break;
			else if(n%i == 0)
				counter++;
		}
		
		if(counter > 0)
			System.out.println("Given number " + n + " is not a prime number!");
		else
			System.out.println("Given number " + n + " is a prime number!");
		sc.close();
	}

}
