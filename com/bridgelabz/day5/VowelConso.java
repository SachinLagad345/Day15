package com.bridgelabz.day5;

import java.util.Scanner;

public class VowelConso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = sc.next().toLowerCase().charAt(0);
		
		switch(ch)
		{
		case 'a' : System.out.println("Entered Character A is Vowel");
					break;
		case 'e' : System.out.println("Entered Character E is Vowel");
					break;
		case 'i' : System.out.println("Entered Character I is Vowel");
					break;
		case 'o' : System.out.println("Entered Character O is Vowel");
					break;
		case 'u' : System.out.println("Entered Character U is Vowel");
					break;
		default : System.out.println("Entered Character " + ch + " is consonant!" );
		}
		sc.close();
	}

}
