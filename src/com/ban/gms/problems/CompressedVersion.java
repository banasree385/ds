package com.ban.gms.problems;

public class CompressedVersion {
	
	public static void main(String args[]){
		System.out.println(compress("a"));
	}

	
	static String compress(String str){
		String compressedStr="";
		char temp;
		if(str.isEmpty()){ return compressedStr;}
		temp=str.charAt(0);
		int count=1;
		for (int i=1;i<str.length();i++){
		if(temp==str.charAt(i)){
		count++;	
		}
		else{
			compressedStr=compressedStr+temp+count;
			temp=str.charAt(i);
			count=1;
		}
		}
		compressedStr=compressedStr+temp+count;
		
		

		return compressedStr;
		
	}
}
