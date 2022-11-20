package com.bridgelabz.day14;

class Node<T extends Comparable<T>> {
	T data;
	Node next;
	
	Node(T data)
	{
		this.data = data;
		this.next = null;
	}
}

public class LinkedList<T extends Comparable<T>> {
	Node head;
	
	public void addFirst(T data) 
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
	
	public void addLast(T data)
	{
		Node newnode = new Node(data);
		Node tempnode = head;

		if(head == null)
		{
			head = newnode;
			return;
		}
		
		while(tempnode.next != null)
		{
			tempnode = tempnode.next;
		}
		tempnode.next = newnode;
	}
	
	public void add(T data,int index)
	{
		int i = 1;
		Node newnode = new Node(data);
		Node prevnode = head;
		Node tempnode = head.next;
		
		if(head == null) {
			addFirst(data);
			return;
		}

		while(tempnode != null)
		{
			if(i == index)
			{
				prevnode.next = newnode;
				newnode.next = tempnode;
				return;
			}
			else
			{
				i++;
				prevnode = prevnode.next;
				tempnode = tempnode.next;
			}
		}
		
		addLast(data);
	}
	
	public void deleteFirst()
	{
		if(head == null)
		{
			System.out.println("List is empty! nothing to remove!");
			return;
		}
		head = head.next;
	}
	
	public void deleteLast()
	{
		if(head == null)
		{
			System.out.println("List is empty! nothing to remove!");
		}
		Node secondLast = head;
		Node last = head.next;
		
		while(last.next != null)
		{
			secondLast = secondLast.next;
			last = last.next;
		}
		secondLast.next = null;
	}
	
	public void delete(T data)
	{
		if(head == null)
		{
			System.out.println("List is empty! Nothing to delete!");
			return;
		}
		
		if(head.data == data)
		{
			deleteFirst();
			return;
		}
	
		Node prevnode = head;
		Node currnode = head.next;
		Node nextnode = currnode.next;
		
		while(nextnode != null)
		{
			if(currnode.data == data)
			{
				prevnode.next = nextnode;
				return;
			}
			else
			{
				prevnode = prevnode.next;
				currnode = currnode.next;
				nextnode = nextnode.next;
			}
		}
		
		if(currnode.data == data)
		{
			prevnode.next = null;
			return;
		}
		System.out.println(data + " does not exist in List!");
	}
	
	public void size()
	{
		int l = 0;
		Node tempnode = head;
		while(tempnode != null)
		{
			l++;
			tempnode = tempnode.next;
		}
		System.out.println("Size of list is " + l);
	}
	
	public int search(T data)
	{
		if(head == null)
		{
			System.out.println("List is empty!");
			return 0;
		}
		Node tempnode = head;
		int i=1;
		while(tempnode != null)
		{
			if(tempnode.data == data)
			{
				System.out.println(data + " present in linked list");
				return i;
			}
			else {
				tempnode = tempnode.next;
				i++;
			}
		}
		System.out.println(data + " element is not present!");
		return 0;
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
		
		LinkedList<Integer> li = new LinkedList();

		li.addLast(56);
		li.addLast(70);
		li.display();
		li.add(30, 1);
		li.display();
		//li.deleteFirst();
		//li.display();
		//li.deleteLast();
		//li.display();
		int ind = li.search(30);
		li.add(40, ind);
		li.display();
		li.delete(40);
		li.display();
		li.size();
		
		SortedLinkedList sl = new SortedLinkedList();
		sl.add(56);
		sl.add(30);
		sl.add(40);
		sl.add(70);
		sl.display();
	}

}

class SortedLinkedList<T extends Comparable<T>> extends LinkedList { 
	
	public void add(T data)
	{
		if(head == null)
		{
			addFirst(data);
			return;
		}
		Node tempnode = new Node(data);
		if(head.next == null)
		{
			if(head.data.compareTo(data) > 0)
			{
				tempnode.next = head;
				head = tempnode;
			}
			else
			{
				head.next = tempnode;
			}
			return;
		}
		Node slnode = head;
		Node currnode = head.next;
		
		while(currnode.next != null)
		{
			if(slnode.data.compareTo(data) > 0 && currnode.data.compareTo(data) < 0)
			{
				slnode.next = tempnode;
				tempnode.next = currnode;
				return;
			}
			else
			{
				slnode = slnode.next;
				currnode = currnode.next;
			}
		}
		if(currnode.data.compareTo(data) > 0)
		{
			slnode.next = tempnode;
			tempnode.next = currnode;
			return;
		}
		currnode.next = tempnode;
	}
}
