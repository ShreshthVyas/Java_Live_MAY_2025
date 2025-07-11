package Lecture19;

import java.util.Scanner;

public class PrintDecreasing {
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n  = sc.nextInt();
		print(n);
	}
	
	public static void print(int n) {
		if(n == -1) {
			return;
		}//base case
		
		System.out.println(n);//sub-problem
		
		print(n-1);//recursive call	
	}
}
