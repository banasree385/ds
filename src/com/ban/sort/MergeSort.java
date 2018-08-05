package com.ban.sort;

public class MergeSort {
public  void sort(int[] a){
		int p=0; 
		int r=a.length-1;
		mergeSort(a,p,r );
		
	}
	
public static void mergeSort(int[]a,int piv,int re ){
if(piv<re){
	int q=(piv+re)/2;
	mergeSort(a,piv,q);
	mergeSort(a,q+1,re);
	merge(a,piv,q,re);
}
}

public  static void merge(int[]a,int start,int mid, int end){
//index counter for left side of the array
int leftSlot=start;
//index counter for right side of the array
System.out.println("mid"+mid);
int rightSlot=mid+1;
System.out.println("rightSlot"+rightSlot);


int[] tempArr=new int[end-start+1];
int k=0;
while(leftSlot<= mid && rightSlot<=end){
	if(a[leftSlot]<a[rightSlot]){
	tempArr[k]=a[leftSlot];
	leftSlot++;
	}
	else{
		tempArr[k]=a[rightSlot];
		rightSlot++;
	}
	k++;
}

if(leftSlot<= mid){
while (leftSlot<= mid){
	tempArr[k]	=a[leftSlot];
	leftSlot++;
	k++;
}}
else if(rightSlot<=end){
	while (rightSlot<= end){
	tempArr[k]	=a[rightSlot];
	rightSlot++;
	k++;}
}

for (int i=0;i<tempArr.length;i++){
	a[start+i]=tempArr[i];
}
}



	
	}
	
	

