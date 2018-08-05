package com.ban.sort;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={38,2,57,1,13,70};
int b[]=selectionSort(a);
int c[]=bubbleSort(a);
int d[]=insertionSort(a);
int e[]={38,2,57,1,13,70};;
MergeSort ms=new MergeSort();
ms.sort(e);
for(int i=0;i<b.length;i++){
	System.out.print(b[i]+ " , ");
}
System.out.println( "**************************");

for(int i=0;i<c.length;i++){
	System.out.print(c[i]+ " , ");
}
System.out.println( "**************************");

for(int i=0;i<d.length;i++){
	System.out.print(d[i]+ " , ");
}
System.out.println( "************************** merge***************");

for(int i=0;i<e.length;i++){
	System.out.print(e[i]+ " , ");
}


	}
	public static int[] selectionSort(int[] a){
		//int p=0;
		int min=0;
		int temp;
		for (int p=0;p<a.length;p++){
			min=p;
			for (int q=p+1;q<a.length;q++){
				if (a[q]<a[min]){
					min=q;					
				}				
			}
			temp=a[p];
			a[p]=a[min];
			a[min]=temp;
			
		}
		return a;
	}
	public static int[] bubbleSort(int[] a){
		//int p=0;
		int temp;
		for (int p=0;p<a.length;p++){
			for (int q=p+1;q<a.length;q++){
				if (a[q]<a[p]){
					temp=a[p];
					a[p]=a[q];
					a[q]=temp;					
				}				
			}
			
			
		}
		return a;
	}
	
	public static int[] insertionSort(int[] a){
		//int insertionPoint=0;
		for (int i=1;i<a.length;i++){
			int element=a[i];
			int j=i-1;
			while(j>=0&&a[j]>element){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=element;
		}
		return a;
	}
	
	public static int[] mergeSort(int[] a){
	return a;	
	}

}
