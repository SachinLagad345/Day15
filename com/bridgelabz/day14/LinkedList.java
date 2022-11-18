package com.bridgelabz.day14;

class Node {
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class LinkedList {

	Node head;
	
	public void addFirst(int data) 
	{
		Node newnode = new Node(data);

		if(head == null)
		{
			head = newnode;
			return;
		}
		newnode.next = head;
		head = newnode;
	}
	
	public void display()
	{
		if(head == null)
		{
			System.out.println("Linked List ie ");
		}
		Node tempnode = head;
		
		while(tempnode.next != null)
		{
			System.out.print(tempnode.data + "=>");
			tempnode = tempnode.next;
		}
		System.out.println(tempnode.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList li = new LinkedList();
		li.addFirst(70);
		li.addFirst(30);
		li.addFirst(56);
	
		li.display();
	}

}
