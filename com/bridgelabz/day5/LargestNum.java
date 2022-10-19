package com.bridgelabz.day5;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = sc.nextInt();
		System.out.println("Enter second number");
		int n2 = sc.nextInt();
		System.out.println("Enter third number");
		int n3 = sc.nextInt();
		
		int max = n1;
		if(max < n2)
			max = n2;
		else if(max < n3)
			max = n3;
		
		System.out.println("Largest number among numbers " + n1+ "," + n2 +"," + n3 + " is " + max);
		sc.close();
			
	}

}
