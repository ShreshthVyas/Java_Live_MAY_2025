package Lecture53;

import java.util.Arrays;

public class MinFallingPathSum {

	public int minFallingPathSum(int[][] matrix) {
		int dp[][] =  new int[matrix.length][matrix[0].length];
		int ans = Integer.MAX_VALUE;
		
		for (int[] is : dp) {
			Arrays.fill(is, -10001);
		}
		
		for (int i = 0; i < matrix[0].length; i++) {
			ans =  Math.min(ans, rec(matrix,dp,0,i));
		}
		
		return ans;
	}

	private int rec(int[][] matrix, int[][] dp, int cr, int cc) {
		// TODO Auto-generated method stub
		if(cc<0 || cc>=matrix[0].length) {
			return Integer.MAX_VALUE;
		}
		if(cr ==  matrix.length-1) {// arrived in last row
			return matrix[cr][cc];
		}
		if(dp[cr][cc]!= -10001) {
			return dp[cr][cc];
		}
		int ld = rec(matrix, dp, cr+1, cc-1);
		int d =  rec(matrix, dp, cr+1, cc);
		int rd =  rec(matrix, dp, cr+1, cc+1);
		
		return dp[cr][cc] = matrix[cr][cc] + Math.min(d, Math.min(ld, rd));
	}
}
