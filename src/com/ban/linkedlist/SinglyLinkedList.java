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
	
	public boolean insertInPosition(int data, int pos){
	boolean flag =false;
	if(isEmpty() && pos==0){
		insertFirst(data);	
		flag=true;

	}
	else if(isEmpty()& pos>0){
		System.out.println("position invalid. ll is empty");
	}
	else{
		int currentPos=0;
		Node current=first;
		Node prev=null;
		Node temp=null;
		while(current.next!=null ){
			prev=current;
			current=current.next;
			
			currentPos++;
			if(currentPos<pos){
				continue;
			}
			else if(currentPos==pos){
				temp=current;
				Node newNode=new Node(data,current);
				prev.next=newNode;
				flag=true;
				break;
				
			}
			else{
				break;
			}
		}
	}
	return flag;
	
	}
	public Node findMiddle(){
		Node middle=first;
		Node current=first;
		int count =1;
		while(current !=null){
			current =current.next;
			if(count%2==0){
			middle=middle.next;}
			count++;
			
		}
			
		return middle;
		
	}
	public  void reverseLl(){
		Node prev=null,current=first,temp;
		while(current!=null){
			temp=current.next;
			current.next=prev;
			prev=current;
			current=temp;
		}
		first=prev;
	
	}
	
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
