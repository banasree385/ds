package com.ban.common.programming;

public class Parenthesis {

	
	static class Stack{
		static int top;
		static char[] a;
		Stack(int size){
			top=-1;
			a=new char[size];
		}
		static void push(char ch){
			a[++top]=ch;
		}
		
		static char pop(){
			if(top==-1){
				System.out.println("stack is empty");
			}
			else{
		int oldTop=top;
		top --;
		return a[oldTop];
		}
			return 0;
	}
	}
	static boolean getClosingParen(char open,char close){
		if(open=='('&& close==')'){return true;}
		if(open=='{'&& close=='}'){return true;}
		if(open=='['&& close==']'){return true;}
		else return false;
	}
	static int checkParenBalance(String input){	
		char[] inputArr=input.toCharArray();
        Stack st=new Stack(inputArr.length);
		   for (int i=0;i<inputArr.length;i++){
		    	  if(inputArr[i]=='('||inputArr[i]=='{'||inputArr[i]=='['){
		    		st.push(inputArr[i]);  
		    	  }
		    	  else{
		    		  char val=st.pop();   	  
		    		  if(!getClosingParen(val,inputArr[i])){return i; }
		    	  }
		      }
	return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="{{[[([]]]}}";
		System.out.println("index"+checkParenBalance(input));
		
        
   
	}


}
