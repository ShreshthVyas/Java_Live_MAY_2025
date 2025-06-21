package Lecture13;

import java.util.Scanner;

public class DecimalTOBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int mul =1;
		while(n>0) {
			int digit = n%2;
			sum = sum+digit*mul;
			mul = mul *10;
			n = n/2;
		}
		
		System.out.println(sum);
	}

}
