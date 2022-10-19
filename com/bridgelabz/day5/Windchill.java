package com.bridgelabz.day5;

import java.util.Scanner;

public class Windchill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature less than 50");
		int t = sc.nextInt();
		System.out.println("Enter wind speed between 3 and 120");
		int v = sc.nextInt();
		
		if(t>50)
		{
			System.out.println("Please  enter temperature less than 50");
			
		}
		else if(v < 3 || v > 120 )
		{
			System.out.println("Please enter speed of wind between 3 and 120");
		}
		else {
		double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
		System.out.println("Wind chill is " + w);
		}
		sc.close();
	}

}
