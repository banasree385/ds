package com.ban.gms.problems;

class MinCostPath {
	/* Driver program to test above functions */
	public static void main(String args[]) {
		int cost[][] = { { 1, 2, 3 }, { 4, 8, 2 }, { 1, 5, 3 } };
		System.out.println("minimum cost to reach (2,2) = " + minCost(cost, 2, 2));
		System.out.println("minimum cost to reach (1,2) = " + minCost(cost, 1, 2));

	}

	/* A utility function that returns minimum of 3 integers */
	private static int min(int x, int y, int z) {
		if (x < y)
			return (x < z) ? x : z;
		else
			return (y < z) ? y : z;
	}

	private static int minCost(int cost[][], int m, int n) {
		int i, j;
		int tc[][] = new int[m + 1][n + 1];

		tc[0][0] = cost[0][0];

		/* Initialize first column of total cost(tc) array */
		for (i = 1; i <= m; i++){
			tc[i][0] = tc[i - 1][0] + cost[i][0]; 
			System.out.print("cols:"+tc[i][0]);}
		System.out.println("");

		/* Initialize first row of tc array */
		for (j = 1; j <= n; j++){
			tc[0][j] = tc[0][j - 1] + cost[0][j];
			System.out.print("rows:"+tc[0][j]);}
		System.out.println("");

		/* Construct rest of the tc array */
		for (i = 1; i <= m; i++){
			for (j = 1; j <= n; j++){
				tc[i][j] = min(tc[i - 1][j - 1], tc[i - 1][j], tc[i][j - 1]) + cost[i][j];
				System.out.print("rr: "+tc[i][j]);}
			//System.out.println("");

				}

			

		return tc[m][n];
	}

}