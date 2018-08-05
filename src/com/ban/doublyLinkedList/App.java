package com.ban.doublyLinkedList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DoublyLinkedList dll=new DoublyLinkedList();
dll.insertFirst(99);
dll.insertFirst(66);
dll.insertFirst(55);
dll.displayLinkedList();
dll.insertAfter(66, 77);
System.out.println("after insertion");
dll.displayLinkedList();
dll.deleteKey(55);
System.out.println("after delete first key");
dll.displayLinkedList();



		
	}

}
