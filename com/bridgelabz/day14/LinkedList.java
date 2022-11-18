package com.bridgelabz.day14;

class Node {
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

public class LinkedList {
	Node head;
	
	LinkedList(Node n1,Node n2,Node n3)
	{
		head = n1;
		head.next = n2;
		n2.next = n3;
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
		
		Node n1 = new Node(56);
		Node n2 = new Node(30);
		Node n3 = new Node(70);
		
		LinkedList li = new LinkedList(n1,n2,n3);
		li.display();
	}

}
