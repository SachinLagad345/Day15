package com.bridgelabz.day2;

import java.util.Scanner;

public class SwitchVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a character");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().toLowerCase().charAt(0);
		
		switch(ch)
		{
			case 'a':System.out.println(ch + " is vowel");
					break;
			case 'e':System.out.println(ch + " is vowel");
					break;
			case 'i':System.out.println(ch + " is vowel");
					break;
			case 'o':System.out.println(ch + " is vowel");
					break;
			case 'u':System.out.println(ch + " is vowel");
					break;
			default:System.out.println(ch + " is consonant");
		}
	}

}
