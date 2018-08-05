package com.ban.gms.problems;

public class PrintMinForPattern {
public static void main(String args[]){
	
}

void minForPattern(String arr){
	int[] result=new int[arr.length()+1];
	int minAvail;
	int nextIndex;
	if(arr.charAt(0)=='I'){
		result[0]=1;
		result[1]=2;		
	}
	else{
		result[0]=2;
		result[1]=1;
	}
	minAvail=3;
	nextIndex=2;
	for (int i=1;i<=arr.length();i++){
		if(arr.charAt(i)=='I'){
			result[nextIndex]=minAvail;	
		}
		else{
			int countD=0;
			while(arr.charAt(i)!='I'){
				countD++;
			}
			
			result[nextIndex-1]=minAvail;	
		}
	}
}

	
}

