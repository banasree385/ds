package com.ban.circularLinkedList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CircularLinkedList cll=new CircularLinkedList();
cll.insertFirst(11);
cll.insertFirst(22);
cll.insertFirst(33);
cll.displayLinkedList();
System.out.println("last.next" +cll.last.next.data);

cll.deleteFirst();
cll.displayLinkedList();
System.out.println("last.next" +cll.last.next.data);
	}

}
