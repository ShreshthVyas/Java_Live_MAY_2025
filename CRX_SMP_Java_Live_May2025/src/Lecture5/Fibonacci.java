package Lecture5;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = 0;
		int b = 1;
//		int d =0;
		for (int i = 0;i<n; i++) {
//			System.out.print(a + ", ");
			int c = a+b;
			a = b;
			b = c;
//			d =c;
		}
		
//		System.out.println(a);
		
		
	}

}
