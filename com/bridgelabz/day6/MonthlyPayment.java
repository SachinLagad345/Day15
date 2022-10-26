package com.bridgelabz.day6;

import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle amount");
		int p = sc.nextInt();
		int R = 5;
		System.out.println("Interest will be " + R);
		System.out.println("Enter years to pay");
		int y = sc.nextInt();
		
		float r = R / (12*100f);
		int n = 12*y;
		
		double mp = p*r/(1-Math.pow(1+r,-n));
		
		System.out.println("Monthly payment is "+ mp + " rs!");
	}

}
