package com.bridgelabz.day3;

public class FrequencyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[] = {2,4,6,7,8,9,12,15};
	
		int arr[] = {2,6,3,3,8,8,2,6,3,9,7,5,9,9,0,0,1,11};
		int arrcheck[] = arr.clone(); //specifically validating 0
		int size = 0;
		
		int uniqueArr[] = new int[arr.length];
		int freqArr[] = new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			int counter = 1;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i] == arrcheck[j] && counter==1)
				{
					counter++;
				}
				else if(arr[i] == arrcheck[j])
				{
					arrcheck[j] = arrcheck[j] + 1;
				}
			}
		}
		
		int headCount = 0;
		for(int i=0;i<arrcheck.length;i++)
		{
			if(arr[i] == arrcheck[i])
			{
				uniqueArr[headCount] = arr[i];
				headCount++;
			}
		}
		headCount--;
		
		for(int i=0;i<=headCount;i++)
		{
			int count = 0;
			for(int j=0;j<arr.length;j++)
			{
				if(uniqueArr[i] == arr[j])
				{
					count++;
				}
			}
			freqArr[i] = count;
		}
		
		System.out.println("Frequency of elemnts of Array is as follows");
		
		for(int i=0;i<=headCount;i++)
		{
			System.out.println(uniqueArr[i] + "\t" + freqArr[i]+" times");
		}
		
	}

}
