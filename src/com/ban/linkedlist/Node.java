package com.ban.linkedlist;

public class Node {

	int data;
	Node next=null;
	public Node(){
		super();	
	}
	public Node(int data,Node node){
		super();
		this.data=data;
		this.next=node;
	}
}
