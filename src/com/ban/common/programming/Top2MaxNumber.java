package com.ban.common.programming;

public class Top2MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={20, 34, 21, 87, 92, 2147483647};
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for (int i=0;i<a.length;i++){
			if(a[i]>max1){
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2){
				max2=a[i];
			}
		}
		
		System.out.println(max1+"=="+max2);

	}

}
