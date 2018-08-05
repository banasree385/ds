package com.ban.gms.problems;


import java.util.*;
import java.lang.*;
import java.io.*;

class Knapsack {
	public static void main (String[] args) {

		int t=1;
	while(t>0)
	{
	    int n= 3   ;       
	    int w= 4   ;            
	    int val[]={1, 2, 3};
	    int wt[]={4, 5, 1};
	    int ans=findKnapSack(w,wt,val,n);
	    System.out.println("ans"+ans);
	    t--;
	}
	}
	static int findKnapSack(int W, int wt[], int val[], int n)
    {
     int i, w;
     int K[][] = new int[n+1][W+1];
      
     // Build table K[][] in bottom up manner
     for (i = 0; i <= n; i++)
     {
         for (w = 0; w <= W; w++)
         {
             if (i==0 || w==0)
                  K[i][w] = 0;
             else if (wt[i-1] <= w)
                   K[i][w] = Math.max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
             else
                   K[i][w] = K[i-1][w];
         }
      }
      
      return K[n][W];
    }
	
	

}
