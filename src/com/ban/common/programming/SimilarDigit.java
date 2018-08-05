package com.ban.common.programming;

public class SimilarDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(similarDigit(12,56));
		
	}
	
	public static boolean similarDigit(int a , int b){
		int aLen= Integer.toString(a).length();
		String aStr= Integer.toString(a);

		int[] aDigit=new int[aLen];
		while(b>0){
			if(aStr.contains(Integer.toString(b%10))){
				return true;
			}
			else{
				b=b/10;
			}
		}
	

		return false;
	}

}
