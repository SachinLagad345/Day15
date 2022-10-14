package com.bridgelabz.day2;

import java.util.Scanner;

public class SpringSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day of month");
		
		int d = sc.nextInt();
		System.out.println("Enter month number");
		int m = sc.nextInt();
		
		//MArch 20 and June 20
		
		if(m >=3 && m <= 6 )
		{
			if(d > 0 && d <= 31)
			{
				if(m==3)
				{
					if(d>=20)
					{
						System.out.println(true);
					}
					else
					{
						System.out.println(false);
					}
				}
				else if(m==6)
				{
					if(d<=20)
					{
						System.out.println(true);
					}
					else
					{
						System.out.println(false);
					}
				}
				else if(m==4)
				{
					if(d<=30)
					{
						System.out.println(true);
					}
					else
					{
						System.out.println(false);
					}
				}
				else
				{
					System.out.println(true);
				}
			}
			else
			{
				System.out.println(false);
			}
		}
		else
		{
			System.out.println(false);
		}
		

	}

}
