package Lecture12;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nos = sc.nextInt();
		int noc = sc.nextInt();
		int stalls[] = new int[nos];
		for (int i = 0; i < stalls.length; i++) {
			stalls[i] = sc.nextInt();
		}
		Arrays.sort(stalls);
		int ans  = binarysearch(noc,nos,stalls);
		System.out.println(ans);
	}

	public static int binarysearch(int noc, int nos, int[] stalls) {
		// TODO Auto-generated method stub
		int lo =1;
		int hi = stalls[stalls.length-1] - stalls[0];
		int ans =0;
		
		while(lo<= hi) {
			int mid = (lo+hi)/2;
			if(isItPossible(mid,noc,stalls)) {
				ans =mid;
				lo =mid+1;
			}
			else {
				hi = mid-1;
			}
		}
		
		return ans;
	}

	

	public static boolean isItPossible(int mid, int noc, int[] stalls) {
		// TODO Auto-generated method stub
		int cpsf = 1; // cows placed so far 
		int prev = stalls[0]; // cow placed  on first stall
		
		for (int i = 1; i < stalls.length; i++) {
			if(stalls[i]- prev>= mid) { // meaning i can place next cow on this idx or stall
				cpsf++;// another cow placed
				prev = stalls[i];
			}
			if(cpsf == noc) {// jitni cows place karni thi wo ho gayi 
				return true;// it is possible to place these cows at mid distance
			}
		}
		return false;
	}

}
