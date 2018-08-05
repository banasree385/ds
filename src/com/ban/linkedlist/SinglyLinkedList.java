package com.ban.linkedlist;

public class SinglyLinkedList {

	Node first=null;
	
	public boolean isEmpty(){
		if(first==null) return true;
		else return false;
	}
	public void insertFirst(int data){
	
	Node node=new Node();
	node.data=data;
	node.next=first;
	first=node;
	
		
	};
	
	public void displayLinkedList(){
		Node current=first;
		while(current!=null){
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	public Node deleteFirst(){
		Node temp=first;
		first=first.next;
		return temp;
	}
	public void insertLast(){
		
	}
	
}
