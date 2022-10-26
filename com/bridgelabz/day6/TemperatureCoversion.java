package com.bridgelabz.day6;

import java.util.Scanner;

public class TemperatureCoversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 1. To convert celsius to fahreinheit");
		System.out.println("Enter 2. To convert fahreinheit to celsius \n");
		System.out.println("Enter your option ..");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case 1:System.out.println("Enter temperature in celsius");
		  	  	int temp = sc.nextInt();
		  	  	float tempf = (temp * 9f/5) + 32;
		  	  	System.out.println("Temperature in fahreinheit is " + tempf);
		  	  	break;
		case 2: System.out.println("Enter temperature in fahreinheit");
  	  			int temp2 = sc.nextInt();
  	  			float tempc = (temp2-32) * 5f/9;
  	  			System.out.println("Temperature in celsius is " + tempc);
  	  			break;
  	  	default:System.out.println("Please enter valid option");
  	  			break;
		}
	}

}
