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
        
        int unqar[] = new int[arr.length];
        int unqhead = 0;
        int arr2[] = arr.clone();
        
        for(int i=0;i<arr.length;i++)
        {
        	int counter = 0;
        	for(int j=i;j<arr.length;j++)
        	{
        		if(arr[i] == arr2[j] && counter==0)
        			counter++;
        		else if(arr[i] == arr2[j])
        		{
        			arr2[j] = arr2[j] + 1;
        		}
        	}
        }
        
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i] == arr2[i])
        	{
        		unqar[unqhead] = arr[i];
        		unqhead++;
        	}
        }
        int tripletsArr[] = new int[3*arr.length];
        int head = 0;
        for(int i=0;i<unqhead-2;i++)
        {
        	for(int j=i+1;j<unqhead-1;j++)
        	{
        		for(int k=j+1;k<unqhead;k++)
        		{
        			System.out.println(" i = " + i + " j = "+j+" k = "+k);
        			
        			if((unqar[i]+unqar[j]+unqar[k]) == 0)
        			{
        				tripletsArr[head++] = unqar[i];
        				tripletsArr[head++] = unqar[j];
        				tripletsArr[head++] = unqar[k];
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
