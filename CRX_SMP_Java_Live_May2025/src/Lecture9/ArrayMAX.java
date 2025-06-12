package Lecture9;

import java.util.Scanner;

public class ArrayMAX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int ans  = max(arr);
		
		System.out.println(ans);
		
	}

	public static int max(int[] arr) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
