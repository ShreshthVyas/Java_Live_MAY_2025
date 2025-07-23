package Lecture24;

import java.util.Scanner;

public class RatChasesCheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int m =sc.nextInt();
		char arr[][] = new char[n][m];
		
		for (int i = 0; i < arr.length; i++) {
			String s = sc.next();
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		if(arr[arr.length-1][arr[0].length-1] == 'X') {
			System.out.println("NO PATH FOUND");
		}
		else {
			int ans[][] = new int[n][m];
			
			int count = rat(0,0,arr,ans,n,m);
			if(count == 0) {
				System.out.println("NO PATH FOUND");
			}
		}
		
	}

	public static int rat(int cr, int cc, char[][] arr, int[][] ans, int n, int m) {
		// TODO Auto-generated method stub
		if(cr == n-1 && cc == m-1) {//+ve base case
			ans[cr][cc] = 1;
			Display(ans);
			return 1;
		}
		if(cr<0 || cc<0 || cr>=n || cc>=m || arr[cr][cc] == 'X') {//-ve base case
			return 0;
		}
		ans[cr][cc] = 1;
		arr[cr][cc] = 'X';
		int count =0;
		count+= rat(cr+1, cc, arr, ans, n, m);
		count+= rat(cr-1, cc, arr, ans, n, m);
		count+= rat(cr, cc+1, arr, ans, n, m);
		count+= rat(cr, cc-1, arr, ans, n, m);
		ans[cr][cc] = 0;
		arr[cr][cc] = 'O';
		
		return count;
	}

	private static void Display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int[] a : ans) {
			for (int i : a) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("......");
		
	}

}
