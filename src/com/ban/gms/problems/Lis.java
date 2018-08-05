package com.ban.gms.problems;

import java.util.ArrayList;
import java.util.List;

public class Lis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={10,22,9,33,21,50,41,60 ,80};
		int len=getLis(arr);
		System.out.println("lengthe is"+len);

	}
	
	
	static int getLis(int[] arr){
		if (arr.length==0) {return 0;}
		int num=arr[0];
		List<Integer> lis=new ArrayList<Integer>();
		lis.add(num);
		for (int i=1;i<arr.length;i++){
			if(arr[i]>num){
			lis.add(arr[i]);	
			}
			else{
				lis.add(arr[i]);
				lis.remove(Integer.valueOf(num));
			}
			num=arr[i];
		}
		for (int i=0;i<lis.size();i++){
			System.out.println("lis--"+lis.get(i));
		}
		return lis.size();
	}

}
