package com.ban.binarySearchTree;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Node a =new Node(53,"root");
		Node b =new Node(46,"left child");
		Node c =new Node(92,"rightchild");
		Node d =new Node(34,"grandChild1");
		Node e =new Node(99,"grandChild2");*/
		
		BST bst=new BST();
		bst.insert(53, "root");
		bst.insert(46, "left child");
		bst.insert(92, "rightchild");
		bst.insert(34, "grandChild1");
		bst.insert(99, "grandChild2");
		
		Node min=bst.findMin();
		System.out.println(min.value);
		Node nodeFound=bst.findNodeWithKey(46);
		System.out.println("power"+power(3,5));

		System.out.println("1:"+ bst.findNodeWithKey(46));
		System.out.println("1:"+ bst.findNodeWithKey(90));

	}
	
	static int power(int x, int y) 
    { 
        if (y == 0) 
            return 1; 
        else if (y % 2 == 0) 
            return power(x, y / 2) * power(x, y / 2); 
        else
            return x * power(x, y / 2) * power(x, y / 2); 
    } 

}
