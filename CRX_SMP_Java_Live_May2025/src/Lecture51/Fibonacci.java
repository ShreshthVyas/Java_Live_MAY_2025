package Lecture51;

import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  =50;
//		int dp[] = new int[n+1];
//		int ans = fibTD(n,dp);
//		System.out.println(ans);
//		System.out.println(Arrays.toString(dp));
		int ans = fibBU(n);
		System.out.println(ans);
	}
	private static int fibBU(int n) {
		// TODO Auto-generated method stub
		int dp[] = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		
		for (int i = 2; i < dp.length; i++) {
			int f1 = dp[i-1];
			int f2 =  dp[i-2];
			dp[i]  = f1+f2;
		}
		System.out.println(Arrays.toString(dp));
		return dp[n];
		
	}
	private static int fibTD(int n,int dp[]) {
		// TODO Auto-generated method stub
		if(n == 0 || n==1) {
			return n;
		}
		if(dp[n]!=0) { //nth fibonacci is already calculated
			return dp[n];
		}
		int f1 = fibTD(n-1,dp);
		int f2 =  fibTD(n-2,dp);
		return dp[n] = f1+f2;// yaad karna 
	}
	
//	private static int fib(int n) {
//	// TODO Auto-generated method stub
//	if(n == 0 || n==1) {
//		return n;
//	}
//	int f1 = fib(n-1);
//	int f2 =  fib(n-2);
//	return f1+f2;
//}
	

}
