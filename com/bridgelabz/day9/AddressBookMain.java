package com.bridgelabz.day9;

class Contact {
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String zip;
	String email;
	String phone;
	
	Contact(String firstName,String lastName,String address,String city,String state,String zip,String email, String phone)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.email = email;
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
		System.out.print("Phone : "+phone);
	}
}

public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to address book");
		int number[] = {8,4,2,1,6,1,6,5,9,5}; 
		Contact con = new Contact("sachin", "lagad", "newasa", "Ahmednagar", "Maharashtra", "414603", "sachinlagad56@gmail.com", "8432626595");
		con.display();
	}

}
