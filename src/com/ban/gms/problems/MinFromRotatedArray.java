package com.ban.gms.problems;

public class MinFromRotatedArray {

	static int findMin(int[] a,int p,int r){
				
		int q=0;
		//while(p<r){
		q=(p+r)/2;
		if(p==q){return a[0];} 
		if((p<r)&&a[q-1]>a[q])
		{
			return a[q];}
		if((p<r)&&a[q+1]<a[q])
		{return a[q+1];};
		if((p<r)&&a[r]>a[q])
		{
			return findMin(a,p,q-1);};
		return findMin(a,q+1,r);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] =  {5, 6, 1, 2, 3, 4};
		int arr8[] =  {2, 3, 4, 5, 6, 7,8};
		int arr9[] =  {3, 4, 5, 1, 2};
		System.out.println("min value"+findMin(arr1,0,arr1.length-1));
		System.out.println("min value"+findMin(arr9,0,arr9.length-1));
		System.out.println("min value"+findMin(arr8,0,arr8.length-1));


	}

}
