package com.ban.linkedlist;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node nodeA=new Node();
		nodeA.data=11;
		Node nodeB=new Node();
		nodeB.data=22;
		Node nodeC=new Node();
		nodeC.data=33;
		Node nodeD=new Node();
		nodeD.data=44;
		
		nodeA.next=nodeB;  
		nodeB.next=nodeC;
		nodeC.next=nodeD;
		//System.out.println(getListLength(nodeB));
		
		SinglyLinkedList sll=new SinglyLinkedList();

	sll.insertFirst(11);
	sll.insertFirst(22);
	sll.insertFirst(33);
	sll.displayLinkedList();

	Node deleted=sll.deleteFirst();
	System.out.println("deleted"+deleted.data);
	sll.displayLinkedList();

	}
		
		public static int getListLength(Node node){
			int length=1;
			Node currentNode=node;
			while(node.next!=null){
				length++;
				currentNode=currentNode.next;
			}
			return length;
		}
		

}
