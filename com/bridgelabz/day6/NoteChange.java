package com.bridgelabz.day6;

import java.util.Scanner;

public class NoteChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,5,10,50,100,500,1000};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount you want in Note change");
		int amount = sc.nextInt();
		
		int notesArr[] = new int[arr.length];
		int freqNotesArr[] = new int[arr.length];
		int head = 0;
		int totalNoteCount = 0;
		int sum = 0;
		for(int i=arr.length-1;i>=0;i--)
		{
			while(amount/arr[i] != 0)
			{
				int noteCount = amount/arr[i];
				notesArr[head] = arr[i];
				freqNotesArr[head] = noteCount;
				totalNoteCount += noteCount;
				head++;
				sum += arr[i];
				amount = amount%arr[i];
				if(sum == amount)
					break;
			}
		}
		head--;
		System.out.println("Total numbers of Notes required are " + totalNoteCount);
		System.out.println("Notes are ");
		
		for(int i=0;i<=head;i++)
		{
			System.out.println(notesArr[i] + " note are "+ freqNotesArr[i]);
		}

	}

}
