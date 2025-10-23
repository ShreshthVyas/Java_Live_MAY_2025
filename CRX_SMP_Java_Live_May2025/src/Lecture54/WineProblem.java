package Lecture54;

import java.util.Arrays;

public class WineProblem {
	public static void main(String[] args) {
		int wine[] =  {2,4,6,2,5};
		int dp[][] =  new int[wine.length][wine.length];
//		int ans  =  dptd(wine,0,wine.length-1,1,dp);
		int ans  =  dpbu(wine);
		System.out.println(ans);
	}

	private static int dptd(int[] wine, int i, int j, int year, int dp[][]) {
		// TODO Auto-generated method stub
		if(i>j) {
			return 0;
		}
		if(dp[i][j]!=0) {
			return dp[i][j];
		}
		int front = wine[i] * year + dptd(wine, i+1, j, year+1,dp);
		int back = wine[j] * year + dptd(wine, i, j-1, year+1,dp);
		return dp[i][j] = Math.max(front, back);
	}
//	private static int rec(int[] wine, int i, int j, int year) {
//		// TODO Auto-generated method stub
//		if(i>j) {
//			return 0;
//		}
//		int front = wine[i] * year + rec(wine, i+1, j, year+1);
//		int back = wine[j] * year + rec(wine, i, j-1, year+1);
//		return Math.max(front, back);
//	}
	
	public static int dpbu(int wine[]) {
		int dp[][] =  new int[wine.length][wine.length];
		int year =  wine.length;
		
		//last year is  main diagonal where i == j
		
		for (int i = 0; i < dp.length; i++) {
			dp[i][i] = wine[i] *year;
		}
		
		year -- ;
		
		for (int d = 1; d < dp.length; d++) {
			for (int j = d; j < dp.length; j++) {
				int i =  j-d;
				int f = wine[i] * year + dp[i+1][j];
				int l = wine[j] * year + dp[i][j-1];
				dp[i][j] =  Math.max(f, l);
			}
			year--;
		}
		for (int[] is : dp) {
			System.out.println(Arrays.toString(is));
		}
		return dp[0][dp[0].length-1];
		
	}
}
