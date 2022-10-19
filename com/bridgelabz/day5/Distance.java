package com.bridgelabz.day5;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x co-ordinate");
		int x = sc.nextInt();
		System.out.println("Enter y co-ordinate");
		int y = sc.nextInt();
		
		double dist = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
		System.out.println("Distance of given point from origin is "+ dist);
		sc.close();
	}

}
