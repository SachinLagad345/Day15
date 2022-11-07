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
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

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
		
		int choice=0;
		int head = 0;
		
		do
		{
			System.out.println("1.Add contact");
			System.out.println("2.Edit contact");
			System.out.println("3.Display address book");
			System.out.println("4.Exit");
			System.out.println("\nEnter your choice");
			
			choice = sc1.nextInt();
			
			switch(choice)
			{
			case 1:if(head < n)
				{
				arr[head] = adrs.createContact();
				head++;
				}
				else
					System.out.println("AddressBook full!! Cant add contact");
				break;
			case 2:
				if(head == 0)
					{
					System.out.println("No data in address book! Add contacts!");
					}
				else
				{
					System.out.println("Enter name of person to edit his details");
			String name = sc1.next();
			for(int i=0;i<head;i++)
			{
				if(arr[i].getFirstName().equalsIgnoreCase(name))
				{
					System.out.println("Change first name");
					String fname = sc1.next();
					arr[i].setFirstName(fname);
					
					System.out.println("Change last name");
					String lname = sc1.next();
					arr[i].setLastName(lname);
					
					System.out.println("Change address");
					String address = sc1.next();
					arr[i].setAddress(address);
					
					System.out.println("Change city");
					String city = sc1.next();
					arr[i].setCity(city);
					
					System.out.println("Change state");
					String state = sc1.next();
					arr[i].setState(state);
					
					System.out.println("Change zip");
					String zip = sc1.next();
					arr[i].setZip(zip);
					
					System.out.println("Change phone");
					String phone = sc1.next();
					arr[i].setPhone(phone);
					
					System.out.println("Change email");
					String email = sc1.next();
					arr[i].setEmail(email);
					break;
					}
					else if(i == head-1)
						System.out.println("Person with given name "+name+" does not exist!");
				}
				}
				break;
			case 3:		System.out.println("Displaying all contacts");
				for(int i=0;i<head;i++)
				{
					arr[i].display();
				}
			break;
			case 4: break;
			default: System.out.println("Please enter valid choice");
			}
			
		}while(choice!=4);
		
		sc1.close();
	}

}
