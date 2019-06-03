package com.ban.common.programming;

import java.util.HashMap;
import java.util.Hashtable;

public class MultipleDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hmap=new HashMap();
		
		int a[]={20, 34, 21, 87, 92, 87,34,77,43,34,20,20,20,20};
		for(int i=0;i<a.length;i++){
			
			if(hmap.containsKey(a[i])==true){
				
			hmap.put(a[i],hmap.get(a[i])+1);	
			}
			else{
				hmap.put(a[i], 1);	
			}
		}
		System.out.println(hmap.values());

	}

}
