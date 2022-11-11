package com.bridgelabz.day11;

import java.util.Scanner;

class Stock {
	String name;
	int quantity;
	int price;
	
	Stock(String name, int quantity, int price)
	{
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
}

public class StockAccount {

	public void createReport(Stock arr[])
	{
		int sum = 0;
		System.out.println("\t\tSTOCK REPORT\n");
		System.out.print("Name\t");
		System.out.print("Quantity\t");
		System.out.print("Price\t");
		System.out.print("Value\n");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i].name+"\t");
			System.out.print(arr[i].quantity+"\t");
			System.out.print(arr[i].price+"\t");
			int val = arr[i].price * arr[i].quantity;
			System.out.print(val+"\t\n");
			sum += val;
		}
		
		System.out.println("\nTotal values of stocks is " + sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter number of stocks");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stock arr[] = new Stock[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name of "+ " share no. " + (i+1));
			String name = sc.next();
			System.out.println("Enter quantity of " + name + " share");
			int quantity = sc.nextInt();
			System.out.println("Enter price of " + name + " share");
			int price = sc.nextInt();
			arr[i] = new Stock(name,quantity,price);
		}
		
		StockAccount sca = new StockAccount();
		sca.createReport(arr);
	}

}
