package com.bridgelabz.day5;

import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r = sc.nextInt();
        System.out.println("Enter number of columns");
        int c = sc.nextInt();
       
        int arr[][] = new int[r][c];
       
        System.out.println("Enter elements of array");
       
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
       
        System.out.println("Enterd Array is ");
           
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
	}

}
