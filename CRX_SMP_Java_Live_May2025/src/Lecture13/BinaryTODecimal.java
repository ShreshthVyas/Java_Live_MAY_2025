package Lecture13;

import java.util.Scanner;

public class BinaryTODecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int mul =1;
		while(n>0) {
			int digit = n%10;
			sum = sum+digit*mul;
			mul = mul *2;
			n = n/10;
		}
		
		System.out.println(sum);

	}

}
