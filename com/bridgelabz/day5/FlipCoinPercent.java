package com.bridgelabz.day5;

import java.util.Random;
import java.util.Scanner;

public class FlipCoinPercent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of times you want to flip coin");
		int n = sc.nextInt();
		float headCount = 0;
		float tailCount = 0;
		Random rn = new Random();
		for(int i=0;i<n;i++)
		{
			int outcome =  rn.nextInt(2);
			
			if(outcome == 0)
				headCount++;
			else
				tailCount++;
		}
		System.out.println(headCount + "  " + tailCount);
		
		float headPercent = (headCount/n) * 100;
		float tailPercent = (tailCount/n) * 100;
		
		System.out.println("Head Percentage is " + headPercent + " and tails percentage is " + tailPercent);
		sc.close();
	}

}
