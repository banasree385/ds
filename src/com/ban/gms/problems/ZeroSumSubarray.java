package com.ban.gms.problems;

import java.util.HashMap;
import java.util.Map;

class ZeroSumSubarray {

	// Returns true if arr[] has a subarray with sero sum
	static Boolean subArrayExists(int arr[]) {
		// Creates an empty hashMap hM
		HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
		// Initialize sum of elements
		int sum = 0;
		// Traverse through the given array
		for (int i = 0; i < arr.length; i++) {
			// Add current element to sum
			sum += arr[i];
			// Return true in following cases
			// a) Current element is 0
			// b) sum of elements from 0 to i is 0
			// c) sum is already present in hash map
			if (arr[i] == 0 || sum == 0 || hM.get(sum) != null)
				return true;
			// Add sum to hash map
			hM.put(sum, i);
		}
		// We reach here only when there is
		// no subarray with 0 sum
		return false;
	}
	
static HashMap<Integer, Integer> getZeroSumSubArrays(int arr[]){
	HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
	HashMap<Integer, Integer> indexPair = new HashMap<Integer, Integer>();
	int sum=0;
	for (int i = 0; i < arr.length; i++) {
		sum += arr[i];
		if(sum == 0){
			indexPair.put(0, i)	;
		}
		if(sumMap.get(sum)!=null){
			indexPair.put(sumMap.get(sum)+1, i)	;	
		}
		sumMap.put(sum, i);

		
	}
return indexPair;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int arr[] = {-3, 2, 3, 1, 6};
		int arr[] = { 6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7 };
		if (subArrayExists(arr))
			System.out.println("Found a subarray with 0 sum");
		else
			System.out.println("No Such Sub Array Exists!");
		
		HashMap<Integer,Integer> out=getZeroSumSubArrays(arr);
	}

}
