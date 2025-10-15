package Lecture52;

import java.util.Arrays;

public class coinchanges2 {
	public static void main(String[] args) {
		int coin[] = { 1, 2, 5 };
		int amount = 5;

		Integer dp[][] = new Integer[amount + 1][coin.length + 1];
//		for (int[] is : dp) {
//			Arrays.fill(is, -1);
//		}
		int ans = dptd(coin, amount, 0, dp);
	}

	private static int dptd(int[] coin, int amount, int i, Integer[][] dp) {
		// TODO Auto-generated method stub
		if (amount == 0) {
			return 1;
		}
		if (i >= coin.length) {
			return 0;
		}
		if (dp[amount][i] != null) {
			return dp[amount][i];
		}
		int inc = 0;
		int exc = 0;
		if (amount >= coin[i]) {
			inc = dptd(coin, amount - coin[i], i, dp);
		}
		exc = dptd(coin, amount, i + 1, dp);
		return dp[amount][i] = inc + exc;
	}

	public int change(int amount, int[] coin) {
		int dp[][] =  new int[coin.length+1][amount+1];
		for (int i = 0; i < dp.length; i++) {//amount =  0 means 1 way
			dp[i][0] = 1;
		}
		for (int i = 1; i < dp.length; i++) {
			for (int am = 1; am < dp[0].length; am++) {
				int inc = 0;int exc = 0;
				if (am >= coin[i-1]) {
					inc = dp[i][am-coin[i-1]];
				}
				exc = dp[i-1][am];
				dp[i][am] = inc+exc;
			}
		}
		
		for (int[] is : dp) {
			System.out.println(Arrays.toString(is));
		}
		return dp[dp.length-1][dp[0].length-1];
	}

}
