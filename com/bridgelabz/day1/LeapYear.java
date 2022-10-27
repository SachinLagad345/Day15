package com.bridgelabz.day1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 digit year");
		int year = sc.nextInt();
		int check = year; 
		int len = 0;
		while(check != 0)
		{
			check = check/10;
			len++;
		}
		
		if(len == 4)
		{
			if(year%4 == 0)
			{
				if(year%100 == 0  && year%400 == 0)
				{
					System.out.println(year + " is a leap year");
				}
				else if(year%100 == 0)
				{
					System.out.println(year + " is not a leap year");
				}
				else
					System.out.println(year + " is a leap year");
			}
			else
			{
				System.out.println(year + " is a not leap year");
			}
		}
		else
		{
			System.out.println("Please enter four digit year!");
		}
		sc.close();
	}
}
