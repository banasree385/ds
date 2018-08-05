package com.ban.gms.problems;



public class BalanceParanthesis {
	
	public static void main(String args[]){

		int pos=checkParethesisBalance("{()}}");
		System.out.println("pos---------:hhh"+pos);
	}
	
	static int checkParethesisBalance(String input){
	int pos=0;
	Stack theStack=new Stack(input.length());

    for(int i=0;i<input.length();i++){
    	if(input.charAt(i)=='('
    			||input.charAt(i)=='{'||input.charAt(i)=='{'){
    		theStack.push(input.charAt(i));
    	}
    	if(input.charAt(i)==')'
    			||input.charAt(i)=='}'||input.charAt(i)=='}'){
    		char popped=theStack.pop();
    		System.out.println("popped"+popped);
    	if(!isMatching(popped,input.charAt(i))){
    		pos= -1;
    		return pos;
    	}
    	else{System.out.println("output pos"+i);}
    	}
    }
    if(theStack.top!=-1){
    	pos=-1;
    }
    
	return pos;
	}
	
	static boolean isMatching(char char1,char char2){
		if((char1=='('&&char2==')')
				||(char1=='{'&&char2=='}')||(char1=='['&&char2==']')){
					return true;
				}
		else return false;		
	}
	
	static class Stack{
		
		char[] stackContent;;
		int top=-1;
		int maxSize;
		public Stack(int size) {
			super();
			this.maxSize =size;
			this.stackContent=new char[size];
		}
		void push(char a){
			if(top<maxSize){
				top++;
				stackContent[top]=a;
			}
			else{
				System.out.println("cant push");
			}
		}
		
		char pop(){
			if(top!=-1){
				int oldTop=top;
				top--;
				return stackContent[oldTop]; 
			}
			else{
				System.out.println("underflow error");
				return '\0';
			}
		}
		
		
		
	}

}
