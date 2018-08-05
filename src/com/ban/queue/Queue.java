package com.ban.queue;

public class Queue {
 private int maxSize;
 private int front;
 private int rear;
 private long queueArr[];
 private int nItem;
 
 
 public Queue(int size){
	 this.maxSize=size;
	 this.queueArr=new long[size];
	 this.front=0;
	 this.rear=-1;
	 this.nItem=0;
	 
 }
 
 public void insert(long n){
/* if (front==maxSize){
		 System.out.println("full");
		 rear++;
	 }*/
	 queueArr[front]=n;
	 front++;
	 rear++;
	 nItem++;
 }
 
 public void view(){
	 for(int i=0;i<maxSize;i++){
		System.out.println(queueArr[i]); 
	 }
 }
 public boolean isEmpty(){
	 if(rear==-1){
		 return true;
	 }
	 else return false;
 }
 public boolean isFull(){
	 if(rear==0){
		 return true;
	 }
	 else return false;
 }
 
 public long peakFront(){
	 return queueArr[front];
 }
 
}
