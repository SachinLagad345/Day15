package com.bridgelabz.day6;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter a number: ");  
		//creating object of the Scanner class  
		Scanner sc = new Scanner(System.in);  
		//reading a number form the user  
		int n = sc.nextInt();  
		//calling the method and prints the result  
		System.out.println("The square root of "+ n+ " is: "+squareRoot(n));  
		}  
		//user-defined method that contains the logic to find the square root  
		public static double squareRoot(int num)   
		{  
		//temporary variable  
		double t;  
		double sqrtroot=num/2;  
		System.out.println("Initial value set to "+ sqrtroot);
		do   
		{  
		t=sqrtroot;  
		sqrtroot=(t+(num/t))/2;  
		System.out.println("Value of sqrtroot is " + sqrtroot);
		}   
		while((t-sqrtroot)!= 0);  
		return sqrtroot;  

	}

}
