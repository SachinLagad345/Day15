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
		double l1 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		
		System.out.println("Length of line is "+ l1);
		
		
	}

}
