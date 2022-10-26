package com.bridgelabz.day4;

import java.util.Random;

public class SnakeAndLadder {

	int pos = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SnakeAndLadder sn = new SnakeAndLadder();
		System.out.println("Player started at position " + sn.pos);
		
		Random rn = new Random();
		
		while(sn.pos < 100)
		{
			int n = 1 + rn.nextInt(6);
			System.out.println("Player 1 has got " + n);
			
			int opt = rn.nextInt(3);
			
			if(opt==0)
			{
				System.out.println("No play");
			}
			else if(opt == 1)
			{
				if((sn.pos+n) > 100 )
					continue;
				else
					sn.pos += n;
				System.out.println("Ladder!! New position is " + sn.pos);
			}
			else
			{
				if(sn.pos >= n)
				{
					sn.pos -= n;
					System.out.println("Snake!! New position is " + sn.pos);
				}
				else
				{
					sn.pos = 0;
					System.out.println("Snake!! New position is " + sn.pos);
				}
			}
		
		}
	}

}
