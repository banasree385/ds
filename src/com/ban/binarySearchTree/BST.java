package com.ban.binarySearchTree;

public class BST {
	private Node root;
	public void insert(int key ,String value){
		Node newNode=new Node(key,value);
	if(root==null){
		root=newNode;}
	else{
		Node parent;
		Node current=root;
		while (true){
			parent=current;
			if(key<current.key){ //go to left child
			current=current.leftChild;
			if(current==null){parent.leftChild=newNode;return;}
			}
			else{//go to right child
			current=current.rightChild;
			if(current==null){parent.rightChild=newNode;return;}
			}
		}//end while
	}
	}
	
	public Node findNodeWithKey(int key){
		Node nodeFound=null;
		Node currentNode=root;
		boolean isLeftChild=false;
		while(key!=currentNode.key){
			if(key<currentNode.key){
				currentNode=currentNode.leftChild;
				isLeftChild=true;
			}
			else{
				currentNode=currentNode.leftChild;
				isLeftChild=false;
			}
		}	
		return currentNode;
	}
	
	public Node findMin(){
		Node current=root;
		Node last=null;
		while(current!=null){
			last=current;
			current=current.leftChild;
		}
		return last;
	}
	
	public void remove(int key){
		Node currentNode=root;
		Node parentNode=root;
		boolean isLeftChild=false;

		//find the node with key to delete
		Node nodeToDelete=null;
		while(key!=currentNode.key){
			parentNode=currentNode;
			if(key<currentNode.key){
				currentNode=currentNode.leftChild;
				isLeftChild=true;
			}
			else{
				currentNode=currentNode.leftChild;
				isLeftChild=false;
			}
					
		//if(currentNode==null) return false;
		}
		nodeToDelete=currentNode;
		//if node is leaf
		if(nodeToDelete.leftChild==null && nodeToDelete.rightChild==null){
			if(isLeftChild){parentNode.leftChild=null;}
			else parentNode.leftChild=null;
		}
		//if node has one child 
		else if(nodeToDelete.rightChild!=null ){
			if(isLeftChild) {parentNode.leftChild=nodeToDelete.rightChild;}
			else{parentNode.rightChild=nodeToDelete.rightChild;}
		}
        else if(nodeToDelete.leftChild!=null ){
        	if(isLeftChild) {parentNode.leftChild=nodeToDelete.leftChild;}
			else{parentNode.rightChild=nodeToDelete.leftChild;}
		}
		//if node has 2 childen(tricky)
        else{
        	
        	//find min  from rigt subtree
        	Node rightSubTree=nodeToDelete.rightChild;
        	
        	
        }
	}

}
