package Lecture12;

import java.util.Scanner;

public class KthRoot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		long n = sc.nextLong();
		
		long ans = rootoptimised(n,k);
		System.out.println(ans);
	}

	public static long rootoptimised(long n, long k) { /// binary search
		// TODO Auto-generated method stub
		long lo =1;
		long hi = n;
		long ans =0;
		while(lo<=hi) {
			long mid = (lo + hi)/2;
			if(Math.pow(mid, k)<=n) {
				ans =mid;
				lo =  mid+1;
			}
			else {
				hi = mid-1;
			}
		}
		return ans;
	}

	public static int root(int n, int k) {
		// TODO Auto-generated method stub
		int ans =0;
		for (int i = 1; i <=n; i++) {
			if(Math.pow(i, k)<=n) {
				ans =i;
			}
			else {
				break;
			}
		}
		return ans;
	}
}
