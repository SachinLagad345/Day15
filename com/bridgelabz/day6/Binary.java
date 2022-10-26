package com.bridgelabz.day6;

import java.util.Scanner;

public class Binary {

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
		if(head%4 != 0)
			head += (4 - head%4);
//		System.out.println("head is "+head);
		for(int i=head-1;i>=0;i--)
		{
			if(i%4 == 0 && i != head-1 && i != 0)
				System.out.print(arr[i] + "  ");
			else
				System.out.print(arr[i]);
		}
	}

}
