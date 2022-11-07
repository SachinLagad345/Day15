package com.bridgelabz.day9;

import java.util.Scanner;

class Contact {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String email;
	private String phone;
	
	public void display()
	{
		System.out.print("First Name : "+firstName+"\t");
		System.out.print("Last Name : "+lastName+"\t");
		System.out.print("Address : "+address+"\t");
		System.out.print("City : "+city+"\t");
		System.out.print("State : "+state+"\t");
		System.out.print("Zip : "+zip+"\t");
		System.out.print("Email : "+email+"\t");
		System.out.print("Phone : "+phone+"\n");
	}
	
	public Contact createContact()
	{
		Contact cs = new Contact();
		Scanner sc = new Scanner(System.in);
		System.out.println("Add new contact");
		System.out.println("Enter first name");
		cs.firstName = sc.next();
		
		System.out.println("Enter last name");
		cs.lastName = sc.next();
		
		System.out.println("Enter phone");
		cs.phone = sc.next();
		
		System.out.println("Enter address");
		cs.address = sc.next();
		
		System.out.println("Enter city");
		cs.city = sc.next();
		
		System.out.println("Enter state");
		cs.state = sc.next();
		
		System.out.println("Enter zip");
		cs.zip = sc.next();
		
		System.out.println("Enter email");
		cs.email = sc.next();

		return cs;
	}
}

public class AddressBookMain extends Contact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to address book");
		AddressBookMain adrs = new AddressBookMain();
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter no of elements to add in addressbook");
		int n = sc1.nextInt();
		Contact arr[] = new Contact[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = adrs.createContact();
		}
		
		System.out.println("Displaying all contacts");
		for(int i=0;i<n;i++)
		{
			arr[i].display();
		}
		
		sc1.close();
	}

}
