package Lecture53;

import java.util.Arrays;

public class MinFallingPathsum2 {

	public int minFallingPathSum(int[][] grid) {
		int dp[][] =  new int[grid.length][grid[0].length];
		int ans = Integer.MAX_VALUE;
		
		for (int[] is : dp) {
			Arrays.fill(is, -20001);
		}
		
		for (int i = 0; i < grid[0].length; i++) {
			ans =  Math.min(ans, rec(grid,dp,0,i));
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
		if(dp[cr][cc]!= -20001) {
			return dp[cr][cc];
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < matrix[0].length; i++) {
			if(i!=cc) {
				ans =  Math.min(ans, rec(matrix, dp, cr+1, i));
			}
		}
		return dp[cr][cc]  = matrix[cr][cc] + ans;
		
	}
}
