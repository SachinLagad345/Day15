package com.bridgelabz.day5;

import java.util.Scanner;

public class TwoPowerTable {
	
	public static void printTable(int num) {
		System.out.println("Table of " + num +" is :");
		for(int i=1;i<=10;i++)
		{
			System.out.print(num*i + "  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number less than 31");
		int n = sc.nextInt();
		
		if(n >= 31)
		{
			System.out.println("Please enter less than 31!!");
		}
		else
		{
			for(int i=0;i<=n;i++)
			{
				int num = (int)Math.pow(2, i);
				printTable(num);
			}
		}
	}

}
