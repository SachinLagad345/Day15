package com.bridgelabz.day5;

import java.util.Scanner;

public class Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<arr.length;i++)
        {
        	int num = sc.nextInt();
        	arr[i] = num;
        }
        
        int tripletsArr[] = new int[3*arr.length];
        int head = 0;
        for(int i=0;i<arr.length-2;i++)
        {
        	for(int j=i+1;j<arr.length-1;j++)
        	{
        		if(arr[i]==arr[j])
        			continue;
        		for(int k=j+1;k<arr.length;k++)
        		{
        			System.out.println(" i = " + i + " j = "+j+" k = "+k);
        			if(arr[j]==arr[k])
        				continue;
        			if((arr[i]+arr[j]+arr[k]) == 0)
        			{
        				tripletsArr[head++] = arr[i];
        				tripletsArr[head++] = arr[j];
        				tripletsArr[head++] = arr[k];
        			}
        		}
        	}
        }
        
        System.out.println("Number of distinct triplets are "+ head/3);
        
        System.out.println("Distinct triplets are ");
        for(int i=0;i<head;i+=3)
        {
        	System.out.print("("+tripletsArr[i]+","+tripletsArr[i+1]+","+tripletsArr[i+2]+")   ");
        }
        sc.close();
        
	}

}
