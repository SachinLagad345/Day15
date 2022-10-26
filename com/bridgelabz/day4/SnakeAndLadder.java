package com.bridgelabz.day4;

import java.util.Random;

public class SnakeAndLadder {

	int pos = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SnakeAndLadder sn = new SnakeAndLadder();
		System.out.println("Player started at position " + sn.pos);
		
		Random rn = new Random();
		
		int n = 1 + rn.nextInt(6);
		System.out.println("Player 1 has got " + n);
	}

}
