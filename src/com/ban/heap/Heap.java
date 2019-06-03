package com.ban.heap;

public class Heap {
	
	private Node[] heapArray;
	private int maxSize;
	private int currentSize;
	public Heap(int maxSize) {
		super();
		this.maxSize = maxSize;
		currentSize=0;
		heapArray=new Node[maxSize];
	}
	
	public int getSize(){
		return	currentSize;
	}
	public boolean isEmpty(){
		return	currentSize==0;
	}
	
	public boolean insert(int key){
		if(currentSize==maxSize){//array full
			return false;
		}
		Node newNode=new Node(key);
		heapArray[currentSize]=newNode;
		/*trickle up*/
		trickleUp(currentSize);
		currentSize++;
		return true;
	}

	private void trickleUp(int index) {
		// TODO Auto-generated method stub
		int parentIndex=(index-1)/2;
		Node nodeToInsert=heapArray[index];
		 /*loop as long as we hit root and key of the parent is less than new node*/
		while(index>0 && heapArray[parentIndex].getKey()<nodeToInsert.getKey()){			
			heapArray[index]=heapArray[parentIndex];
			index=parentIndex;
			parentIndex=(parentIndex-1)/2; //moving up
		}
		heapArray[index]=nodeToInsert;
		
	}
	 
	
	

}
