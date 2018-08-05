package com.ban.stack;

public class Stack {
int maxSize;
int top=-1;
long[] stackContent;
public Stack(int size) {
	super();
	this.maxSize =size;
	this.stackContent=new long[size];
}

public void push(int number) throws ArrayIndexOutOfBoundsException{
	//System.out.println("top"+top);
	if(top<maxSize-1){
	top++;
	stackContent[top]=number;
	}
	else{
		System.out.println("cant push");
	}
	
}

public long pop(){
	int oldTop=top;
	top--;
	return stackContent[oldTop];
}
public long peak(){
	return stackContent[top];
}
public boolean isFull(){
	return (maxSize-1==top);
}
public boolean isEmpty(){
	return (top==-1);
}


}
