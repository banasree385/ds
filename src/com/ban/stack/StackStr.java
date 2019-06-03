package com.ban.stack;

public class StackStr {

	int maxSize;
	int top=-1;
	char[] stackContent;
	
	public StackStr(int maxSize){
		super();
		this.maxSize=maxSize;
		this.stackContent=new char[maxSize];
		
	}
	
	public char pop(){
		if(top==-1) return 0;
		
		else{
			char value= stackContent[top];
			top--;
			return value;
			}	
	}
	
	public void push(char ch){
		if(top<maxSize-1){
			top++;
			stackContent[top]=ch;
		}
		else{
			System.out.println("cant add");

		}
	}
	
}
