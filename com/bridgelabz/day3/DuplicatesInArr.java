package com.bridgelabz.day3;

public class DuplicatesInArr {
	
	public static boolean doesNotContain(int headCount, int dupArr[], int num) {
		int check = 0;
		for(int i=0;i<headCount;i++)
		{
			if(dupArr[i] == num)
			{
				check++;
			}
		}
		if(check == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,6,3,3,8,8,2,6,3,9,7,5,9,9,0,0,1,11};
		int arrcheck[] = arr.clone(); //specifically validating 0
		int size = 0;
		int dupArr[] = new int[arr.length];
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
			if(arr[i] != arrcheck[i])
			{
				if(doesNotContain(headCount,dupArr,arr[i]))
				{
				dupArr[headCount] = arr[i];
				headCount++;
				}
			}
		}
		headCount--;
		
		System.out.println("Dupicate elements are ");
		for(int i=0;i<=headCount;i++)
		{
			System.out.print(dupArr[i] + "  ");
		}
	
	}

}
