package Lecture13;

import java.util.Scanner;

public class InPut_OutputDemo {

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
		
		//output
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
