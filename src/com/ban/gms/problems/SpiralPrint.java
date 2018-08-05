package com.ban.gms.problems;

public class SpiralPrint {
	static void printSpiral(int m,int n,int[][]a){
		int k=0, l=0,i=0;
		
		while(k<m&&l<n){
			/*print first row*/
			for(i=k;i<n;i++){
				System.out.print( a[k][i]+" ");
			}
			//System.out.println("k="+k);
			k++;
			/*print last column*/
			for(i=k;i<m;i++){
				System.out.print( a[i][n-1]+" ");
			}
			//System.out.println("n="+n);
			n--;
			/*print last row*/
			if(k<m){
			for(i=n-1;i>=0;i--){
				System.out.print( a[m-1][i]+" ");
			}
			//System.out.println("m="+m);
			}
			m--;
			/*print first column */
			if(l<n)	{
				for(i=m-1;i>=k;i--){
					System.out.print( a[i][l]+" ");
				}	
			}
			
			//System.out.println("k="+k);
			//System.out.println("l");
			l++;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int R = 4;
        int C = 4;
       /* int a[][] = { {1,  2,  3,  4,  5,  6},
                      {7,  8,  9,  10, 11, 12},
                      {13, 14, 15, 16, 17, 18},
                      {3,   4,  5,  6,  7,  8}
                    };*/
        int a[][] = { {1,  2,  3,  4},
                      {7,  8,  9,  10},
                      {13, 14, 15, 16},
                      {3,   4,  5,  6}
              };
        printSpiral(R,C,a);

	}

}
