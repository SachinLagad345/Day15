package com.java.day1;

import java.util.Scanner;

public class IfelseUnit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter one of the number: 1 10 100 1000");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n == 1) {
			System.out.println("Unit");
		}
		else if(n == 10) {
			System.out.println("Ten");
		}
		else if(n == 100) {
			System.out.println("Hundred");
		}
		else if(n == 1000) {
			System.out.println("Thousand");
		}
		else
		{
			System.out.println("please enter valid number");
		}
	}

}
