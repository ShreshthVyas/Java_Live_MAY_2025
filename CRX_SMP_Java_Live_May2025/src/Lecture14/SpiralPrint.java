package Lecture14;

import java.util.Scanner;

public class SpiralPrint {

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
		
		spiralPrint(arr);
	}

	public static void spiralPrint(int[][] arr) {
		// TODO Auto-generated method stub
		
		int minR =0;int minC =0;int maxR = arr.length-1; int maxC = arr[0].length-1;
		int total_ele = arr.length * arr[0].length;
		int count =0;
		while(count<total_ele) {
			for (int i = minC;count<total_ele && i <=maxC; i++) {
				System.out.print(arr[minR][i]+" ");
				count++;
			}
			minR++;
			for (int i = minR;count<total_ele && i <=maxR; i++) {
				System.out.print(arr[i][maxC]+" ");
				count++;
			}
			maxC--;
			for (int i = maxC;count<total_ele && i>=minC; i--) {
				System.out.print(arr[maxR][i]+" ");
				count++;
			}
			maxR--;
			for (int i = maxR;count<total_ele && i >=minR; i--) {
				System.out.print(arr[i][minC]+ " ");
				count++;
			}
			minC++;
		}
		
		
	}

}
