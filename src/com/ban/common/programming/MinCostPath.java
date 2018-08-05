package com.ban.common.programming;

public class MinCostPath {
	public static void main(String args[]){
		//int[][] cost={{2,3,5},{1,5,4},{5,3,4}};
		int cost[][] = { { 1, 2, 3 }, { 4, 8, 2 }, { 1, 5, 3 } };

		System.out.println("mincost 3,3="+findMinCost(cost,2,2));
	}
	
	public  static int findMinCost(int[][] cost,int m,int n){
		int minCost=0;
		int[][] tc=new int[m+1][n+1];
		tc[0][0]=cost[0][0];
		/*develop first column*/
		for (int i=1;i<=m;i++){
			tc[i][0]=tc[i-1][0]+cost[i][0];
		}
		/*develop first row*/
		for (int j=1;j<=n;j++){
			tc[0][j]=tc[0][j-1]+cost[0][j];
		}
		
		/*develop other elements*/
		for (int i=1;i<=m;i++){
			for (int j=1;j<=n;j++){
				tc[i][j]=min(tc[i][j-1],tc[i-1][j],tc[i-1][j-1])+cost[i][j];				
			}
		}
		return tc[m][n];

	}
	
	public static int min(int x,int y,int z){
	if(x<y)	
		return (x<z)?x:z;
	else
		return(y<z)?y:z;
	}

}
