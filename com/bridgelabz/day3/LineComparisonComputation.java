package com.bridgelabz.day3;

import java.util.Scanner;

public class LineComparisonComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Line Comparison Computation Program!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter starting x co-ordinate for first line");
		int x1 = sc.nextInt();
		System.out.println("Enter starting y co-ordinate for first line");
		int y1 = sc.nextInt();
		System.out.println("Enter end x co-ordinate for first line");
		int x2 = sc.nextInt();
		System.out.println("Enter end y co-ordinate for first line");
		int y2 = sc.nextInt();
		Double l1 = new Double( Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
		
		System.out.println("Length of line is "+ l1);
		
		System.out.println("Enter starting x co-ordinate for second line");
		int x3 = sc.nextInt();
		System.out.println("Enter starting y co-ordinate for second line");
		int y3 = sc.nextInt();
		System.out.println("Enter end x co-ordinate for second line");
		int x4 = sc.nextInt();
		System.out.println("Enter end y co-ordinate for second line");
		int y4 = sc.nextInt();
		Double l2 = new Double(Math.sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3,2)));
		
		
		if(l1.compareTo(l2) == 0)
			System.out.println("L1 and L2 are equal");
		else
			System.out.println("L1 and L2 are not equal");
		
	}

}
