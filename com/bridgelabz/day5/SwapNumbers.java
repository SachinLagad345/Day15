package com.bridgelabz.day5;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = sc.nextInt();
		System.out.println("Enter second number");
		int n2 = sc.nextInt();
		
		System.out.println("First number is " + n1 + " and Second number is " + n2);
		
		int temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("After swapping first number is " + n1 + " and second number is "+ n2);
	}

}
