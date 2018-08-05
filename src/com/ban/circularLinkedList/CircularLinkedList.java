package com.ban.circularLinkedList;


public class CircularLinkedList {
Node first;
Node last;

public CircularLinkedList() {
	super();
	this.first = null;
	this.last = null;
}

public boolean isEmpty(){
	if(first==null){
		return true;
	}
	else return false;
}

public void insertFirst(int data){
	Node newNode=new Node();
	newNode.data=data;
	if(isEmpty()){
		last=newNode;
	}
	else{
		newNode.next=first;
	}
	first=newNode;
	last.next=first;
}
 public int deleteFirst(){
	 Node temp=first;
	 if(first.next==null){
		 first=last=null;
	 }
	 first=first.next;
	 last.next=first;
	 return temp.data;
 }
 public void displayLinkedList(){
		Node current=first;
		while(current.next!=first){
			System.out.println(current.data);
			current=current.next;
		}
		System.out.println(current.data);

	}
}
