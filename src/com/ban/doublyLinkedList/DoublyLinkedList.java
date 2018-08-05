package com.ban.doublyLinkedList;

public class DoublyLinkedList {
Node first=null;
Node last=null;
public boolean isEmpty(){
	if (first==null) return true;
	else return false;
}
public void insertFirst(int data){
	Node newNode=new Node();
	newNode.data=data;
	if(isEmpty()){
		last=newNode;
	}
	else{
	first.previous=newNode;
	newNode.next=first;}	
	first=newNode;

}

public void insertLast(int data){
	Node newNode=new Node();
	if(isEmpty()){
		first=newNode;
	}
	else{
		last.next=newNode;
		newNode.previous=last;
	}
	last=newNode;

}
public Node deleteFirst(){
	Node temp=first;
	if(isEmpty()){
	temp= null;	
	}
	else if(first.next==null){
		first=null;
	}
	else{
     first.next.previous=null;
     
	}
  first=first.next;

return temp;
}

public boolean insertAfter(int key,int data){
	Node current=first;
	 
	while(current.data!=key){
		current=current.next;
		if(current==null){
			return false;
		}
	}
	Node newNode=new Node();
	newNode.data=data;
	if(current==last){
	     last =newNode;
	}
	else{
	newNode.next=current.next;
	current.next.previous=newNode;}
	newNode.previous=current;
	current.next=newNode;
	
	
	return false;
			
}

public Node deleteLast(){
	Node temp=last;
	if(isEmpty()){
		return null;
	}
	else if(last.next==null){
	first=null;	
	}
	else{
	last.previous.next=null;	
	}
	last=last.previous;
	return temp;
}

public Node deleteKey(int key){
	Node current=first;
	while(current.data!=key){
		current=current.next;
		if(current==null){
			return null;
		}
	}
	if(current==last){
		first=last=null;
	}
	current.previous.next=current.next;
	current.next.previous=current.previous;
	return current;
}

public void displayLinkedList(){
	Node current=first;
	while(current!=last){
		System.out.println(current.data);
		current=current.next;
	}
	System.out.println(current.data);

}
 
}
