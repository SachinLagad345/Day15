package com.bridgelabz.day2;

import java.util.Scanner;

public class Quadratic {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter equation value of a");
		int a = sc.nextInt();
		System.out.println("Enter equation value of b");
		int b = sc.nextInt();
		System.out.println("Enter equation value of c");
		int c = sc.nextInt();
		System.out.println("Equation is " + a + "x*x + " + b + "x + " + c);
		int delta = b*b - (4*a*c);
		double root1 = -b + Math.sqrt(delta)/(2*a);
		double root2 = -b - Math.sqrt(delta)/(2*a);
		
		System.out.println("Roots of equation are " + root1 + " and " + root2 );

	}

}
