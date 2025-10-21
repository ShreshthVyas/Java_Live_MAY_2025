package Lecture53;

import java.util.Arrays;

public class Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val[] = { 20, 5, 10, 40, 15, 25 };
		int wt[] = { 1,2,3,8,4};
		int cap = 10;
		Integer dp[][] =  new Integer[val.length][cap+1];
//		Arrays.fill(dp, -1);
		int ans = rec(val,wt, cap,0,dp);
		System.out.println(ans);
		
	}

	private static int rec(int[] val, int[] wt, int cap, int idx, Integer[][] dp) {
		// TODO Auto-generated method stub
		if(idx == val.length || cap == 0) {
			return 0;
		}
		if(dp[idx][cap]!=null) {
			return dp[idx][cap];
		}
		int inc = 0;int exc =0;
		if(cap>=wt[idx]) {
			inc = val[idx] + rec(val, wt, cap - wt[idx], idx+1, dp);
		}
		exc =  rec(val, wt, cap, idx+1, dp);
		
		return dp[idx][cap] =  Math.max(inc, exc);
	}

}
