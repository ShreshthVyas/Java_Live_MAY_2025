package Lecture6;

import java.util.Scanner;

public class Any_ToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int base  = sc.nextInt();
		int ans =0;
		int mul = 1;
		while(n>0) {
			int digit = n%base;
			ans = ans + digit*mul;
			mul = mul*10;
			n = n/base;
		}
		
		System.out.println(ans);
	}

}
