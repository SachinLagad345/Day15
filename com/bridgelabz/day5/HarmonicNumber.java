package com.bridgelabz.day5;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter non-zero number ");
		int n = sc.nextInt();
		
		float sum = 1;
		
		for(int i=2;i<=n;i++)
		{
			sum += (1f/n); 
		}
		
		System.out.println("Harmonic number is " + sum);
		sc.close();
	}

}
