package com.bridgelabz.day4;

import java.util.Random;

public class SnakeAndLadder {

	int pos = 0;
	static int diecounter = 0; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SnakeAndLadder sn1 = new SnakeAndLadder();
		SnakeAndLadder sn2 = new SnakeAndLadder();
		int turn = 0;
		
		Random rn = new Random();
		
		while(sn1.pos < 100 && sn2.pos < 100)
		{
			int n = 1 + rn.nextInt(6);
			diecounter++;
			
			int opt = rn.nextInt(3);
			
			if(opt==0)
			{
				System.out.println("No play");
			}
			else if(opt == 1)
			{
				if(turn == 0)
				{
					if((sn1.pos+n) > 100 )
					{
						turn = 1;
						continue;
					}
					else
						sn1.pos += n;
					System.out.println("Ladder!! New position for Player 1 is " + sn1.pos);
					if(sn1.pos == 100)
					{
						System.out.println("Player 1 won the game!!!!");
					}
					turn = 1;
				}
				else
				{
					if((sn2.pos+n) > 100 )
					{
						turn = 0;
						continue;
					}
					else
						sn2.pos += n;
					System.out.println("Ladder!! New position for player 2 is " + sn2.pos);
					if(sn2.pos == 100)
					{
						System.out.println("Player 2 won the game");
					}
					turn = 0;
				}
			}
			else
			{
				if(turn == 0)
				{
					if(sn1.pos >= n)
					{
						sn1.pos -= n;
						System.out.println("Snake!! New position for Player 1 is " + sn1.pos);
						turn = 1;
					}
					else
					{
						sn1.pos = 0;
						System.out.println("Snake!! New position for Player 1 is " + sn1.pos);
						turn = 1;
					}
				}
				else
				{
					if(sn2.pos >= n)
					{
						sn2.pos -= n;
						System.out.println("Snake!! New position for Player 2 is " + sn2.pos);
						turn = 0;
					}
					else
					{
						sn2.pos = 0;
						System.out.println("Snake!! New position for Player 2 is " + sn2.pos);
						turn = 0;
					}
				}
			}
		
		}
		
		System.out.println("Number of times die rolled for winning is " + diecounter);
	}

}
