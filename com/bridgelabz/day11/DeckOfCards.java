package com.bridgelabz.day11;

import java.util.ArrayList;
import java.util.Random;

class Player {
	ArrayList<Integer> cardType = new ArrayList<Integer>();
	ArrayList<Integer> cardRank = new ArrayList<Integer>();
	String suit[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
	String rank[] =  {"2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"};
	
	public void addCard(int type, int rank)
	{
		cardType.add(type);
		cardRank.add(rank);
	}
	
	public void displayCards(int num)
	{
		System.out.println("Player " + (num+1) + " cards are : ");
		for(int i=0;i<cardType.size();i++)
		{
			System.out.println("Card is " + suit[cardType.get(i)] + " " + rank[cardRank.get(i)]);
		}
		System.out.println("");
	}
}

public class DeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		Player p4 = new Player();
		Player plarr[] = {p1,p2,p3,p4};
		Random rd = new Random();
		
		for(int i=0;i<9;i++)
		{
			int type = rd.nextInt(4);
			int rnk = rd.nextInt(13);
			if(i<4)
				plarr[i].addCard(type, rnk);
			else
				plarr[i%4].addCard(type, rnk);
		}
		
		System.out.println("Displaying cards of players : ");
		
		for(int i=0;i<plarr.length;i++)
		{
			plarr[i].displayCards(i);
		}
	}

}
