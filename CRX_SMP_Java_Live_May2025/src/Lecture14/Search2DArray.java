package Lecture14;

import java.util.Scanner;

public class Search2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n =sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		
		//input
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		boolean ans = linearSearch(arr,22);
		System.out.println(ans);
	}

	public static boolean linearSearch(int[][] arr, int target) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] == target) {// target found
					return true;
				}
			}
		}
		return false;
	}

}
