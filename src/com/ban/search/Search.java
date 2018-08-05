package com.ban.search;

public class Search {
	
	public static void main(String args[]){
		
		int[] a={2,3,6,9,11,17,19};
		int x=11;
		
		System.out.println("linear"+linearSearch(a,x));
		System.out.println("binary"+linearSearch(a,x));
		System.out.println("recursive linear"+recursiveLinearSearch(a,0,x));
		System.out.println("recursive binary"+recursiveBinarySearch(a,0,a.length-1,x));


	}
	public static int linearSearch(int[] a,int x){
		for (int i=0;i<a.length;i++){
			if(a[i]==x){
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] a,int x){
		int p=0,r=a.length-1,q;
		while(p<r){
			q=(p+r)/2;
			if(a[q]==x){return q;}
			else if(a[q]>=x){r=q-1;}
			else p=q+1;
				}
		
		return -1;
	}
	public static int recursiveLinearSearch(int[] a,int i,int x){
		
		if (i>(a.length-1)) return -1;
		else if(a[i]==x) return i;
		else return recursiveLinearSearch(a,i+1,x);
		
		
  	
	}
	
	public static int recursiveBinarySearch(int[] a,int p,int r,int x){
     System.out.println("["+p+"..."+r+"]");
		if (p>r) return -1;
		/*else if(a[(p+r)/2]==x) return (p+r)/2;
		else if(a[(p+r)/2]>=x)return recursiveBinarySearch(a,p,((p+r)/2)-1,x);
		else return recursiveBinarySearch(a,((p+r)/2)+1,r,x);*/
		else{
			int q=(p+r)/2;System.out.println("q is"+q);
			if(a[q]==x) return q;
			else if(a[q]>x) return recursiveBinarySearch(a,p,q-1,x);
			else  return recursiveBinarySearch(a,q+1,r,x);

		}
		
		
  	
	}

	

}
