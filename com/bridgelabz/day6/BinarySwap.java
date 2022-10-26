package com.bridgelabz.day6;

import java.util.Scanner;

public class BinarySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int nc = n;
		int arr[] = new int[35];
		int head = 0;
		while(n != 0)
		{
			arr[head++] = n%2;
			n = n/2;
		}
//		System.out.println("head is " + head);
		System.out.println("Binary number for " + nc + " is ");
		if(head < 8)
			head += (8 - head);
//		System.out.println("head is "+head);
		int nibble[] = new int[head];
		int ind = 3; 
		int flag = 0;
		for(int i=head-1;i>3;i--)
		{
			nibble[ind] = arr[i];
			ind--;
		}
		ind = head-1;
		for(int i=3;i>=0;i--)
		{
			nibble[ind] = arr[i];
			ind--;
		}
		
		System.out.println("original ");
		for(int i=head-1;i>=0;i--)
		{
			if(i%4 == 0 && i != head-1 && i != 0)
				System.out.print(arr[i] + "  ");
			else
				System.out.print(arr[i]);
		}
		
		System.out.println("\nafter swapping ");
		for(int i=head-1;i>=0;i--)
		{
			if(i%4 == 0 && i != head-1 && i != 0)
				System.out.print(nibble[i] + "  ");
			else
				System.out.print(nibble[i]);
		}
		System.out.println("\nNew decimal value is ");
		int sum = 0;
		for(int i=head-1;i>=0;i--)
		{
			if(nibble[i] == 1)
				sum += (int)Math.pow(2, i);
		}
		System.out.print(sum);
	}

}
