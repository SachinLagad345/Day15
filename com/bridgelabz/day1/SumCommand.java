package com.bridgelabz.day1;

import java.util.Scanner;

public class SumCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of arguments");
		
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0;i<n;i++)
		{
			try {
			sum += Integer.parseInt(sc.next());
			}catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		
		System.out.println("sum is " + sum);

	}

}
