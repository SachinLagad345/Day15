package com.bridgelabz.day2;

import java.util.Scanner;

public class OperatorsMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		
		int n1 = sc.nextInt();
		System.out.println("Enter second number");
		int n2 = sc.nextInt();
		
		System.out.println("Enter third number");
		int n3 = sc.nextInt();
		
		int firstop = n1 + n2 * n3;
		System.out.println("fisrtop " + firstop);
		int secondop = n3 + n1/n2; 
		System.out.println("secondop " + secondop);
		int thirdop = n1 % n2 + n3;
		System.out.println("thirdop "+ thirdop);
		int fourop = n1 * n2 + n3;
		System.out.println("fourop "+ fourop);
		
		int min = firstop;
		int max = firstop;
		
		if(secondop > max)
		{
			max = secondop;
		}
		if(thirdop > max)
		{
			max = thirdop;
		}
		if(fourop > max)
		{
			max = fourop;
		}
		
		
		if(secondop < min)
		{
			min = secondop;
		}
		if(thirdop < min)
		{
			min = thirdop;
		}
		if(fourop < min)
		{
			min = fourop;
		}
		
		System.out.println("Max is " + max);
		System.out.println("Min is " + min);
		
	}

}
