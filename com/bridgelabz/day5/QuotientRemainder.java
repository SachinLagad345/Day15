package com.bridgelabz.day5;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to be divided(dividend) ");
		int n = sc.nextInt();
		System.out.println("Enter number for division (divisor)");
		int d = sc.nextInt();
		
		System.out.println("Quotient is " + (n/d) + " And Remainder is " + (n%d));
		sc.close();
	}

}
